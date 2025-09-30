package LabAssignment1;

public class MyDate {
     int mm;
     int dd;
     int yy;
     
	public MyDate() {
		this.dd=11;
		this.mm=05;
		this.yy=2005;
	}
	public MyDate(int d,int m,int y) {
		this.dd=d;
		this.mm=m;
		this.yy=y;
	}
	public void display() {
		System.out.println(this.dd+"-"+this.mm+"-"+this.yy);
	}

	public static void main(String[] args) {
		MyDate  d1=new MyDate();
		System.out.println("Default date is:");
		d1.display();
		MyDate d2=new MyDate(5,4,2005);
		System.out.println("parameterized date is:");
		d2.display();
		

	}

}
