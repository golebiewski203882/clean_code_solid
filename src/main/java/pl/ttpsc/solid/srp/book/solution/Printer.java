package pl.ttpsc.solid.srp.book.solution;

import java.util.Map;

public class Printer {

    public static void printCurrentPage(Book book) {
        System.out.println(book.getPages().get(book.getCurrentPage()));
    }

    public static String printAllPages(Book book) {
        StringBuilder allPages = new StringBuilder();
        for (Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            allPages.append(page.getKey()).append(" ").append(page.getValue());
        }
        return allPages.toString();
    }
}
