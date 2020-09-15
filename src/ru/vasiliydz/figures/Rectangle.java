package ru.vasiliydz.figures;

public class Rectangle extends Figure {

    private double width, height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("width and height should be positive");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width  * height;
    }
}
