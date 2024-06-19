/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sonhuynh081104
 */
public class Teacher extends Person {
    private String major;

    public Teacher( String name, int age, String job, String major) {
        super(name, age, job);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    
@Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", age=" + age + ", job=" + job + ",major=" +major + '}';
    }
    @Override
    public void level() {
        System.out.println("level tu 1 den 5");
    }
}
