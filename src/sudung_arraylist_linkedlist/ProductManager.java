package ss10_map.practive.sudung_arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    private ArrayList<Product> danhSach;

    public ProductManager(){
        this.danhSach = new ArrayList<Product>();
    }

    public ProductManager(ArrayList<Product> danhSach) {
        this.danhSach = danhSach;
    }

    // ADD
    public void add(Product sp){
        this.danhSach.add(sp);
    }

     // print
    public void print(){
        for (Product product : danhSach){
            System.out.println(product);
        }
    }
    // Delete
    public boolean delete(int id){
//        return this.danhSach.removeIf(e->e.getId() ==id);

        for (int i = 0; i < danhSach.size(); i++) {
            if(danhSach.get(i).getId() == id){
                danhSach.remove(i);
                return true;
            }
        }

        return false;
    }

    // edit
    public void edit(int id, Product newProduct){
        for (int i=0; i<danhSach.size(); i++){
            if(danhSach.get(i).getId() == id){
                danhSach.set(i,newProduct);
            }
        }
    }

    // Search
    public void search(String name){
        for (Product product : danhSach){
            if (product.getName().equals(name)){
                System.out.println(product);
            }else {
                System.out.println("khong ton tai");
            }
        }
    }

    // sap xep tang dan theo gia tien (cach viet ngan gon)
    public void sortPrice(){
        Collections.sort(danhSach, Comparator.comparing(Product::getPrice));
    }
    // sap xep giam dan theo gia tien (cach viet ngan gon)
    public void sortPrice1(){
        Collections.sort(danhSach, Comparator.comparing(Product ::getPrice).reversed());
    }

}
