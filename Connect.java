/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HRD-LAB1
 */
public class Connect {
    public void insertDataSignUp(SignUp Obj) {
        try {
            String query = "insert into login values(?,?,?,?,?)";
            PreparedStatement ps = Db.conn.prepareStatement(query);
            ps.setString(1, Obj.getName());
            ps.setString(2, Obj.getPhoneNo());
            ps.setString(3, Obj.getEmail());
            ps.setString(4, Obj.getPassword());
            ps.setString(5, Obj.getConfirmPassword());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registered Successful");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e + "");
        }
    }
    
    public boolean checkLogin(String email, String password) {
        boolean isValidUser = false;
        try {
            String query1 = "select email, password from login where email = ? AND password = ?";
            PreparedStatement st = Db.conn.prepareStatement(query1);
            st.setString(1, email);
            st.setString(2, password); 
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                isValidUser = true;
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "");
        }
        return isValidUser;
    }
    
    public void insertDataBooking(Home Obj2) {
        try {
            String query2 = "insert into booking values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement qr = Db.conn.prepareStatement(query2);
            qr.setString(1, Obj2.getFirstName());
            qr.setString(2, Obj2.getLastName());
            qr.setString(3, Obj2.getGender());
            qr.setString(4, Obj2.getRoomType());
            qr.setString(5, Obj2.getGuestsQty());
            qr.setString(6, Obj2.getArrivalDate());
            qr.setString(7, Obj2.getArrivalMonth());
            qr.setString(8, Obj2.getArrivalYear());
            qr.setString(9, Obj2.getArrivalTime());
            qr.setString(10, Obj2.getDepartDate());
            qr.setString(11, Obj2.getDepartMonth());
            qr.setString(12, Obj2.getDepartYear());
            qr.setString(13, Obj2.getDepartTime());
            qr.setString(14, Obj2.getPickup());
            qr.setString(15, Obj2.getRequest());
            qr.executeUpdate();
            JOptionPane.showMessageDialog(null, "Hotel Booked Successfully!");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e + "");
        }
    }
}
