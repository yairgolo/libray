package com.yair.model;

public class Storage {


    public Storage(Book[] books, int[] inStock) {
        this.books = books;
        this.inStock = inStock;
    }
    public static Book[] books = new Book[6];
    public static int[] inStock = new int[6];

    public static void addBook(int amount, Book newBook){
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                inStock[i] = amount;
                return;
            }
        }
        System.out.println("There is no space available");
    }
    public String rentBook (Book book){
        for (int i = 0; i < books.length; i++) {
            if (books[i].name.equals(book.name)){
                inStock[i] -= 1;
                return book.name;
            }
        } return null;
    }
    public void returnBook(Book book){
        for (int i = 0; i < books.length; i++) {
            if (books[i].name.equals(book.name)){
                inStock[i]++;
                System.out.println("OK");
            }
        }
    }

    public int getInStock(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].name.equals(book.name)){
                return inStock[i];
            }
        } return 0;
    }

    public static Book[] getBooks() {
        return books;
    }

    public static void setBooks(Book[] books) {
        Storage.books = books;
    }

    public static int[] getInStock() {
        return inStock;
    }

    public static void setInStock(int[] inStock) {
        Storage.inStock = inStock;
    }
    public static void print(){
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }
    }
    public void bestPrint(){
        for (int i = 0; i < books.length; i++) {
            if (books[i] == BestSeller )
        }
    }
}
