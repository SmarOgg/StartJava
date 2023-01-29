package com.startjava.graduation;

public class Book {
    private final String author;
    private final String title;
    private final int publishYear;
    private final int lengthInformation;

    public Book(String author, String bookName, int publishYear) {
        this.author = author;
        this.title = bookName;
        this.publishYear = publishYear;
        lengthInformation = author.length() + bookName.length() + 4;
    }

    public String getTitle() {
        return title;
    }

    public int getLengthInformation() {
        return lengthInformation;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + publishYear;
    }
}
