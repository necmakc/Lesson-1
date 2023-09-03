
//Создать новый продукт на основе Product, создать ему хотя бы одно свойство (например, шоколад -> калории) и включить в список продуктов в вендинг машину.
//        Продемонстрировать работу класса по продаже товаров (как мы это делали на семинаре).
//
//        Формат сдачи:
//        Ссылка на github проект
//        Подписать фамилию и номер группы

//Создать новый продукт на основе Product, создать ему хотя бы одно свойство (например, шоколад -> калории)
//и включить в список продуктов в вендинг машину.
//Продемонстрировать работу класса по продаже товаров (как мы это делали на семинаре).


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product bottleOfMilk1 =
                new BottleOfMilk("Бутылка c молоком", "ООО Молоко", 350, 1.5, 15);
        Product bottleOfWater1 =
                new BottleOfWater("Бутылка c водой", "ООО Источник", 350, 1);
        Product bottleOfWater2 =
                new BottleOfWater("Бутылка c водой", "ООО Источник", 150, 1.5);
        Product bottleOfWater3 =
                new BottleOfWater("Бутылка c водой", "ООО Источник", 250, 2);

        Product chocolate1 =
                new Chocolate("Chocolate","Alenka",100,"Milk",25,100);
        Product chocolate2 =
                new Chocolate("Chocolate","Alpen Gold",150,"Dark",40,100);
        Product chocolate3 =
                new Chocolate("Chocolate","Milka",200,"Milk",30,100);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);

        System.out.println(chocolate1.displayInfo());

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater("Бутылка c водой", 1.5);
        System.out.println(products.toString());
        System.out.println(vendingMachine.getChocolate());
//        if (bottleOfWater != null){
//            System.out.println("Вы получили: ");
//            System.out.println(bottleOfWater.displayInfo());
//        }
//        else {
//            System.out.println("Такой бутылки с водой нет в автомате.");
//        }

    }

}