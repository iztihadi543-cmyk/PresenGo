package com.mycompany.presengo.controller;

import java.io.IOException;
import javafx.fxml.FXML;
import com.mycompany.presengo.app.App;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
