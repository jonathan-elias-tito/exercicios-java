package model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.entities.ImportedProduct;
import model.entities.Product;
import model.entities.UsedProduct;

public class Application {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat smp = new SimpleDateFormat("dd/MM/yyyy");
        Scanner red = new Scanner(System.in);
        
        System.out.print("Enter the number of products: ");
        int N = red.nextInt();
        List<Product> lista = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Data #" + (i + 1) + " product:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char option = red.next().toUpperCase().charAt(0);
            red.nextLine();

            System.out.print("Name: ");
            String name = red.nextLine();

            System.out.print("Price: ");
            Double price = red.nextDouble();

            if (option == 'I') {
                System.out.print("Customs fee: ");
                Double customFee = red.nextDouble();
                lista.add(new ImportedProduct(name, price, customFee));
                
            } else if (option == 'U') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = smp.parse(red.next());
                lista.add(new UsedProduct(name, price, manufactureDate));
                
            } else {
                lista.add(new Product(name, price));
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (Product obj : lista) {
            System.out.println(obj.tag());
        }
        
        red.close();
    }
}