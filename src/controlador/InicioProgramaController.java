/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nata2
 */
public class InicioProgramaController implements Initializable {


    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pulsarInstructor(ActionEvent event) throws IOException {
        String tipoUsuario = "Instructor"; 
        FXMLLoader loader = new FXMLLoader(); 
        
        loader.setLocation(getClass().getResource("/vista/InicioSesion.fxml"));
        loader.load();
        InicioSesionController inicio = loader.getController();
        inicio.setTipoUsuario(tipoUsuario);
        Parent p = loader.getRoot();
        Stage s = new Stage();
        s.setScene(new Scene(p));
        s.show();
    }

    @FXML
    private void pulsarRegistrar(ActionEvent event) throws IOException {
        initData("Instructor"); 
    }

    @FXML
    private void pulsarEstudiante(ActionEvent event) throws IOException {
        initData("Estudiante"); 
    }
    
    public void initData(String usuario) throws IOException{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/InicioSesion.fxml"));
        Parent root =(Parent) loader.load();
            
        InicioSesionController inicio = loader.<InicioSesionController>getController();
        inicio.setTipoUsuario(usuario);
        
        Scene scene = new Scene (root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("");
        stage.initModality(Modality.APPLICATION_MODAL); 
        stage.show();

        

    }


    
    
    
}
