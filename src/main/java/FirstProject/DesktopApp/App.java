package FirstProject.DesktopApp;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Yash khatri!
 *
 */
public class App extends Application{
	
	@Override
	public void start(Stage primary) throws Exception {
		 new LoginPanel();
    }

	public static void main(String[] args) {
		launch(args);
	}
	
	public static CompletableFuture<Void> loading(Pane rightPane,int sec) {
			rightPane.getChildren().clear();
			try {
				Node loadingNode = (Node) FXMLLoader.load(App.class.getClass().getResource("../../fxml/Loading.fxml"));
				StackPane.setAlignment(loadingNode,Pos.CENTER_RIGHT);
				rightPane.getChildren().add(loadingNode);
			} catch (IOException e) {
				e.printStackTrace();
			}

		return null;
	}
}
