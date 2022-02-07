package cl.awakelab.capacitaciones.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection conn = null;

    private Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/capacitaciones", "root", "admin");
            if(conn != null){
                System.out.println("Conexión Correcta!");
            }else{
                System.out.println("Conexión fallida");
            }
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }

    public static Connection getConn(){
        if(conn == null){
            new Conexion();
        }
        return conn;
    }
}
