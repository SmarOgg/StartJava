package com.startjava.graduation;

import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        int menuItem = 0;

        while (menuItem != 4) {
            if (menuItem != 0) {
                System.out.print("Для продолжения работы нажмите Enter");
                input.next();
            }
            printBookshelf(bookshelf);

            System.out.println("""
                    \n1. Добавить книгу
                    2. Удалить книгу
                    3. Очистить шкаф
                    4. Завершить
                    """);
            System.out.print("Введите пункт меню : ");
            menuItem = input.nextInt();
            switch (menuItem) {
                case (1) -> {
                    System.out.println("Добавление книги в шкаф");

                    System.out.print("Введите автора : ");
                    String author = input.next();
                    System.out.print("Введите название книги : ");
                    String title = input.next();
                    System.out.print("Введите год издания : ");
                    int publishYear = input.nextInt();

                    Book book = new Book(author, title, publishYear);
                    if (!bookshelf.add(book)) {
                        System.out.println("Книга не была добавлена. На полке кончилось место.");
                    }
                }
                case (2) -> {
                    System.out.println("Удаление книги из шкафа");
                    System.out.print("Введите название книги : ");
                    String title = input.next();
                    if (!bookshelf.delete(title)) {
                        System.out.println("Книга не была найдена на полке.");
                    }
                }
                case (3) -> bookshelf.clear();
                case (4) -> {
                }
                default -> {
                    menuItem = 0;
                    System.out.println("Введен неверный пункт меню.");
                }
            }
        }
        input.close();
    }

    private static void printBookshelf(Bookshelf bookshelf) {
        Book[] books = bookshelf.getAllBooks();
        int maxLength = bookshelf.getMaxLengthBookInformation();
        int numBooks = bookshelf.getNumBooks();

        if (numBooks == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            System.out.println("В шкафу " + numBooks + " книги и свободно " + bookshelf.countEmptyShelf() + " полок.");
            System.out.println();
            for (Book b : books) {
                if (b != null) {
                    System.out.print("|" + b);
                    int count = maxLength - b.getLengthInformation();
                    System.out.println(count == 0 ? "|" : " ".repeat(count) + "|");
                    System.out.println("-".repeat(maxLength + 6));
                }
            }
            if (numBooks < books.length) {
                System.out.println("|" + " ".repeat(maxLength + 4) + "|");
            }
        }
    }
}