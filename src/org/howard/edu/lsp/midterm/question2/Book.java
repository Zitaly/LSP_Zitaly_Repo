package org.howard.edu.lsp.midterm.question2;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearpublished;

    public Book(){

    }
    
    public Book(String title, String author, String ISBN, int yearpublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearpublished = yearpublished;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public void setYearpublished(int yearpublished) {
        this.yearpublished = yearpublished;
    }

    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getYearpublished() {
        return yearpublished;
    }


    // Compares attributes to see if equal.
    public boolean equals(Object o) {
        boolean equal = true;
        Book book2 = (Book) o;
        if (book2.title != title) {
            return false;
        }
        else if (book2.author != author) {
            return false;
        }
        else if (book2.ISBN != ISBN) {
            return false;
        }
        else if (book2.yearpublished != yearpublished) {
            return false;
        }
        return equal;
    }

    public String toString() {
        String bookstring = "Title:" + getTitle() + ", Author:" + getAuthor() + ", ISBN:" + getISBN() + ", Year Published:" + getYearpublished();
        return bookstring;
    }

}
