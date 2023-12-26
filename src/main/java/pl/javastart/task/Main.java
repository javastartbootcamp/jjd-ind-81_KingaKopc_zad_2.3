package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name = "Mojito";
        drink.price = 13.0;
        drink.alcohol = true;

        Ingredient rum = new Ingredient();
        rum.name = "Rum";
        rum.quantity = 100;
        drink.ingredient1 = rum;

        Ingredient lemonJuice = new Ingredient();
        lemonJuice.name = "Lemon juice";
        lemonJuice.quantity = 15;
        drink.ingredient2 = lemonJuice;


        drink.ingredient3.name = "Water";
        drink.ingredient3.quantity = 25;

        System.out.println("Drink:" + drink.name);
        System.out.println("Cena:" + drink.price);
        System.out.println("Czy drink zawiera alkohol? : " + drink.alcohol);
        System.out.println("Składniki:");
        System.out.println(drink.ingredient1.name + " " + drink.ingredient1.quantity + " ml ");
        System.out.println(drink.ingredient2.name + " " + drink.ingredient2.quantity + " ml ");
        System.out.println(drink.ingredient3.name + " " + drink.ingredient3.quantity +  " ml ");




        int capacitySum = drink.ingredient1.quantity + drink.ingredient2.quantity + drink.ingredient3.quantity;
        System.out.println("Pojemność: " + capacitySum + "ml");


    }
}
