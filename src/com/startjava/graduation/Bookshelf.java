package com.startjava.graduation;

import java.util.Arrays;

public class Bookshelf {
    private final Book[] books = new Book[10];
    private int numBooks;
    private int maxLengthBookInformation = 0;

    public Bookshelf() {
        clear();
    }

    public boolean add(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            if (book.getLengthInformation() > maxLengthBookInformation) {
                maxLengthBookInformation = book.getLengthInformation();
            }
            numBooks++;
        }
        return numBooks != books.length;
    }

    public boolean delete(String title) {
        int index = find(title);

        if (index < books.length) {
            numBooks--;
            if (books[index].getLengthInformation() == maxLengthBookInformation) {
                System.arraycopy(books, index + 1, books, index, books.length - index - 1);
                books[numBooks] = null;
                findMaxLengthBookInformation();
            } else {
                System.arraycopy(books, index + 1, books, index, books.length - index - 1);
                books[numBooks] = null;
            }
        }
        return index != books.length;
    }

    public void clear() {
        numBooks = 0;
        maxLengthBookInformation = 0;
        Arrays.fill(books, null);
    }

    public Book[] getAllBooks() {
        return books;
    }

    public int getNumBooks() {
        return numBooks;
    }

    public int countEmptyShelf() {
        return books.length - numBooks;
    }

    public int getMaxLengthBookInformation() {
        return maxLengthBookInformation;
    }

    private int find(String title) {
        int index = books.length;

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getTitle().equals(title)) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    private void findMaxLengthBookInformation() {
        int maxLength = 0;

        for (Book b : books) {
            if (b != null) {
                if (b.getLengthInformation() > maxLength) {
                    maxLength = b.getLengthInformation();
                }
            }
        }

        maxLengthBookInformation = maxLength;
    }
}
