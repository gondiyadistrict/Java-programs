package LabAssignment2;

public class CapitalString {
 public String capitalizeFirstLetter(String input) {
     if (input == null || input.isEmpty()) {
         return input;
     }
     return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
 }
}