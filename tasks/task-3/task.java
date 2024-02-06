public class task {
    public static void main(String[] args) {
        Point p = new Point();
        Circle c = new Circle(p);
        System.out.println("part 1:");
        p.print();
        c.print();
        p.setX(1.1);
        p.setY(2.2);
        c.set_centre(p);
        c.set_radius(3.3);
        System.out.println("part 2:");
        p.print(false);
        System.out.print(" == (" + p.getX() + ", " + p.getY() + ")\n");
        c.print();
        p.move(1.0, 1.0);
        c.move(2.0, 2.0);
        System.out.println("part 3:");
        p.print();
        c.print();
    }
}

class Point {
    double x;
    double y;

    Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    void print(boolean endl) {
        if (endl == false) {
            System.out.print("(" + x + ", " + y + ")");
        } else {
            this.print();
        }
    }

    void print() {
        System.out.print("(" + x + ", " + y + ")\n");
    }

    void setX(double input) {
        this.x = input;
    }

    void setY(double input) {
        this.y = input;
    }

    double getX() {
        return this.x;
    }

    double getY() {
        return this.y;
    }
}

// define class circle here
class Circle {
    Point centre;
}