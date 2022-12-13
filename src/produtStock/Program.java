package produtStock;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US);
		Scanner sc = new  Scanner (System.in);
		
		Product product = new Product();
		System.out.println("Entre product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price : ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
	
		System.out.println();
		System.out.print("Enter the numer of product to be added in stock: ");
	    int quantity = sc.nextInt();
		product.addProduct(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.print("Enter the numer of product to be removed in stock: ");
	    quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		
		sc.close();

	}
}
