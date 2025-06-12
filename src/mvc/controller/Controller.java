/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.controller;



import mvc.model.Student;
import mvc.model.SummaryModel;
import mvc.view.View;


/**
 *
 * @author AlainaImran
 */

public class Controller {
    private Student student;
    private SummaryModel summaryModel;
    private View view;

    public Controller(Student student, View view) {
        this.student = student;
        this.summaryModel = new SummaryModel(student);
        this.view = view;
    }

    public void updateView() {
        String summary = summaryModel.getSummary();
        view.printSummary(summary);
    }
}
