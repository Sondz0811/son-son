/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sonhuynh081104
 */
public class Engineer extends Person {
    protected String about;

    public Engineer(String about, String name, int age, String job) {
        super(name, age, job);
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "Engineer{" + "about=" + about + '}';
    }

    

    @Override
    public void level() {
        System.out.println("level tu A den E");
    }
    
}
