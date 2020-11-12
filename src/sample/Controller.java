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

        if ((!txta_eur.getText().equals("") && txta_yen.getText().equals("")) || (!txta_eur.getText().equals("") && !txta_yen.getText().equals(""))){
            try{
                eur=Double.parseDouble(txta_eur.getText());
                yen=eur*124;
            }catch (Exception ignored){

            }
        }
        else if (txta_eur.getText().equals("") && !txta_yen.getText().equals("")){
            try{
                yen=Double.parseDouble(txta_yen.getText());
                eur=yen/124;
            }catch (Exception ignored){

            }
        }
        if (eur!=-1 && yen!=-1) {
            txta_eur.setText("" + eur);
            txta_yen.setText("" + yen);
        }

    }
}
