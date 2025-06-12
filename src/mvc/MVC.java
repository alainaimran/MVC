/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc;
import mvc.model.Model;
import mvc.model.Student;
import mvc.view.View;
import mvc.controller.Controller;
/**
 *
 * @author AlainaImran
 */
public class MVC {

  public static void main(String[] args) {
        Student student = new Student("Alaina Khan", 1069, 3.93);
        View view = new View();
        Controller controller = new Controller(student, view);

        controller.updateView();
}
}