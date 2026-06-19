package com.nnh.quizapp;

import com.nnh.utils.MySingleton;
import com.nnh.utils.themes.ThemeTypes;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable {
    @FXML private ComboBox<ThemeTypes> cbThemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
    
    public void QuanLyCauHoi(ActionEvent e){
        MySingleton.getInstance().showMsg("Coming soon...");
    }
    
    public void LuyenTap(ActionEvent e){
        MySingleton.getInstance().showMsg("Coming soon...");
    }
    
    public void LuyenThi(ActionEvent e){
      MySingleton.getInstance().showMsg("Coming soon...");
  }

  
}
