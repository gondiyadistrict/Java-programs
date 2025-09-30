package LabAssignment2;
import java.util.Scanner;

public class Person {
 String name;
 String city;

 public void acceptDetails() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter name: ");
     name = sc.nextLine();
     System.out.print("Enter city: ");
     city = sc.nextLine();
     sc.close();
 }

 public void displayDetails() {
     CapitalString cs = new CapitalString();
     String capitalizedName = cs.capitalizeFirstLetter(name);
     System.out.println("Name: " + capitalizedName);
     System.out.println("City: " + city);
 }

 public static void main(String[] args) {
     Person p = new Person();
     p.acceptDetails();
     p.displayDetails();
 }
}