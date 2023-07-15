package RGMCode;


import java.util.*;

public class ProductRepo {
    Product product1 = new Product(1, "Apfel");
    Product product2 = new Product(2, "Banane");
    Product product3 = new Product(3, "Clementine");
    Map<Integer, Product> products = new HashMap<>();

    public Map<Integer, Product> list(){
        products.put(product1.getId(), product1);
        products.put(product2.getId(), product2);
        products.put(product3.getId(), product3);

        return products;
    }

    public Product get(int id){
        return products.get(id);
    }

    public ProductRepo() {
    }
}
