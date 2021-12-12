package com.yair;

import com.yair.model.BestSeller;
import com.yair.model.Book;
import com.yair.model.NotInStockException;
import com.yair.model.Storage;

public class LibrayCase {

    public static void main(String[] args) throws NotInStockException {
        Book book1 = new Book(1, "Dani-din", 30);
        Book book2 = new Book(2, "Harry-potter", 50);
        Book book3 = new Book(3, "The-maze-runner", 80);
        BestSeller bestSeller1 = new BestSeller(4,"The-scorch-trials", 100, "next of The-maze-runner", 2);
        BestSeller bestSeller2 = new BestSeller(5,"The-death-cure", 120, " next of The-scorch-trials", 2);
        BestSeller bestSeller3 = new BestSeller(6,"Divergent", 140, "good book", 3);

        Storage.addBook(3,book1);
        Storage.addBook(3,book2);
        Storage.addBook(3,book3);
        Storage.addBook(3,bestSeller1);
        Storage.addBook(3,bestSeller2);
        Storage.addBook(3,bestSeller3);

        Storage.print();
        Storage.bestPrint();
        Storage.rentBook(book1);
        System.out.println(Storage.getInStock(book1));
        Storage.rentBook(book1);
        System.out.println(Storage.getInStock(book1));
        Storage.rentBook(book1);
        System.out.println(Storage.getInStock(book1));

        try {
            Storage.rentBook(book1);
        } catch (NotInStockException e){
            System.out.println(e);
        }
        Storage.print();
    }
}
