package a.vkube.controller;

import a.vkube.model.Order;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class GetDriver {

    @FXML
    private ComboBox<Order> comboOrderID;

    @FXML
    private ComboBox<Order> comboDriverID;

    @FXML
    private Button buttonExit;

}