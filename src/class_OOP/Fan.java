package class_OOP;

public class Fan {
    final int Slow = 1;
    final int Medium = 2;
    final int Fast = 3;
    boolean status;
    double radius;
    String color;
    int speed;

    public Fan() {
        speed = Slow;
        status = false;
        radius = 5;
        color = "blue";

    }

    public Fan(boolean status, double radius, String color,int speed) {
        this.status = status;
        this.radius = radius;
        this.color = color;
        this.speed = speed;
    }

    public int getSlow() {
        return Slow;
    }

    public int getMedium() {
        return Medium;
    }

    public int getFast() {
        return Fast;
    }

    public boolean isStatus() {
        return status;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String a = null;
        if (status == true){
        a = "Fan{" +
                "Slow=" + Slow +
                ", Medium=" + Medium +
                ", Fast=" + Fast +
                ", status=" + status +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
        return a;
    }
}
