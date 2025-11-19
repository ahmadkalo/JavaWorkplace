package PrettyRectangle;

import java.util.Objects;

class MyPoint {
    double x, y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyPoint other = (MyPoint) obj;
        return Double.compare(other.x, x) == 0 &&
                Double.compare(other.y, y) == 0;
    }


}