package FirstProject.DesktopApp.controller;

import javafx.event.ActionEvent;
//import com.gluonhq.charm.glisten.control.ProgressIndicator;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class MainPanelController {

    @FXML
    private Pane mainPanel;

    @FXML
    private Label panelLabel;


    @FXML
    void clickmeBtn(ActionEvent event) {
    	System.out.println("Click me");
    }
//    public MainPanelController() {
//    	CompletableFuture.runAsync(() -> { 
//			try {
//				Thread.sleep(3000);
//				loading.setVisible(false);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		});
//	}
}
