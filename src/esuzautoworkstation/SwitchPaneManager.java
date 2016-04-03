/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esuzautoworkstation;
import java.io.IOException;
import java.util.logging.*;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;


/**
 *
 * @author walla
 */
/** Manages control flow for logins */
public class SwitchPaneManager {
   
    private Scene scene;

    private BaseController controller;

    public SwitchPaneManager(Scene scene) {
      this.scene = scene;
    }

    /*
        HERE Add all switching Panes methods
    */
    public void switchToSelectBrandPane() {
      try {
          this.switchMainPane(FXML_SELECT_BRAND);
      } catch (IOException ex) {
          Logger.getLogger(SwitchPaneManager.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    public void switchToSelectModelPane() {
      try {
          this.switchMainPane(FXML_SELECT_MODEL);
      } catch (IOException ex) {
          Logger.getLogger(SwitchPaneManager.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    /*
        END Add all switching Panes methods
    */
    
    void showHomeScene() {
        try {
            initScene();
        } catch (IOException ex) {
            Logger.getLogger(SwitchPaneManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void initScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_HOME));
        scene.setRoot((Parent) loader.load());
        controller = loader.<FXMLDocumentController> getController();
        ((FXMLDocumentController) controller).initManager(this);    
        ((FXMLDocumentController) controller).switchMainPane("MainPane.fxml");
    }
    
    public void switchMainPane(String fxmlFilepath) throws IOException {
        if (controller == null) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_HOME));
            scene.setRoot((Parent) loader.load());
            controller = loader.<BaseController> getController();
            controller.initManager(this);    
        }
        ((FXMLDocumentController) controller).switchMainPane(fxmlFilepath);
        
    }
    
    //Here add all fxml file path of each mainPane Screen
    public final String FXML_HOME = "FXMLDocument.fxml";
    private final String FXML_SELECT_BRAND = "SelectBrand.fxml";
    private final String FXML_SELECT_MODEL = "SelectModel.fxml";
    
}
