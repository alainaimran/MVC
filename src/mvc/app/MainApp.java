/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.app;

/**
 *
 * @author AlainaImran
 */

import mvc.controller.StudentController;
import javafx.application.Application;
import javafx.stage.Stage;
import mvc.model.Student;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        Student student = new Student("Alaina Khan", 101, 3.93);
        StudentController controller = new StudentController(student);
        controller.showSummary(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

