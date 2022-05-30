import models.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        Colors color1 = new Colors("Green");
//        Colors color2 = new Colors("Yellow");
//        Colors color3 = new Colors("Red");
//
//        ArrayList<Colors> mango = new ArrayList<Colors>();
//        mango.add(color1);
//        mango.add(color2);
//        mango.add(color3);
//
//        Fruit mangoTommy = new Fruit("Mango Tommy", 1.4f, mango);
//
//        for (Colors mang : mangoTommy.getColors()) {
//            System.out.println(mangoTommy.getName() + " " + mangoTommy.getAverageWeight() + "Kg " + mang.getName());
//        }


        /**
         * creacion de empleados nuevos sofkianos aplicando herencia
         * SofkianPerson-Employee
         */
        Employee employee1 = new Employee("John", 1500);
        System.out.println("Employee: " + employee1);

        /**
         * creacion de clientes nuevos sofkianos aplicando herencia
         * SofkianPerson-Customer
         */
        Customer customer1 = new Customer(new Date(), true, "Andrea", 'F',
                28,"calle falsa 123");
        System.out.println(" Customer: " + customer1);
    }





}
