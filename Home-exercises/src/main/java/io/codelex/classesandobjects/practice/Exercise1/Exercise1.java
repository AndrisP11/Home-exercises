package io.codelex.classesandobjects.practice.Exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        Product product1 = new Product("Logitech mouse", 70.00, 14);
        Product product2 = new Product("iPhone 5s", 999.99, 3);
        Product product3 = new Product("Epson EB-U05", 440.46, 1);
        product1.printProduct();
        product2.printProduct();
        product3.printProduct();
        product2.setPriceAtStart(1199.99);
        product2.printProduct();
        product1.setAmountAtStart(5);
        product1.setPriceAtStart(80.0);
        System.out.println(product1.getAmountAtStart());
        System.out.println(product3.getPriceAtStart());
        product1.printProduct();

    }
}
