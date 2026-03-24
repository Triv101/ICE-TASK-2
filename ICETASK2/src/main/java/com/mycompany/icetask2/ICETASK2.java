/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask2;

/**
 *
 * @author triva
 */
import java.util.Scanner;
public class ICETASK2 {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        String name, surname;
        int age;

        System.out.println("Enter name");
        name = scan.next();

        System.out.println("Enter surname");
        surname = scan.next();

        System.out.println("Enter age");
        age = scan.nextInt();

        System.out.println(Checkidentity(name, surname, age));
        
    }
     static String Checkidentity(String name,String surname,int age)//paraimeters
     {
               if(name.equals("Jack" )&& surname.equals("Khotsa") && age == 25)
        {
            return "Identity verified ";
        }
        else
        {
            return "Identity incorrect";
        }
     }
}
               

