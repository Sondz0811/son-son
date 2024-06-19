/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import model.Engineer;
import model.Student;
import model.Teacher;

/**
 *
 * @author sonhuynh081104
 */
public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("son", 20, "IT", "DE180") {
            public void level() {

            }
        };
        Teacher t1 = new Teacher("Funny", 35, "GV", "KY190");
        System.out.println(s1.toString());
        System.out.println(t1.toString());
        //System.out.println(e1.toString());
        //t1.level();
        //e1.level();
    }
}
