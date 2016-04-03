/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esuzautoworkstation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author walla
 */
public class SelectModelController extends BaseController {
    @FXML
    private void handleMouseClick_btnSelectIphone6sp(MouseEvent event) throws IOException {
        System.out.println("btnSelectBrandApple click!");
        //GOTO Select Brand
        this.getManager().switchMainPane("SelectModelDetail.fxml", "SelectModel.fxml");
        
    }
        
}
