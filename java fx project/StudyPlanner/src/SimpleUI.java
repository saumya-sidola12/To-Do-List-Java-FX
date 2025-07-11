// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleUI extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create UI components
        Label label = new Label("Enter your name:");
        TextField textField = new TextField();
        Button button = new Button("Say Hello");

        // Set button action
        button.setOnAction(e -> {
            String name = textField.getText();
            label.setText("Hello, " + name + "!");
        });

        // Arrange components in a vertical box
        VBox vbox = new VBox(10, label, textField, button);

        // Create a scene with the VBox
        Scene scene = new Scene(vbox, 300, 200);

        // Set up the stage
        primaryStage.setTitle("Simple JavaFX UI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

