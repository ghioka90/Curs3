package com.devmind.springapp;

public class MyFirstSpringApp1 {

    public static void main(String[] args) {

        // create the object
        ITeacher theTeacher = new JavaTeacher();
		
        // use the object
        System.out.println(theTeacher.getHomework());		
    }

}