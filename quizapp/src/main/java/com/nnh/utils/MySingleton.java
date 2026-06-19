package com.nnh.utils;


import javafx.scene.control.Alert;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class MySingleton {
    private static MySingleton instance;
    private final Alert alert;
    
    private MySingleton(){
        this.alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("English Quiz App");
        alert.setHeaderText("Thong bao");
        }
    
    public static MySingleton getInstance(){
        if(instance == null)
            instance = new MySingleton();
        return instance;
    }
    
    public void showMsg(String content){
        this.alert.setContentText(content);
        this.alert.show();
    }
    
    
    
    
    
    
}
