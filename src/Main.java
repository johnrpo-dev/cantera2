import models.Colors;
import models.Fruit;
import models.Person;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Colors color1 = new Colors("verde");
        Colors color2 = new Colors("Amarillo");
        Colors color3 = new Colors("rojo");

        ArrayList<Colors> mango = new ArrayList<Colors>();
        mango.add(color1);
        mango.add(color2);
        mango.add(color3);

        Fruit mangoTommy = new Fruit("Mango Tommy", 1.4f, mango);

        for ( Colors mang: mangoTommy.getColors() ) {
            System.out.println(mangoTommy.getName() + " " + mangoTommy.getAverageWeight() + "Kg "  + mang.getName());
        }

        // en proceso




    }

}
