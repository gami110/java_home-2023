package lab2;

class Ring implements Info {
    private final double diameter;

    public Ring(double diameter) {
        if (diameter >= 1) {
            this.diameter = diameter;
        } else {
            System.out.println("Число должно быть положитильным");
            this.diameter = 1;
        }
    }

//    public double getDiameter() {
//        return diameter;
//    }

//    public double setDiametr() {
//        return diameter;
//    }

    public double areaInfo() {
        return 0.25 * 3.14 * (diameter * diameter);
    }

    public double perimeterInfo() {
        return 3.14 * diameter;
    }

    @Override
    public void infoArea() {
        System.out.println("Площадь круга: " + areaInfo());
    }

    public void infoPerimeter() {
        System.out.println("Периметр круга: " + perimeterInfo());
    }
}

class Box implements Info {
    private final double a;

    public Box(double a) {
        this.a = a;
    }

//    public double getA() {
//        return a;
//    }

//    public void setA(double a) {
//        this.a = a;
//    }

    public double areaInfo() {
        return a * a;
    }

    public double perimeterInfo() {
        return 4 * a;
    }

    @Override
    public void infoArea() {
        System.out.println("Площадь квадрата: " + areaInfo());
    }

    public void infoPerimeter() {
        System.out.println("Периметр квадрата: " + perimeterInfo());
    }
}

class Triangle implements Info {
    private final double  a;
    private final double h;


    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

//    public double getA() {
//        return a;
//    }

//    public void setA(double a) {
//        this.a = a;
//    }

//    public double getH() {
//        return h;
//    }

//    public void setH(double h) {
//        this.h = h;
//    }


    public double areaInfo() {
        return 0.5 * a * h;
    }

    public double perimeterInfo() {
        return 3 * a;
    }

    public void infoArea() {
        System.out.println("Площадь треугольника: " + areaInfo());
    }

    public void infoPerimeter() {
        System.out.println("Периметр треугольника: " + perimeterInfo());
    }
}

interface Info {
    void infoArea();

    void infoPerimeter();
}

public class Example6 {
    public static void main(String[] args) {
        Info info1 = new Ring(12);
        Info info2 = new Box(5);
        Info info3 = new Triangle(5, 3);
        info1.infoArea();
        info1.infoPerimeter();
        info2.infoArea();
        info2.infoPerimeter();
        info3.infoArea();
        info3.infoPerimeter();
    }
}
