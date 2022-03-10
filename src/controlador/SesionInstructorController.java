/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nata2
 */
public class SesionInstructorController implements Initializable {

    @FXML
    private Label instructor;
    @FXML
    private Button quizAleatorioButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void quizAleatorioButtonClicked(ActionEvent event) throws IOException {
        /**
         * TODO:
         * Abrir una ventana que pide numero de preguntas y tema
         * (o bien preguntas sin ningun tema concreto de toda la bateria)
         * 
         * Crear un nuevo quiz
         * 
         * Mostrar el nuevo quiz en una nueva ventana
         */
        
        FXMLLoader miCargador = new FXMLLoader(getClass().getResource("vista/DatosCrearAleatorio.fxml"));
        Parent root = miCargador.load();
        
        DatosCrearAleatorioController controlador = miCargador.getController();
        
        Scene scene = new Scene(root, 400, 400);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Crear un quiz aleatorio");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }
    
}
