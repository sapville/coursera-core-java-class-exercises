package com.lq.exercises;

public class Box {

    private double height;
    private double width;
    private double length;


    public Box(double height, double width, double length) {
        this.height = dimensionIsInvalid(height) ? 1 : height;
        this.width = dimensionIsInvalid(width) ? 1 : width;
        this.length = dimensionIsInvalid(length) ? 1 : length;
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

    public void setHeight(double height) {
        if (dimensionIsInvalid(height)) {
            System.out.println("The dimension must be greater than 0");
        } else {
            this.height = height;
        }
    }

    public void setLength(double length) {
        if (dimensionIsInvalid(length)) {
            System.out.println("The dimension must be greater than 0");
        } else {
            this.length = length;
        }
    }

    private boolean dimensionIsInvalid(double dimension) {
        return dimension <= 0;
    }

    public void setWidth(double width) {
        if (dimensionIsInvalid(width)) {
            System.out.println("The dimension must be greater than 0");
        } else {
            this.width = width;
        }
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
