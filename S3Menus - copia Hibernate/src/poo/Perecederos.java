/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mauro Sanchez2
 */
@Entity
@Table(name = "perecederos")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Perecederos.findAll", query = "SELECT p FROM Perecederos p")
    , @NamedQuery(name = "Perecederos.findByFolio", query = "SELECT p FROM Perecederos p WHERE p.folio = :folio")
    , @NamedQuery(name = "Perecederos.findByNombre", query = "SELECT p FROM Perecederos p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Perecederos.findByExistencias", query = "SELECT p FROM Perecederos p WHERE p.existencias = :existencias")
    , @NamedQuery(name = "Perecederos.findByFechaCad", query = "SELECT p FROM Perecederos p WHERE p.fechaCad = :fechaCad")
})
public class Perecederos implements Serializable
{

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "folio")
    private Integer folio;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "existencias")
    private int existencias;
    @Basic(optional = false)
    @Column(name = "fechaCad")
    private String fechaCad;

    public Perecederos()
    {
    }

    public Perecederos(Integer folio)
    {
        this.folio = folio;
    }

    public Perecederos(Integer folio, String nombre, int existencias, String fechaCad)
    {
        this.folio = folio;
        this.nombre = nombre;
        this.existencias = existencias;
        this.fechaCad = fechaCad;
    }

    public Integer getFolio()
    {
        return folio;
    }

    public void setFolio(Integer folio)
    {
        Integer oldFolio = this.folio;
        this.folio = folio;
        changeSupport.firePropertyChange("folio", oldFolio, folio);
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public int getExistencias()
    {
        return existencias;
    }

    public void setExistencias(int existencias)
    {
        int oldExistencias = this.existencias;
        this.existencias = existencias;
        changeSupport.firePropertyChange("existencias", oldExistencias, existencias);
    }

    public String getFechaCad()
    {
        return fechaCad;
    }

    public void setFechaCad(String fechaCad)
    {
        String oldFechaCad = this.fechaCad;
        this.fechaCad = fechaCad;
        changeSupport.firePropertyChange("fechaCad", oldFechaCad, fechaCad);
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (folio != null ? folio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perecederos))
        {
            return false;
        }
        Perecederos other = (Perecederos) object;
        if ((this.folio == null && other.folio != null) || (this.folio != null && !this.folio.equals(other.folio)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "poo.Perecederos[ folio=" + folio + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener)
    {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener)
    {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
