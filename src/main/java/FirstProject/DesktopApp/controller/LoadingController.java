package FirstProject.DesktopApp.controller;

import java.util.concurrent.CompletableFuture;

import com.gluonhq.charm.glisten.control.ProgressIndicator;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class LoadingController {

	@FXML
	private Pane loadingPane;

	@FXML
	private ProgressIndicator loading;

	public LoadingController() {
		CompletableFuture.runAsync(() -> {
			try {
				Thread.sleep(3000);
				loading.setVisible(false);
//				loading.getParent()
				loadingPane.getChildren().clear();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}
}
