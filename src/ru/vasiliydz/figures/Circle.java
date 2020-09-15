package ru.vasiliydz.figures;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius should be positive");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
