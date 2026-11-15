package ex.com;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Pommes");
        shoppingList.add("Lait");
        shoppingList.add("Pain");

        System.out.println("Articles de la liste :");
        for (String item : shoppingList) System.out.println("- " + item);

        shoppingList.remove("Lait");
        System.out.println("Contient des pommes ? " + shoppingList.contains("Pommes"));
        System.out.println("Index de Pain : " + shoppingList.indexOf("Pain"));
        System.out.println("Premier article : " + shoppingList.get(0));
        System.out.println("Taille finale de la liste : " + shoppingList.size()); // 2
    }
}