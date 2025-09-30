package LabAssignment2;
import java.util.Scanner;

	public class squareofNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of terms: ");
	        int n = scanner.nextInt();

	        System.out.println("Square of numbers up to " + n + " terms:");

	        for (int i = 1; i <= n; i++) {
	            int square = i * i;
	            System.out.println("Square of " + i + " is: " + square);
	        }

	    }
	}

