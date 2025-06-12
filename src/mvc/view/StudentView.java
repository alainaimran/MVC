/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.view;

/**
 *
 * @author AlainaImran
 */

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentView {
    private Label summaryLabel;

    public void start(Stage stage, String summaryText) {
        summaryLabel = new Label(summaryText);
        summaryLabel.setStyle("-fx-font-size: 14px; -fx-padding: 10px;");

        VBox root = new VBox(summaryLabel);
        Scene scene = new Scene(root, 300, 150);

        stage.setTitle("Student Summary");
        stage.setScene(scene);
        stage.show();
    }
}
