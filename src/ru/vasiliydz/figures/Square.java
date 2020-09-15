package ru.vasiliydz.figures;

public class Square extends Figure {

    private double edge;

    public Square(double edge) {
        if (edge <= 0) {
            throw new IllegalArgumentException("edge should be positive");
        }
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return edge * edge;
    }
}
