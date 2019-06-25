package ru.popovanton.plorum.javabasics;

public class Rectangle {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getPerimeter() {
        return (this.height+this.width)*2;
    }

    public int getSquare() {
        return this.height*this.width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
