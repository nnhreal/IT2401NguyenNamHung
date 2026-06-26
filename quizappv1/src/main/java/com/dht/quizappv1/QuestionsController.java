/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.dht.quizappv1;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
//            // b1 nap driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //b2 mo ket noi
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/quizdb", "root", "root");
            
            //b3 thuc thi truy van
            String sql = "SELECT * FROM category";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs .next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                
                System.err.printf("%d - %s\n", id, name);
            }
            
            //b4 dong ket noi
            conn.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }    
    
}
