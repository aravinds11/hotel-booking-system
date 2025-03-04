/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HRD-LAB1
 */
public class Db {
    public static Connection conn = null;
    public static void loadConnection() {
        String url = "jdbc:mysql://localhost:3306/project";
        String root = "root";
        String pass = "1234";
        try {
            conn = DriverManager.getConnection(url, root, pass);
            if(conn != null) {
                System.out.println("Database Connected");
            }
        }
        catch(Exception e) {
            System.out.println(e + "");
        }
    }
}
