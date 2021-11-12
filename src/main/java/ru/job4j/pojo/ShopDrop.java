package ru.job4j.pojo;

public class ShopDrop {

    public static Product[] delete(Product[] product, int index) {
        for (int i = index; i < product.length - 1; i++) {
                product[i] = product[i + 1];
        }
        product[product.length - 1] = null;
        return product;
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product.getName());
        }
        products[1] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

    }
}
