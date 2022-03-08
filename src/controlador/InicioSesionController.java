/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author nata2
 */
public class InicioSesionController implements Initializable {

    private String tipoUsuario; 
    @FXML
    private Label tipoUsuarioLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        if(tipoUsuario.equals("Estudiante")){
//            tipoUsuarioLabel.setText("ESTUDIANTE");
//        } else{ tipoUsuarioLabel.setText("INSTRUCTOR");}
    }  

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
        if(tipoUsuario.equals("Estudiante")){
            tipoUsuarioLabel.setText("ESTUDIANTE");
        } else{ tipoUsuarioLabel.setText("INSTRUCTOR");}
    }

    @FXML
    private void pulsarInterrogante_Usuario(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "El nombre de usuario debe contener al menos ...");
    }

    @FXML
    private void pulsarInterrogante_Contrasenya(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos 6 cararcteres");
    }
    
    
}
