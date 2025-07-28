 package lang.object.test;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle r = (Rectangle) obj;
        return width == r.width && height == r.height;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
}
