/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author HRD-LAB1
 */
public class Main {
    public static void main(String[] args) {
        Db d = new Db();
        d.loadConnection();
        LoginPage l = new LoginPage();
        l.setVisible(true);
//        HomePage h = new HomePage();
//        h.setVisible(true);
    }
}
