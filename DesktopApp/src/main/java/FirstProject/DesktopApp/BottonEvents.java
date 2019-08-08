package FirstProject.DesktopApp;
/**
 * Sample Skeleton for 'MainFrame.fxml' Controller Class
 */

import javafx.scene.control.Button;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BottonEvents {
	private boolean isLogin = false;
	private Pane currentPanel;
	private Stage currentStage;
	
	public void setCurrentStage(Stage currentStage) {
		this.currentStage = currentStage;
	}

	@FXML
	private Button mainPanelBtn;

	@FXML
	private Label panelLabel;

	@FXML
	private Pane rightPane;

	@FXML
	private GridPane dashboardPane;

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="loginId"
	private TextField loginId; // Value injected by FXMLLoader

	@FXML
	private TextField password;

	@FXML
	void aboutUsClick(ActionEvent event) {
		System.out.println("hello");
		loginId.setText("hello");
	}

	@FXML
	void dashboardClick(ActionEvent event) {
		currentPanel.getChildren().clear();
		Button logoutBtn = new Button("logout");
		logoutBtn.setOnAction(e -> { 
			currentStage.close();
			new LoginPanel();
			});
		currentPanel.getChildren().add(logoutBtn);
	}

	@FXML
	void feedbackClick(ActionEvent event) {

	}

	@FXML
	void mainPanelClick(ActionEvent event) throws IOException {
		if (!isLogin)
			return;
		rightPane.getChildren().clear();
		rightPane.getChildren().add((Node) FXMLLoader.load(getClass().getResource("../../fxml/MainPanel.fxml")));
		currentPanel = rightPane;
		mainPanelBtn.setFocusTraversable(true);
	}

	@FXML
	void loginAction(ActionEvent event) throws IOException {
		if (loginId.getText().isEmpty() && password.getText().isEmpty())
			System.out.println("Enter LoginId and Password");
		else if (loginId.getText().contains("yash") && password.getText().contains("yash")) {
			dashboardPane.setVisible(false);
			isLogin = true;
			mainPanelClick(event);
		} else {
			System.out.println("enter valid id and pass : " + loginId.getText() + " : " + password.getText());
		}
	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert loginId != null : "fx:id=\"loginId\" was not injected: check your FXML file 'MainFrame.fxml'.";

	}
}
