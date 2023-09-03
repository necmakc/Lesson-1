import javax.xml.namespace.QName;

public class Chocolate extends Product {
    private double calories;   //Калории
    private  double cocoa;  //Содержание какао
    private String typeOfChocolate; //Вид шоколадки

    public Chocolate(String name,String brand,double price, String typeOfChocolate,double cocoa, double calories){
        super(name,brand,price);
        this.typeOfChocolate = typeOfChocolate;
        this.cocoa = cocoa;
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("Наименование: %s; Производитель: %s; Цена: %.2f;\n Вид шоколадки: %s; Содержание какао: %.2f; Калорий: %.0f;", name, brand, price,typeOfChocolate,cocoa,calories);
    }

    @Override
    public String toString() {
        return "\nШоколадка {" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", typeOfChocolate='" + typeOfChocolate + '\'' +
                "calories=" + calories +
                ", cocoa=" + cocoa +
                '}';
    }
}
