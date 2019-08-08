package FirstProject.DesktopApp;

import javafx.application.Application;
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
}
