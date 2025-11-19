package PrettyRectangle;

import java.util.Objects;

public class MyPrettyRectangle {

     double x1, y1, x2, y2;

    public MyPrettyRectangle(double x1, double y1, double x2, double y2) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public boolean contains(MyPrettyRectangle other) {
        return other.x1 >= this.x1 && other.y1 >= this.y1 &&
               other.x2 <= this.x2 && other.y2 <= this.y2;
    }

    public MyPoint getCenter() {
        double centerX = (x1 + x2) / 2;
        double centerY = (y1 + y2) / 2;
        return new MyPoint(centerX, centerY);
    }

    public double getArea() {
        return (x2 - x1) * (y2 - y1);
    }

    public double getPerimeter() {
        return 2 * ((x2 - x1) + (y2 - y1));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyPrettyRectangle other = (MyPrettyRectangle) obj;
        return Double.compare(other.x1, x1) == 0 &&
               Double.compare(other.y1, y1) == 0 &&
               Double.compare(other.x2, x2) == 0 &&
               Double.compare(other.y2, y2) == 0;
    }

}


