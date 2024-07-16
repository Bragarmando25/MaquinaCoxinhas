module maquinadecoxinhas {
    requires javafx.controls;
    requires javafx.fxml;

    opens maquinadecoxinhas to javafx.fxml;
    exports maquinadecoxinhas;
}
