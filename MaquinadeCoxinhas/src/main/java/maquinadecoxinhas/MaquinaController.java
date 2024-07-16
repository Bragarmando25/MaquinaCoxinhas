package maquinadecoxinhas;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class MaquinaController {
    
    @FXML
    private TextField Quantia;
    
    @FXML
    private TextField quantiaAdicionar;
    
    private Coxinhas maquina; 
    
    @FXML
    private void initialize() {
        maquina = new Coxinhas(); 
        Quantia.setText(String.valueOf(maquina.getCoxinhas()));
    }
    
    @FXML
    private void Abastecer() {
        int quantidade = Integer.parseInt(quantiaAdicionar.getText());
        if (quantidade > 0) {
            maquina.abastecer(quantidade);
            Quantia.setText(String.valueOf(maquina.getCoxinhas()));
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Por favor, insira um número válido maior que zero.");
            alert.show();
        }
    }
    
    @FXML
    private void retirar() {
        if (maquina.getCoxinhas() == 0) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Não é possível retirar, máquina vazia!");
            alert.show();
            return; 
        }
        maquina.retirar();
        Quantia.setText(String.valueOf(maquina.getCoxinhas()));
    }
    
    @FXML
    private void zerar() {
        if (maquina.getCoxinhas() == 0) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("A máquina já está vazia!");
            alert.show();
            return; 
        }
        maquina.zerar();
        Quantia.setText(String.valueOf(maquina.getCoxinhas()));
    }
    
    @FXML
    private void sair() {
        Platform.exit();
        System.exit(0);
    }
}
