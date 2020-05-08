/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import cjb.ci.Mensaje;
import com.mysql.cj.PerConnectionLRUFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import poo.bd.Conexion;
import s3.Perecederos;

/**
 *
 * @author Mauro Sanchez2
 */
public class ManipulaDB
{

    private static Conexion con = new Conexion();

    public static Connection conecta(JFrame jf)
    {
        try
        {
            return con.Conecta("localhost:3306", "s4productos",
                    "root", "", 2);
        } catch (Exception ex)
        {
            Mensaje.error(jf, "No se pudo conectar a la BD, " + ex.toString());
            return null;
        }
    }

    public static void desconecta(Connection conn)
    {
        con.desconectar(conn);
    }

    public static ArrayList<Perecederos> cargaP(ArrayList<Object> reg)
    {
        try
        {
            ArrayList<Perecederos> v = new ArrayList<>();
            for (int i = 0; i < reg.size(); i += 4)
            {
                
                String folioS = (String) reg.get(i);
                if (folioS != "" && folioS != " ")
                {
                    int folio = Integer.parseInt(folioS.trim());
                    String nom = ((String) reg.get(i + 1)).trim();
                    int existencias = Integer.parseInt(((String) reg.get(i + 2)).trim());
                    String fechaCad = ((String) reg.get(i + 3)).trim();
                    Perecederos obj = new Perecederos(fechaCad, nom, existencias);
                    obj.setFolio(folio);
                    v.add(obj);
                }
            }
            return v;
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static String consultaP(ArrayList<Perecederos> obj)
    {
        if (obj != null)
        {
            String s = "";
            for (int i = 0; i < obj.size(); i++)
            {
                s += obj.get(i).desp();
            }
            return s;
        } else
        {
            return "no hay datos encontrados";
        }
    }

}
