/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpidev;

import Entity.Categorie_espece;
import Services.ServiceCategorie_espece;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author TH3OMAR
 */
public class FXMLAfficherCategorie_especeController implements Initializable {

    @FXML
    private TableView<Categorie_espece> categorie_espece;
    public ObservableList<Categorie_espece> cls = FXCollections.observableArrayList();
    public static Categorie_espece ce;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       TableColumn nom = new TableColumn("Nom");
       categorie_espece.getColumns().addAll(nom);
        
        
        
        ServiceCategorie_espece sce = new ServiceCategorie_espece();
        nom.setCellValueFactory(new PropertyValueFactory<Categorie_espece, String>("nom"));
     
     
        try {
         categorie_espece.setItems(sce.getAllCategorie_especes());
        } catch (SQLException ex) {
            Logger.getLogger(FXMLAfficherCategorie_especeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
}
