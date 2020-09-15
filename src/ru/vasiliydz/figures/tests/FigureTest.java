package ru.vasiliydz.figures.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.vasiliydz.figures.Circle;
import ru.vasiliydz.figures.Figure;
import ru.vasiliydz.figures.Rectangle;
import ru.vasiliydz.figures.Square;

import java.util.HashMap;
import java.util.Map;

public class FigureTest extends Assert {
    private final Map<Figure, Double> testsData = new HashMap<>();
    private final double delta = 0.0000001;

    @Before
    public void setUpTestsData() {
        testsData.put(new Rectangle(2, 1), 2.);
        testsData.put(new Rectangle(5.2, 2.1), 5.2 * 2.1);
        testsData.put(new Square(3), 9.);
        testsData.put(new Square(3.4), 3.4 * 3.4);
        testsData.put(new Circle(2), 4 * Math.PI);
        testsData.put(new Circle(1.6), 1.6 * 1.6 * Math.PI);
    }

    @Test
    public void testGetArea() {
        for (Map.Entry<Figure, Double> entry : testsData.entrySet()) {
            final Figure testFigure = entry.getKey();
            final double expected = entry.getValue();
            final double actual = testFigure.getArea();
            assertEquals(expected, actual, delta);
        }
    }

    @After
    public void clearTestsData() {
        testsData.clear();
    }


}