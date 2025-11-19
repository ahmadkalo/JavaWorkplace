package klausurAufgaben;

public class Roboter implements Turtle {
    private int x, y; // Position
    private String direction; // "rechts", "oben", "links", "unten"

    public Roboter() {
        this.x = 0;
        this.y = 0;
        this.direction = "rechts";
    }

    @Override
    public void step() {
        step(1);
    }

    @Override
    public void step(int n) {
        if (direction.equals("rechts")) {
            x += n;
        } else if (direction.equals("oben")) {
            y += n;
        } else if (direction.equals("links")) {
            x -= n;
        } else if (direction.equals("unten")) {
            y -= n;
        }
    }

    @Override
    public void turnR() {
        if (direction.equals("rechts")) {
            direction = "unten";
        } else if (direction.equals("unten")) {
            direction = "links";
        } else if (direction.equals("links")) {
            direction = "oben";
        } else if (direction.equals("oben")) {
            direction = "rechts";
        }
    }

    @Override
    public void turnL() {
        if (direction.equals("rechts")) {
            direction = "oben";
        } else if (direction.equals("oben")) {
            direction = "links";
        } else if (direction.equals("links")) {
            direction = "unten";
        } else if (direction.equals("unten")) {
            direction = "rechts";
        }
    }

    @Override
    public String toString() {
        return "Position: (" + x + ", " + y + "), Richtung: " + direction;
    }



    public static void main(String[] args) {
        TreppenRoboter roboter = new TreppenRoboter();
        roboter.treppe(5);
        System.out.println(roboter);
    }
}

