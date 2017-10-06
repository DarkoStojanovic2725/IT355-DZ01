package com.metropolitan.it355.domaci1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
   /** @FXML
    private Label label = new Label();
    public TextField tf1;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String txt = tf1.getText();
        label.setText(reverse(txt));
    }
    **/
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    public String reverse(String source){
    int i, len = source.length();
    StringBuilder dest = new StringBuilder(len);

    for (i = (len - 1); i >= 0; i--){
        dest.append(source.charAt(i));
    }

    return dest.toString();
    }
}
