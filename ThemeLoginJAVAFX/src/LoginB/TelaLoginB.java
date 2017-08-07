package LoginB;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sun.rmi.server.LoaderHandler;
/*** Created by kn0w on 8/3/17 ***/
public class TelaLoginB  extends Application{
     private Scene sceneRoot;
    @Override
    public void start(Stage stageRoot) throws Exception {
        Parent rootFXML = FXMLLoader.load(getClass().getResource("ControlLoginFXML.fxml"));
        sceneRoot = new Scene(rootFXML);
        sceneRoot.setFill(Color.TRANSPARENT);
        stageRoot.initStyle(StageStyle.TRANSPARENT);
        stageRoot.setScene(sceneRoot);
        stageRoot.show();
    }
//metodo main auto
    public static void main(String[] args) { launch(args); }
}
