package ss10_map.practive.sudung_arraylist_linkedlist;

import java.util.Scanner;

public class Test1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        int choice = 0;


        do {
            System.out.println("lua chon");
             choice = Integer.parseInt(sc.nextLine());

            if (choice == 1){
                System.out.println("them : ");

                int id = Integer.parseInt(input("id: "));
                String name = input("name: ");
                int price = Integer.parseInt(input("price"));

                Product product = new Product(id,name,price);
                productManager.add(product);
            }
            else if (choice == 2) {
                productManager.print();

            }
            else if (choice == 3) {
                System.out.println("nhap id ");
                int id1 = Integer.parseInt(sc.nextLine());
                productManager.delete(id1);

            }
            else if (choice == 4) {

                System.out.println(" nhap id sp can sua : ");
                int id1 = Integer.parseInt(sc.nextLine());
                System.out.println("name : ");
                String name = sc.nextLine();
                System.out.println("price : ");
                int price = Integer.parseInt(sc.nextLine());
                Product newProduct = new Product(id1,name,price);
                productManager.edit(id1,newProduct);
            }
            else if (choice == 5) {
                System.out.println("nhap ten muon tim ");
                String name = sc.nextLine();
                productManager.search(name);

            }
            else if (choice == 6) {
                System.out.println("danh sach sap xep theo gia tien tang dan");
                productManager.sortPrice();
                productManager.print();
            }
            else if (choice == 7) {
                System.out.println("danh sach sap xep theo gia tien giam dan");
                productManager.sortPrice();
                productManager.print();
            }

        }while (choice != 0);


    }


    private static String input(String ms){
        System.out.println(ms);
        return sc.nextLine();
    }
}
