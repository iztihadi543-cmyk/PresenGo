module com.mycompany.presengo {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.mycompany.presengo.app;

    opens com.mycompany.presengo.controller to javafx.fxml;
}
