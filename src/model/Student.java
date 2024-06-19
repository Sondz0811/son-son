/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sonhuynh081104
 */
public abstract class Student extends Person {
    private String mssv;

    public Student(String name, int age, String job, String mssv) {
        super(name,age,job);
        this.mssv = mssv;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", job=" + job + ",mssv=" +mssv + '}';
    }

    
    
    public abstract void level();
}
