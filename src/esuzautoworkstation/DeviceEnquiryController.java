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

/**
 * FXML Controller class
 *
 * @author walla
 */
public class DeviceEnquiryController extends BaseController {

    @FXML
    private void handleAction_btnOK(ActionEvent event) throws IOException {
        //GOTO Select Brand
       this.getManager().switchMainPane("PersonalInfo.fxml","DeviceEnquiry.fxml");
       
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

 
    
}
