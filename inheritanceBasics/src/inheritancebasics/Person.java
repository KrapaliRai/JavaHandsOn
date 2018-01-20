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
public class Person {
    // Person is our Super Class.
    // protected members can be inherited by subclass.
    protected int age;
    protected String name;

    public Person() {
    }//default constructor.

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showPerson() {
        System.out.println("Age: " + age);
        System.out.println("name " + name);
        //System.out.println("Uni " + nameOfUniversity);

    }

    protected void showAge() {
        System.out.println("Person protected Age" + age);
    }

}
