/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esuzautoworkstation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author walla
 */
public class CollectionPriceController extends BaseController {
    
    @FXML 
    private ListView<String> CollectionPriceInfo;
    
    
    @FXML
    private void handleAction_btnOK(ActionEvent event) throws IOException {
        //GOTO Select Brand
        this.getManager().switchMainPane("DeviceEnquiry.fxml", "CollectionPrice.fxml");
        
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
         ObservableList<String> items = CollectionPriceInfo.getItems();
        items.add("iPhone 6s Plus");
        items.add("外觀: 銀色");
        items.add("儲存設備: 128GB");
        items.add("回收價: $4000.00");
        
    }    
    
}
