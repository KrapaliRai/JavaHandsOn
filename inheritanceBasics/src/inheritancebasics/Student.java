/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancebasics;

/**
 *
 * @author krapa
 */
public class Student extends Person {

    private String nameOfUniversity;

    public Student(int age, String name, String nameOfUniversity) {

        super(age, name);
        this.nameOfUniversity = nameOfUniversity;

    }

    public void showStudent() {
         System.out.println("Age: " + age);
        System.out.println("name " + name);
        System.out.println("Uni " + nameOfUniversity);
        
    }
    
    public void showAge(){
    super.showAge();
    }

}
