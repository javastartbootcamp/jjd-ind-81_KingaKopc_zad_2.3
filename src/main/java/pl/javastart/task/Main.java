package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name = "Mojito";
        drink.price = 13.0;
        drink.alcohol = true;
        drink.NameFirstIgredient = "Rum";
        drink.NameSecondIgredient = "Lemon juice";
        drink.NameThirdIgredient = "Water";

        System.out.println("Drink:" + drink.name);
        System.out.println("Cena:" + drink.price);
        System.out.println("Czy drink zawiera alkohol? : " + drink.alcohol);
        System.out.println("Składniki:");
        System.out.println(drink.NameFirstIgredient  +  " 50ml ");
        System.out.println(drink.NameSecondIgredient  +  " 5ml ");
        System.out.println(drink.NameThirdIgredient  +  " 25ml ");


        drink.quantity1 = 50;
        drink.quantity2 = 5;
        drink.quantity3 = 25;

        int capacitySum = drink.quantity1 + drink.quantity2 + drink.quantity3;
        System.out.println("Pojemność: " + capacitySum + "ml");












    }
}
