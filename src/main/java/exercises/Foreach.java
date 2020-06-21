package exercises;

public class Foreach {

    public static void ex1(String[] tableOfNames) {
        for(String name: tableOfNames) {
            System.out.println("Cześć, " + name + "!");
        }
    }

    public static String ex2(String[] tableOfProducts) {
        StringBuilder productsStr = new StringBuilder();

        System.out.println("Lista produktow:");

        for(String product: tableOfProducts) {
            productsStr.append(product);
            productsStr.append(" ");
        }

        return String.valueOf(productsStr);
    }

    public static void main(String[] args) {
        String[] names = {"Kamil", "Wojtek", "Agata", "Mateusz", "Kasia"};
        String[] products = {"szynka", "masło", "ser", "pomidor", "pasztetowa"};

        ex1(names);
        System.out.println(ex2(products));
    }
}
