package LoginA;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXSpinner;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import org.controlsfx.control.ToggleSwitch;

public class ControlLoginFXML {

    public JFXButton buttonMiniz;
    public JFXButton buttoClose;
    public JFXPasswordField passWord;
    public JFXSpinner load;
    public ToggleSwitch buttonActivUser;
    public ToggleSwitch buttonActiveAdm;
    public AnchorPane achoPane;
    public Boolean buttonAtivSpinner = false;
    public Boolean buttonAtivLogar=false;
    public JFXButton buttonLogar;
    public AnchorPane anchoButLogar;

    public void login(InputMethodEvent inputMethodEvent) {
    }
    public void UserLogin(MouseEvent mouseEvent) {
        buttonActivUser.setSelected(true);
        buttonActiveAdm.setSelected(false);

    }
    public void admLogin(MouseEvent mouseEvent) {
        buttonActiveAdm.setSelected(true);
        buttonActivUser.setSelected(false);
    }
    public void minimizAll(ActionEvent actionEvent) {
        buttonMiniz.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent minimX) {

            }
        });
    }
    public void closeAll(ActionEvent actionEvent) {
        System.exit(0);
    }
    public void userEmail(ActionEvent actionEvent) {
    }
    public void userPassW(ActionEvent actionEvent) {
    }
    public JFXButton getButtonMiniz() {
        return buttonMiniz;
    }
    public void setButtonMiniz(JFXButton buttonMiniz) {
        this.buttonMiniz = buttonMiniz;
    }
    public void setLoad(MouseEvent mouseEvent) {
        if(this.getButtonAtivSpinner()==false){
            loadSpanner();
        }
        if(this.getButtonAtivLogar()==false){
                creatButtonLogarLimpar();
        }
    }
    public void loadSpanner(){
        VBox vbox = new VBox(new JFXSpinner());
        AnchorPane.setTopAnchor(vbox,10.0);
        achoPane.getChildren().addAll(vbox);
        setButtonAtivSpinner(true);
    }
    public void creatButtonLogarLimpar(){
        VBox vBoxButLogar = new VBox(new JFXButton("Logar"));
        VBox vBocButLimp = new VBox( new JFXButton("Limpar"));

        AnchorPane.setTopAnchor(vBoxButLogar,10.0);
        AnchorPane.setTopAnchor(vBoxButLogar,10.0);

        anchoButLogar.getChildren().addAll(vBoxButLogar);


        setButtonAtivLogar(true);
    }
    public void Logar(ActionEvent actionEvent) {

    }
    public void userE(ActionEvent actionEvent) {
    }

    //Geter e Seters ;;; Compactos se for adicionar argumentos remover desta parte e coloar a cima.
    public Boolean getButtonAtivSpinner() {return buttonAtivSpinner;}
    public void setButtonAtivSpinner(Boolean buttonAtivSpinner) { this.buttonAtivSpinner = buttonAtivSpinner;  }
    public Boolean getButtonAtivLogar() { return buttonAtivLogar;}
    public void setButtonAtivLogar(Boolean buttonAtivLogar) {this.buttonAtivLogar = buttonAtivLogar;}
}
