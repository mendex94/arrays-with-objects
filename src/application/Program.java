package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many products you want to calculate the average price: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];
        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Enter the name of the product: ");
            String name = sc.nextLine();
            System.out.println("Enter the price of the product: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("The average price of the products is: %.2f%n", avg);
    }
}
