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
// We created a Student class.
public class Student {
    // we declared two member variables.
    private int age;
    private String name;

    public int getAge() {
        return 2*age;
    }
    
    
    //  we will create a default constructor.
    public Student(){
    }
    
    // we created a parameterrised constructor.
    // Note that constructor has no return type.
    
    //Def: JAva constructor are special methods that are called when objects are instantiated.  
    
    public Student(int age, String name){
    this.age= age;  //
    this.name= name;
    
    }
    
    public int showStudent(int randomNumber){
        int i;
        if(age<20){
        
        System.out.println("Student age:" + age);
        System.out.println("Student name" +name);
        System.out.println(randomNumber);
        
        age++;
        }
        
    return randomNumber*2;
    }
    
    
}
