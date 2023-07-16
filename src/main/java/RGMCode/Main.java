package RGMCode;

public class Main {
    public static void main(String[] args) {

        ShopService service = new ShopService();

        System.out.println(service.listProducts());

        System.out.println("--------------------------------");

        System.out.println(service.getProduct(1));
        System.out.println(service.getProduct(2));
        System.out.println(service.getProduct(3));

        System.out.println("--------------------------------");

        System.out.println(service.addOrder());

        System.out.println("--------------------------------");

        System.out.println(service.getOrder(1));
        System.out.println(service.getOrder(2));

        System.out.println("--------------------------------");

        System.out.println(service.listOrders());

    }

}