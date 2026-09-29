package dk.sea.simplelommeregner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextField txtResult;
    @FXML
    public Button btnClear;
    @FXML
    public Button btnPlusMinus;
    @FXML
    public Button btnPercentage;
    @FXML
    public Button btnDivide;
    @FXML
    public Button bntMultiply;
    @FXML
    public Button btnMinus;
    @FXML
    public Button btnPlus;
    @FXML
    public Button btnComma;
    @FXML
    public Button btnEqual;
    @FXML
    public Button btnZero;
    @FXML
    public Button btnOne;
    @FXML
    public Button btnTwo;
    @FXML
    public Button btnThree;
    @FXML
    public Button btnFour;
    @FXML
    public Button btnFive;
    @FXML
    public Button btnSix;
    @FXML
    public Button btnSeven;
    @FXML
    public Button btnEight;
    @FXML
    public Button btnNine;

    private int NumberOne;
    private int NumberTwo;

    public void onBtnClearClick(ActionEvent actionEvent) {
    }

    public void onBtnPlusMinusClick(ActionEvent actionEvent) {
        txtResult.setText(txtResult.getText() +"±");
    }

    public void onBtnPercantagClick(ActionEvent actionEvent) {
        txtResult.setText(txtResult.getText() +"%");
    }

    public void onBtnDivideClick(ActionEvent actionEvent) {
        txtResult.setText(txtResult.getText() +"/");
    }

    public void onBtnMultiplyClick(ActionEvent actionEvent) {
        txtResult.setText(txtResult.getText() +"X");
    }
    public void onBtnMinusClick(ActionEvent actionEvent) {
        txtResult.setText(txtResult.getText() +"-");
    }

    public void onBtnPlusClick(ActionEvent actionEvent) {
        txtResult.setText(txtResult.getText() +"+");
    }

    public void onBtnCommaClick(ActionEvent actionEvent) {
        txtResult.setText(txtResult.getText() +",");
    }

    public void onBtnEqualClick(ActionEvent actionEvent) {

            if(txtResult.getText() == "+")
            {
                txtResult.setText
                        (Integer.parseInt(String.valueOf(NumberOne)) + Integer.parseInt(String.valueOf(NumberTwo)) + "");
            }
            else if(txtResult.getText() == "-"){
                txtResult.setText( Integer.parseInt(String.valueOf(NumberOne)) - Integer.parseInt(String.valueOf(NumberTwo)) + "");
            }
            else if(txtResult.getText().equals("X")){
                txtResult.setText( Integer.parseInt(String.valueOf(NumberOne)) * Integer.parseInt(String.valueOf(NumberTwo)) + "");
            }
            else if(txtResult.getText().equals("/")){
                txtResult.setText( Integer.parseInt(String.valueOf(NumberOne)) / Integer.parseInt(String.valueOf(NumberTwo)) + "");
            }
    }

    public void onBtnZeroClick(ActionEvent actionEvent) {
        txtResult.setText(txtResult.getText() +"0");
    }

    public void onBtnOneClick(ActionEvent actionEvent) {
        txtResult.setText(txtResult.getText() +"1");
    }

    public void onBtnTwoClick(ActionEvent actionEvent) {
        txtResult.setText(txtResult.getText() +"2");
    }

    public void onBtnThreeClick(ActionEvent actionEvent) {
        txtResult.setText(txtResult.getText() +"3");
    }

    public void onBtnFourClick(ActionEvent actionEvent) {
        txtResult.setText(txtResult.getText() +"4");
    }

    public void onBtnFiveClick(ActionEvent actionEvent) {
        txtResult.setText(txtResult.getText() +"5");
    }

    public void onBtnSixClick(ActionEvent actionEvent) {
        txtResult.setText(txtResult.getText() +"6");
    }

    public void onBtnSevenClick(ActionEvent actionEvent) {
        txtResult.setText(txtResult.getText() +"7");
    }

    public void onBtnEightClick(ActionEvent actionEvent) {
        txtResult.setText(txtResult.getText() +"8");
    }

    public void onBtnNineClick(ActionEvent actionEvent) {
        txtResult.setText(txtResult.getText() +"9");
    }





}

