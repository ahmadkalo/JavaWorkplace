package Schach;

public class Punkt2D {
     public int x;
    public int y;

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    

   

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punkt2D other = (Punkt2D) obj;
		return x == other.x && y == other.y;
	}

	@Override
    public String toString() {
        return "[x=" + x + ", y=" + y + "]";
    }

}
