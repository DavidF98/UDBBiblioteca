/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ale
 */
public class Conexion {
    Connection conectar = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/amigosudb_biblioteca", "root", "");
            System.out.println("Conexion a Base de Datos exitosa");
        } catch (ClassNotFoundException e) {
            System.out.println("Error no encuentro el Driver de la BD:" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error Fallo en SQL" + e.getMessage());
            System.exit(0);
        }
        return conectar;
    }
    
    
}
