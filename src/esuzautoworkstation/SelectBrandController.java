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
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author walla
 */
public class SelectBrandController extends BaseController {
    @FXML
    ImageView btnSelectBrandApple;
    
    @FXML
    private void handleMouseClick_btnSelectBrandApple(MouseEvent event) throws IOException {
        System.out.println("btnSelectBrandApple click!");
        //GOTO Select Brand
        this.getManager().switchMainPane("SelectModel.fxml");
        
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
       
    }    
    
}
