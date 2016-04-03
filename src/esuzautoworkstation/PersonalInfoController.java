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
public class PersonalInfoController extends BaseController {

    @FXML
    private void handleAction_btnOK(ActionEvent event) throws IOException {
        //GOTO Select Brand
        //submit personal info to server and goto EnquiredPrice.fxml
        this.getManager().switchMainPane("EnquiredPrice.fxml", "PersonalInfo.fxml");
        
    }
    
    @FXML
    private void handleAction_btnSkip(ActionEvent event) throws IOException {
        //goto EnquiredPrice.fxml
        this.getManager().switchMainPane("EnquiredPrice.fxml", "PersonalInfo.fxml");
        
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
