/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esuzautoworkstation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author walla
 */
public class MainPaneController extends BaseController {

     @FXML
    private void handleButtonAction_btnCheckPrice(ActionEvent event) throws IOException {
        System.out.println("btnCheckPrice click!");
        //GOTO Select Brand
        getManager().switchToSelectBrandPane();
        
    }
    
    @FXML
    private void handleButtonAction_btnCheckDevice(ActionEvent event) throws IOException {
        System.out.println("btnCheckDevice click!");
        
    }
   
    
}
