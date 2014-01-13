/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.rafaelaznar.operaciones;

import com.google.gson.Gson;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.rafaelaznar.dao.*;
import net.rafaelaznar.helper.Conexion;

/**
 *
 * @author Crash
 */
public class ProductoGetcolumns implements GenericOperation {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
               ArrayList<String> alColumns = null;
        try {
            ProductoDao_Mysql oProductoDAO = new ProductoDao_Mysql(Conexion.getConection());
            alColumns = oProductoDAO.getColumnsNames();
            String data = new Gson().toJson(alColumns);
            data = "{\"data\":" + data + "}";
            return data;
        } catch (Exception e) {
            throw new ServletException("ProductoGetcolumnsJson: View Error: " + e.getMessage());
        }
    }
    
}
