package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class Controller {

    //Variables
    @FXML
    private TextArea txta_eur;

    @FXML
    CurrencyConverter converter;

    @FXML
    private ChoiceBox<String> cb_convert;

    @FXML
    private TextArea txta_convert;

    //Handler
    @FXML
    void handle_convert(MouseEvent event) {
        if (!txta_eur.getText().equals("")) {
            try {
                txta_convert.setText(String.format("%.4f", converter.convert(Double.parseDouble(txta_eur.getText()), cb_convert.getValue())));
            } catch (Exception e) {
                txta_eur.setText("-1");
                txta_convert.setText("-1");
            }
        }
    }

    //Initializer
    @FXML
    public void initialize() {
        converter=new CurrencyConverter();

        cb_convert.getItems().add("Yen");
        cb_convert.getItems().add("US Dollar");
        cb_convert.getItems().add("Danish Krone");
        cb_convert.getItems().add("Croatian Kuna");
        cb_convert.getItems().add("North Korean Won");
    }

}
