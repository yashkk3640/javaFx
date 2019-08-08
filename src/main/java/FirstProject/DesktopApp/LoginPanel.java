package FirstProject.DesktopApp;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginPanel {

	public LoginPanel() {
		Stage primaryStage = new Stage();
		FXMLLoader screenLoader = new FXMLLoader(getClass().getResource("../../fxml/LoginFrame.fxml"));
		try {
			Parent root = screenLoader.load();
			((BottonEvents) screenLoader.getController()).setCurrentStage(primaryStage);
			primaryStage.setTitle("First JavaFx");
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public Stage showLoginPanel() throws IOException {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("../../fxml/LoginFrame.fxml"));
		primaryStage.setTitle("First JavaFx");

		// grab your root here
//        root.setOnMousePressed(event -> {
//            x = event.getSceneX();
//            y = event.getSceneY();
//        });
//
//        //move around here
//        root.setOnMouseDragged(event -> {
//            stage.setX(event.getScreenX() - x);
//            stage.setY(event.getScreenY() - y);
//        });

		primaryStage.setScene(new Scene(root));
		return primaryStage;
	}
}
