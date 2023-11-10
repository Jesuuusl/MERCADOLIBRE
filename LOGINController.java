/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package VISTA;

import com.sun.jdi.connect.spi.Connection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author LUIS ANGEL FLOREZ
 */
public class LOGINController implements Initializable {

    @FXML
    private TextField txt_user;
    @FXML
    private Button btningresar;
    @FXML
    private Hyperlink link_olvpasw;
    @FXML
    private PasswordField txt_pasw;
    @FXML
    private TextField txt_userre;
    @FXML
    private Button btnregistrar;
    @FXML
    private ComboBox<String> combo_pregun;
    @FXML
    private PasswordField txt_paswre;
    @FXML
    private TextField res_combo;
    @FXML
    private Button nv_cuen;
    
    @FXML
    private Button cuen_ready;
    @FXML
    private AnchorPane pagbtncrear;
    
    private Connection connect;
 
      List<String> opciones = new ArrayList<>();
       
  
  
    
    
    public void cambiopagina(ActionEvent event){
        
        TranslateTransition slider = new TranslateTransition();
    
        if (event.getSource() == nv_cuen){
            
            slider.setNode(pagbtncrear);
            slider.setToX(300);
            slider.setDuration(javafx.util.Duration.seconds(.5));
            
            
            slider.setOnFinished((t) -> {
                
                cuen_ready.setVisible(true);
                nv_cuen.setVisible(false);
                
                
            });
            
            slider.play();
            
        }else if (event.getSource() == cuen_ready) {
            slider.setNode(pagbtncrear);
            slider.setToX(0);
            slider.setDuration(javafx.util.Duration.seconds(.5));
            
            
            slider.setOnFinished((t) -> {
                
                cuen_ready.setVisible(false);
                nv_cuen.setVisible(true);
                
                
            });
            
            slider.play();
            
            
            
            
            
        }
    
    
    
    
    
    }
    
    public void regbtn(){
    
        if (txt_userre.getText().isEmpty() || txt_paswre.getText().isEmpty()|| combo_pregun.getSelectionModel().getSelectedItem() ) {
            
        }
        
        
    
    
    
    
    }
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        opciones.add("¿CUANDO CUMPLES AÑOS?");
        opciones.add("¿EN QUE LUGAR NACISTE?");
        opciones.add("¿CUANTOS AÑOS TIENES?");


        
        combo_pregun.setItems(FXCollections.observableArrayList(opciones));
        // TODO
    }    
    
}
