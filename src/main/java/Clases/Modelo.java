
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Modelo {
    

    //public Modelo(){ 
    //}
    

    
    public ArrayList<Producto> getProductos()throws SQLException{
        ArrayList<Producto> productos = new ArrayList<>();
        Connection con = Conexion.getConnection();
        String sql="select * from productos";
        PreparedStatement csql = con.prepareStatement(sql);
        ResultSet rs = csql.executeQuery();
        while (rs.next()){
            String codigo = rs.getString(1);
            String nombre = rs.getString(2);
            int rating = rs.getInt(3);
            double precio = rs.getDouble(4);
            String foto = rs.getString(5);
            productos.add (new Producto(codigo,nombre,rating,precio,foto));
        }
        return productos;
    }
}
