package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.text.NumberFormat;

public class Controller {

    @FXML
    private Label eur;

    @FXML
    private TextArea txta_eur;

    @FXML
    private Button convert;

    @FXML
    private Label yen;

    @FXML
    private TextArea txta_yen;

    @FXML
    void handle_convert(MouseEvent event) {
        double eur=-1;
        double yen=-1;
        CurrencyConverter converter=new CurrencyConverter();

        try {
            if ((!txta_eur.getText().equals("") && txta_yen.getText().equals("")) || (!txta_eur.getText().equals("") && !txta_yen.getText().equals(""))) {
                yen=converter.convertEurToYen(Double.parseDouble(txta_eur.getText()));
                txta_yen.setText(String.format("%.2f", yen));
            } else if (txta_eur.getText().equals("") && !txta_yen.getText().equals("")) {
                eur = converter.convertYenToEur(Double.parseDouble(txta_yen.getText()));
                txta_eur.setText(String.format("%.2f", eur));
            }
        }catch(Exception ignored){
            txta_eur.setText("" + eur);
            txta_yen.setText("" + yen);
        }

    }
}
