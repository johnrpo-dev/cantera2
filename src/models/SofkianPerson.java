package models;

public class SofkianPerson {

    protected String name;
    protected char gender;
    protected int age;
    protected String adress;

    public SofkianPerson() {
    }

    public SofkianPerson(String name) {
        this.name = name;
    }

    public SofkianPerson(String name, char gender, int age, String adress) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SofkianPerson{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", adress='").append(adress).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
