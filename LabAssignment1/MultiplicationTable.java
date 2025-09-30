package LabAssignment1;
import java.io.*;
public class MultiplicationTable {

	public static void main(String[] args) throws IOException  {
		int a;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number:");
		a=Integer.parseInt(br.readLine());
		
		for(int i=1; i<=10;i++) {
			System.out.println(+a+"*"+i+"="+(a*i));
		}
	}

}
                                   