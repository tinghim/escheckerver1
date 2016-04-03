/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esuzautoworkstation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

/**
 *
 * @author walla
 */
public class FXMLDocumentController extends BaseController {
    
    @FXML
    private Label lblMessage;
    
    @FXML
    private Pane pneHeader;
    
    @FXML
    private Pane pneMainPanel;
    
    @FXML
    private Pane pneFooter;
  
    @FXML
    private Button btnBack;
    
    @FXML
    private void handleAction_btnBack(ActionEvent event) throws IOException {
        //GOTO Select Brand
        System.out.println("FXMLDocumentController btnBack click");
        this.getManager().backToPrevPane();
    }
    
    //interact with SwithPaneManager to change the pane in main
    public void switchMainPane(String fxmlFilePath) throws IOException {
        System.out.println("FXMLDocumentController switchMainPane " + fxmlFilePath  );
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFilePath));
        Pane pane = (Pane)loader.load();

        BaseController controller = (BaseController) loader.getController();
        controller.initManager(getManager());  
        
        pneMainPanel.getChildren().clear();
        pneMainPanel.getChildren().add(pane);
        
//
//        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFilePath));
//        
//        Parent root = (Parent) loader.load();
//        BaseController controller = loader.<BaseController> getController();
//        controller.initManager(getManager());   
//        pneMainPanel.getChildren().clear();
//        pneMainPanel.getChildren().add((Node)root);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }  


    
    
    
}
