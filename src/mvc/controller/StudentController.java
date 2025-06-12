/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.controller;

/**
 *
 * @author AlainaImran
 */
import javafx.stage.Stage;
import mvc.model.Student;
import mvc.model.SummaryModel;
import mvc.view.StudentView;

public class StudentController {
    private Student student;
    private SummaryModel summaryModel;
    private StudentView studentView;

    public StudentController(Student student) {
        this.student = student;
        this.summaryModel = new SummaryModel(student);
        this.studentView = new StudentView();
    }

    public void showSummary(Stage stage) {
        String summary = summaryModel.getSummary();
        studentView.start(stage, summary);
    }
}

