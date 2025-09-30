package Assignment1;



public class program15 {

	 public void printSeries() {
	     System.out.println("Series from 1 to 10:");
	     for (int i = 1; i <= 10; i++) {
	         System.out.print(i + " ");
	     }
	     System.out.println(); 
	 }
	 public static void main(String[] args) {
	     
	     program15 series = new program15();
	     
	   
	     series.printSeries();
	 }
	}