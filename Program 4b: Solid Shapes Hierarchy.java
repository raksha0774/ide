import java.util.Scanner;

abstract class Solid {
    double r, h;

    abstract void surfaceArea();

    abstract void volume();

    void readRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        r = sc.nextDouble();
    }

    void readHeight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height");
        h = sc.nextDouble();
    }
}

class Cone extends Solid {
    void surfaceArea() {
        double area = (3.14 * r) * (r + Math.sqrt(r * r + h * h));
        System.out.println("Surface area of cone is " + area);
    }

    void volume() {
        double volume = (3.14 * r * r * h) / 3;
        System.out.println("Volume of cone is " + volume);
    }
}

class Cylinder extends Solid {
    void surfaceArea() {
        double area = 2 * 3.14 * r * (r + h);
        System.out.println("Surface area of cylinder is " + area);
    }

    void volume() {
        double volume = 3.14 * r * r * h;
        System.out.println("Volume of cylinder is " + volume);
    }
}

class Sphere extends Solid {
    void surfaceArea() {
        double area = 4 * 3.14 * r * r;
        System.out.println("Surface area of sphere is " + area);
    }

    void volume() {
        double volume = (4.0 / 3) * 3.14 * r * r * r;
        System.out.println("Volume of sphere is " + volume);
    }
}

public class MySolid {
    public static void main(String args[]) {
        Solid s = new Cylinder();
        s.readRadius();
        s.readHeight();
        s.surfaceArea();
        s.volume();

        s = new Cone();
        s.readRadius();
        s.readHeight();
        s.surfaceArea();
        s.volume();

        s = new Sphere();
        s.readRadius();
        s.surfaceArea();
        s.volume();
    }
}
