/* Made by Allen Payne
 *  this will be the client class for my chat program
 */
//Graphics imports
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

//Communication imports
import java.io.IOException;
import java.net.Socket;

public class Client extends Application{
	String userName;
	
	public static void main(String[] args){
		Application.launch();
	}
	
	public void start(Stage primaryStage) throws IOException {
		final String serverAddress = "localhost";
		final int port = 81;
		Socket connection = new Socket(serverAddress, port);
	}
}