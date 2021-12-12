package com.yair.model;

public class NotInStockException extends Exception {

    private Book book;

    public NotInStockException (Book book){
        super("The following book is out of stock: " + book.toString());
    }
}
