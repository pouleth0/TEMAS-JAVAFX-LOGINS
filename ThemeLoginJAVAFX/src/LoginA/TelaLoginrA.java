package LoginA;
import com.jfoenix.controls.JFXSpinner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class TelaLoginrA extends Application {
    public Stage newStage;
    Scene sceneRoot;
    @Override
    public void start(Stage stageRootStart) throws Exception{
        newStage = new Stage();
        Parent rootFXML = FXMLLoader.load(getClass().getResource("ControlLoginFXML.fxml"));
        sceneRoot = new Scene(rootFXML);
        sceneRoot.setFill(Color.TRANSPARENT);
        stageRootStart.initStyle(StageStyle.TRANSPARENT);
        stageRootStart.setScene(sceneRoot);
        stageRootStart.show();
    }
    public static void main(String[] args) {
        launch(args);
         }
    public void retorN() throws IllegalAccessException, InstantiationException {
        newStage.setIconified(true);
    }
}
