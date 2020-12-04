import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public  class AppInitializer extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL resource = this.getClass().getResource("MainForm.fxml");// catch //alt + Enter -> to assign a local variable

        // load using FXMLLoader java class
        // alt + Enter -> to assign reference variable
        Parent load = FXMLLoader.load(resource);

        //make a new scene from using loaded load
        Scene scene = new Scene(load);

        //set the scene and show
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
