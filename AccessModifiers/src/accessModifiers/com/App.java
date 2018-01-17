/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessModifiers.com;

/**
 *
 * @author krapa
 */
public class App {

    public static void main(String[] args) {

        Student s1 = new Student(10, "jack");
        s1.showStudent(500);
        s1.getAge();
        System.out.println("New age:" + s1.getAge());
        
        Student s2 = new Student(17, "Tiger");
        s2.showStudent(100);
        s2.getAge();
        System.out.println("New age:" + s2.getAge());

        int randomNumber = s1.showStudent(100);

        System.out.println("RN: " + randomNumber);
        
        System.out.println(Constants.dalmatians);
        //here we directly called a constant variable which was public from Constants class. Syntax = Class.static_var_name
        
        Constants.sayHello();// directly calling the static method from Constant class.
               
        
    }
}
