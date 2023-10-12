/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttes2;


import Project.Bag.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public  final class Posttes2 {
    

    public final static void main(String[] args) {
        ArrayList<Bag> ListBag = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

    
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. add bag");
            System.out.println("2. View bag List");
            System.out.println("3. Look for bag");
            System.out.println("4. Update bag");
            System.out.println("5. Delete bag");
            System.out.println("6. Exit");
            System.out.print("Your choice: ");

            String pilihan = scanner.nextLine();


            switch (pilihan) {
                case "1":
                    System.out.print("Enter the bag name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the bag brand: ");
                    String merk = scanner.nextLine();
                    System.out.print("Enter the bag price: ");
                    double price = Double.parseDouble(scanner.nextLine());

                    Bag bag = new Bag(name, merk, price);
                    ListBag.add(bag);
                    System.out.println("bag added successfully!");
                    break;


                case "2":
                    if (ListBag.isEmpty()) {
                        System.out.println("Bag list does not exist");
                    } else {
                        System.out.println("list bag:");
                        for (Bag p : ListBag) {
                            System.out.println(p);
                        }
                    }
                    break;

                case "3":
                    System.out.print("Enter the name of the bag you are looking for: ");
                    String namesearch = scanner.nextLine();
                    boolean ditemukan = false;

                    for (Bag p : ListBag) {
                        if (p.getName().equalsIgnoreCase(namesearch)) {
                            System.out.println("bag found:");
                            System.out.println(p);
                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("bag not found.");
                    }
                    break;


                    
                case "4":
                    System.out.print("Enter the name of the bag that will be updated: ");
                    String namaUpdate = scanner.nextLine();
                    boolean ditemukanUpdate = false;

                    for (int i = 0; i < ListBag.size(); i++) {
                        Bag s = ListBag.get(i);
                        if (s.getName().equalsIgnoreCase(namaUpdate)) {
                            System.out.print("Enter a New Name: ");
                            String newname = scanner.nextLine();

                            System.out.print("Enter New Brand: ");
                            String BrandNew = scanner.nextLine();

                            System.out.print("Enter New Price: ");
                            double newprice = scanner.nextDouble();

                            
                            Bag hpBaru = new Bag(newname, BrandNew, newprice);

                            
                            ListBag.set(i, hpBaru);

                            System.out.println("HP updated successfully!");
                            ditemukanUpdate = true;
                            break;
                        }
                    }

                    if (!ditemukanUpdate) {
                        System.out.println("HP not found.");
                    }
                    break;


                    
                case "5":
                    System.out.print("Enter the name of the cellphone you want to delete:");
                    String namebagDelete = scanner.nextLine();

                    
                    Iterator<Bag> iterator = ListBag.iterator();
                    while (iterator.hasNext()) {
                    Bag objekbag = iterator.next();
                        if (objekbag.getName().equalsIgnoreCase(namebagDelete)) {
                            iterator.remove(); 
                        }
                    }
                    break;

//                

                    
                case "6":
                    System.out.println("Tahnk You!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid selection. Please choose again.");
            }
        }
    }
}



