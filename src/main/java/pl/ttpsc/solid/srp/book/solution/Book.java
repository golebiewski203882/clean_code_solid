package pl.ttpsc.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {

    private Map<Integer, String> pages;
    private Author author;
    private String libraryRoomName;
    private String rowLocator;
    private String title;
    private int indexOnShelf;
    private int currentPage;

    public Book() {
        this.pages = new HashMap<>();
        this.author = new Author("", "");
        this.libraryRoomName = "";
        this.rowLocator = "";
        this.title = "";
        this.indexOnShelf = 0;
        this.currentPage = 0;
    }

    public boolean turnPage() {
        if (pages.containsKey(currentPage + 1)) {
            currentPage++;
            return true;
        }
        return false;
    }

    public String getCurrentPageContents() {
        return pages.get(currentPage);
    }

    public Map<Integer, String> getPages() {
        return pages;
    }

    public void setPages(Map<Integer, String> pages) {
        this.pages = pages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getLibraryRoomName() {
        return libraryRoomName;
    }

    public void setLibraryRoomName(String libraryRoomName) {
        this.libraryRoomName = libraryRoomName;
    }

    public String getRowLocator() {
        return rowLocator;
    }

    public void setRowLocator(String rowLocator) {
        this.rowLocator = rowLocator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIndexOnShelf() {
        return indexOnShelf;
    }

    public void setIndexOnShelf(int indexOnShelf) {
        this.indexOnShelf = indexOnShelf;
    }
}
