/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import poo.exceptions.NonexistentEntityException;

/**
 *
 * @author Mauro Sanchez2
 */
public class PerecederosJpaController implements Serializable
{

    public PerecederosJpaController(EntityManagerFactory emf)
    {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager()
    {
        return emf.createEntityManager();
    }

    public void create(Perecederos perecederos)
    {
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(perecederos);
            em.getTransaction().commit();
        } finally
        {
            if (em != null)
            {
                em.close();
            }
        }
    }

    public void edit(Perecederos perecederos) throws NonexistentEntityException, Exception
    {
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            perecederos = em.merge(perecederos);
            em.getTransaction().commit();
        } catch (Exception ex)
        {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0)
            {
                Integer id = perecederos.getFolio();
                if (findPerecederos(id) == null)
                {
                    throw new NonexistentEntityException("The perecederos with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally
        {
            if (em != null)
            {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException
    {
        EntityManager em = null;
        try
        {
            em = getEntityManager();
            em.getTransaction().begin();
            Perecederos perecederos;
            try
            {
                perecederos = em.getReference(Perecederos.class, id);
                perecederos.getFolio();
            } catch (EntityNotFoundException enfe)
            {
                throw new NonexistentEntityException("The perecederos with id " + id + " no longer exists.", enfe);
            }
            em.remove(perecederos);
            em.getTransaction().commit();
        } finally
        {
            if (em != null)
            {
                em.close();
            }
        }
    }

    public List<Perecederos> findPerecederosEntities()
    {
        return findPerecederosEntities(true, -1, -1);
    }

    public List<Perecederos> findPerecederosEntities(int maxResults, int firstResult)
    {
        return findPerecederosEntities(false, maxResults, firstResult);
    }

    private List<Perecederos> findPerecederosEntities(boolean all, int maxResults, int firstResult)
    {
        EntityManager em = getEntityManager();
        try
        {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Perecederos.class));
            Query q = em.createQuery(cq);
            if (!all)
            {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally
        {
            em.close();
        }
    }

    public Perecederos findPerecederos(Integer id)
    {
        EntityManager em = getEntityManager();
        try
        {
            return em.find(Perecederos.class, id);
        } finally
        {
            em.close();
        }
    }

    public int getPerecederosCount()
    {
        EntityManager em = getEntityManager();
        try
        {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Perecederos> rt = cq.from(Perecederos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally
        {
            em.close();
        }
    }
    
}
