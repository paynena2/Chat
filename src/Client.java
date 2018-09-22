/* Made by Allen Payne
 *  this will be the client class for my chat program
 */
//Graphics imports
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

//Communication imports
import java.io.IOException;
import java.net.Socket;

public class Client extends Application{
	String userName;
	
	public static void main(String[] args){
		Application.launch();
	}
	
	public void start(Stage primaryStage) throws IOException {
		/*/setting up connection to the server
		/final String serverAddress = "localhost";
		final int port = 81;
		Socket connection = new Socket(serverAddress, port);
		*/
		
		//graphics
		Stage stage = new Stage();
		StackPane connectionMenu = new StackPane();
		Scene connectionScene = new Scene(connectionMenu,500,500);
		
		VBox menu = new VBox();
		HBox ipBox = new HBox();
		HBox portBox = new HBox();
		HBox userBox = new HBox();
		
		Label connectionTitle = new Label("Allen's Chat Login ");
		Label ip =            new Label("IP:       ");
		Label port =          new Label("Port:     ");
		Label userNameLabel = new Label("Username: ");
		
		TextField serverAddressInput = new TextField();
		TextField serverPortInput = new TextField();
		TextField userNameInput = new TextField();
		Button connectionSubmit = new Button();
		
		connectionMenu.setPadding(new Insets(100,100,100,100));
		menu.setSpacing(75);
		ipBox.getChildren().addAll(ip, serverAddressInput);
		ipBox.setAlignment(Pos.CENTER);
		portBox.getChildren().addAll(port, serverPortInput);
		portBox.setAlignment(Pos.CENTER);
		userBox.getChildren().addAll(userNameLabel,userNameInput);
		userBox.setAlignment(Pos.CENTER);
		connectionTitle.setFont(Font.font("TIMES_NEW_ROMAN", FontWeight.BOLD, 24));
		serverAddressInput.setPromptText("Enter the IP for the server: ");
		serverPortInput.setPromptText("Enter the port for the server: ");
		menu.getChildren().addAll(connectionTitle, ipBox, portBox, userBox);
		connectionMenu.getChildren().add(menu);
		menu.setAlignment(Pos.CENTER);
		
		
		stage.setScene(connectionScene);
		stage.setTitle("Allen's Chat");
		stage.show();
		
	}
}
