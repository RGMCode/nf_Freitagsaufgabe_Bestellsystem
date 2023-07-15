package RGMCode;


import java.util.*;

public class ProductRepo {

    private final HashMap<Integer, Product> products = new HashMap<>(Map.of(
            1,new Product(1,"Apfel"),
            2,new Product(2,"Banane"),
            3,new Product(3,"Clementine")
    ));

    public static void listProduct() {






//        Map<Integer, String> productMap = new HashMap<>();
//        productMap.put(1, "Apfel");
//        productMap.put(2, "Banane");
//        productMap.put(3, "Clementine");
//
//        Set<Integer> keySet = productMap.keySet();
//
//        for (Integer s : keySet){
//            System.out.println("s: " + s + " Obst: " + productMap.get(s));
//        }

    }

    public String getProduct() {

        return "hier muss ein return stehen";
    }

}
