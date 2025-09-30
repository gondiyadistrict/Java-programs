package Assignment1;


public class Student {
    int rollno;
    String name;
    double percentage;
    Student() {
        this.rollno = 0;
        this.name = "Unknown";
        this.percentage = 0.0;
    }
    Student(int rollno, String name, double percentage) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
    }
    void display() {
        System.out.println("Roll No: " + this.rollno + ", Name: " + this.name + ", Percentage: " + this.percentage);
    }


    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice", 85.0);
        Student s2 = new Student(2, "Bob", 78.5);
        Student s3 = new Student(3, "Charlie", 92.3);
        Student s4 = new Student(4, "David", 69.0);
        Student s5 = new Student(5, "Eva", 88.7);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
    }
}
