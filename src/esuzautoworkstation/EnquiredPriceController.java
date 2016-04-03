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
public class EnquiredPriceController extends BaseController {

    @FXML 
    private ListView<String> CollectionPriceInfo;
     
    @FXML
    private void handleAction_btnOK(ActionEvent event) throws IOException {
        //GOTO Select Brand
        //submit personal info to server and goto EnquiredPrice.fxml
        this.getManager().switchMainPane("MainPane.fxml","EnquiredPrice.fxml");
        
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO 
        ObservableList<String> items = CollectionPriceInfo.getItems();
        items.add("iPhone 6s Plus 產品總結");
        items.add("正常開關: 是");
        items.add("正常顯示器: 是");
        items.add("正常按鈕: 是");
        items.add("正常外觀: 是");
        items.add("液體損壞: 是");
        items.add("正常相機: 否");
        
    }    
    
}
