package LabAssignment2;

class Circle implements operation {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double area = PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public void volume() {
        System.out.println("Volume of Circle: Not applicable");
    }
}

class Cylinder implements operation {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void area() {
        double area = 2 * PI * radius * (radius + height);
        System.out.println("Surface Area of Cylinder: " + area);
    }

    public void volume() {
        double volume = PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);
    }
}

class mainoperation {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.area();
        c.volume();

        Cylinder cy = new Cylinder(5, 10);
        cy.area();
        cy.volume();
    }
}
