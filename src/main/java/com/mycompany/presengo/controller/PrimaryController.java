package com.mycompany.presengo.controller;

import java.io.IOException;
import javafx.fxml.FXML;
import com.mycompany.presengo.app.App;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
