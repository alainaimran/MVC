/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.model;

/**
 *
 * @author AlainaImran
 */
public class SummaryModel {
    private Student student;

    public SummaryModel(Student student) {
        this.student = student;
    }

    public String getSummary() {
        return "Student Summary: " + student.getName() + " (Roll No: " + student.getRollNumber() + "), GPA: " + student.getGpa();
    }
}
