package Clases;

import java.sql.SQLException;
import java.sql.Connection;
import org.apache.commons.dbcp2.BasicDataSource;


public class Conexion {
    private static final String URL_DB="jdbc:mysql://localhost:3306/carrito?serverTimeZone=UTC&userSSL=false";
    
    private static BasicDataSource dataSource;
    
    private Conexion(){
    }
    
    private static BasicDataSource getDataSource(){
        if (dataSource==null){
            try{
                dataSource=new BasicDataSource();
                dataSource.setUrl(URL_DB);
                dataSource.setInitialSize(10);
            }catch(Exception ex){
                throw new RuntimeException("Error al leer la base de datos",ex);
            }        
        }
        return dataSource;
    }
    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
    }
}
