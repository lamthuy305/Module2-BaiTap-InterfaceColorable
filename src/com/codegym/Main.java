package com.codegym;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square cSquare = new ColorableSquare();

        Shape[] shapes = new Shape[]{circle, rectangle, cSquare};

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}
