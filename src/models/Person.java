package models;

import java.util.Date;

public class Person {

    private int dni;
    private String name;
    private String lastname1;
    private String lastname2;
    private String dateBirthday;
    private float height;

    public Person() {
    }

    public Person(int dni, String name, String lastname1, String lastname2, Date dateBirthday, float height) {
        this.dni = dni;
        this.name = name;
        this.lastname1 = lastname1;
        this.lastname2 = lastname2;
        this.dateBirthday = String.valueOf(dateBirthday);
        this.height = height;
    }

    public Person(int dni, String john, String rpo, String montoya, String s, float height) {
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname1() {
        return lastname1;
    }

    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public String getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", lastname1='" + lastname1 + '\'' +
                ", lastname2='" + lastname2 + '\'' +
                ", dateBirthday=" + dateBirthday +
                ", height=" + height +
                '}';
    }
}
