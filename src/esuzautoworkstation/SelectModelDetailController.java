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
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author walla
 */
public class SelectModelDetailController extends BaseController {
    @FXML
    private void handleAction_btnSelect128GB(ActionEvent event) throws IOException {
        System.out.println("btnSelectBrandApple click!");
        //GOTO Select Brand
        this.getManager().switchMainPane("CollectionPrice.fxml","SelectModelDetail.fxml");
        
    }
     
    
}
