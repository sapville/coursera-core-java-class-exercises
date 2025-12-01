package com.lq.exercises;

public class Box {

    private final double height;
    private final double width;
    private final double length;


    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Box(double dimension) {
        this(dimension, dimension, dimension);
    }

    public double getVolume() {
        return height * width * length;
    }

    public double getSurfaceArea() {
        return 2 * (height * length + height * width + width * length);
    }

    @Override
    public String toString() {
        if (width <= 0 || length <= 0 || height <= 0) {
            return "The box contains invalid properties";
        } else {
            return String.format(
                    "Length = %.1f%n" +
                    "Width = %.1f%n" +
                    "Height = %.1f%n" +
                    "Volume = %.1f%n" +
                    "Surface Area = %.1f%n",
                    length, width, height, getVolume(), getSurfaceArea()
            );
        }
    }

    public static void main(String[] args) {
        System.out.println(new Box(7, 6, 5));
    }
}
