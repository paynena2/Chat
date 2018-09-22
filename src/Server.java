/* Allen Payne
 * Server Class for my chat
 */
//To:Do -> create the actual server, display in the textarea when users join, their usernames, and their IPs. Create threads to send messages to all
//clients and another thread to recieve messages from all clients
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextArea;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void start(Stage primaryStage) {
		//creating the graphics
		Stage stage = new Stage();
		StackPane sPane = new StackPane();
		TextArea serverStatus = new TextArea();
		Scene scene = new Scene(sPane, 500, 500);
		
		//setting the padding along the edges, and making the text area uneditable
		serverStatus.setEditable(false);
		sPane.setPadding(new Insets(20,20,20,20));
		sPane.getChildren().add(serverStatus);
		
		//fixing alignment and showing the stage
		sPane.setAlignment(Pos.CENTER);
		stage.setScene(scene);
		stage.setTitle("Server Status");
		stage.show();
	}
}
