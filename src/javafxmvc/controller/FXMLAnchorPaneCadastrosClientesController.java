/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmvc.controller;

import java.net.URL;
import java.sql.Connection;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
//import javafxmvc.model.dao.ClienteDAO;
//import javafxmvc.model.database.Database;
//import javafxmvc.model.database.DatabaseFactory;
//import javafxmvc.model.domain.Cliente;

public class FXMLAnchorPaneCadastrosClientesController implements Initializable {

    //@FXML
    //private TableView<Cliente> tableViewClientes;
    //@FXML
    //private TableColumn<Cliente, String> tableColumnClienteNome;
    //@FXML
   // private TableColumn<Cliente, String> tableColumnClienteCPF;
    @FXML
    private Button buttonInserir;
    @FXML
    private Button buttonAlterar;
    @FXML
    private Button buttonRemover;
    @FXML
    private Label labelClienteCodigo;
    @FXML
    private Label labelClienteNome;
    @FXML
    private Label labelClienteCPF;
    @FXML
    private Label labelClienteTelefone;

@Override
   public void initialize(URL url, ResourceBundle rb) {


    }

}

