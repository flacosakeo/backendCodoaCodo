
package Clases;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "AppServlet", urlPatterns = {"/productos"})
public class AppServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        try{
            Modelo mod=new Modelo();
            req.setAttribute("listaProductos", mod.getProductos());
            req.getRequestDispatcher("/WEB-INF/Productos/productos.jsp").forward(req, resp);
        }catch(SQLException ex){
            ex.printStackTrace();
            resp.sendError(500, "Error al leer la base de datos......."+" "+ex);
        }       
    }

    
   


}
