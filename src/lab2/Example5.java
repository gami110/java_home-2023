package lab2;

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
        } else {
            System.out.println("Длина не может быть отрицательной");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        } else {
            System.out.println("Ширина не может быть отрицательной");
        }
    }

    public double areaCalculator() {
        return length * width;
    }

    public double perimetrCalculator() {
        return (length + width) * 2;
    }

}

public class Example5 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);
        rectangle.setLength(21);
        rectangle.setWidth(53);
        System.out.println("Площадь для прямоугольника длиной: " + rectangle.getLength() + " и шириной: " + rectangle.getWidth() + " равна " + rectangle.areaCalculator());
        System.out.println("Периметр для прямоугольника длиной: " + rectangle.getLength() + " и шириной: " + rectangle.getWidth() + " равна " + rectangle.perimetrCalculator());
    }
}
