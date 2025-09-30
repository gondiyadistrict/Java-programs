package Assignment1;

public class program14 {

	public static void main(String[] args) {
	
        int[] numbers = {10, 23, 45, 66, 77, 88, 99, 100};

        System.out.println("Even Numbers in the Array:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\n\nOdd Numbers in the Array:");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        } 

	}

}


   
       
