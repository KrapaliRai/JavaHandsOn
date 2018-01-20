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
public class MyApp {
    
    public static void main(String[] args){
        // here we called different methods.
        Student s1 = new Student(23, "Krapali", "NEU");
        s1.showStudent();
        
        Person p1 = new Person(12, "Krapali 2");
        p1.showPerson();
            
        Student s2 = new Student(23, "Krapali", "NEU");
        s2.showAge();
        
        
    }
    
}
