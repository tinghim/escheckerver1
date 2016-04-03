/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esuzautoworkstation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
  
/**
 *
 * @author walla
 */
public abstract class BaseController  implements Initializable{

    
    SwitchPaneManager spManager;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void initManager(final SwitchPaneManager spManager) {
        //System.out.println("initManager!");
        this.spManager = spManager;
    }
    
    public SwitchPaneManager getManager(){
        return spManager;
    }
    

}
