package models;

import java.util.ArrayList;

public class Fruit {

    private String name;
    private float averageWeight;
    private ArrayList<Colors> colors;

    public Fruit() {
    }

    public Fruit(String name, float averageWeight, ArrayList<Colors> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public ArrayList<Colors> getColors() {
        return colors;
    }

    public void setColors(ArrayList<Colors> colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", averageWeight=" + averageWeight +
                ", colors=" + colors +
                '}';
    }
}
