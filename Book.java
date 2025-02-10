/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    // objects are not immutable because they do not have Final
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author, title, and pages fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages) {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }
    
    // Add the methods here ...
    
    //acessors
    public String getAuthor() {
        return author;
    }
    
    public String getTitle() {
        return title;
    }
    
     public int getPages() {
        return pages;
    }
    
     public String getRefNumber() {
        return refNumber;
    }
    
    //setter
    public void setRefNumber(String ref) {
        if (ref.length() >= 3) {
            refNumber = ref;
        } 
        else {
            System.out.println("Error: Reference number must be at least 3 characters long!!!");
        }
    }
    //print methods
    public void printAuthor() {
        System.out.println("Author: " + author);
    }

    public void printTitle() {
        System.out.println("Title: " + title);
    }
    
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        
        if (refNumber.length() > 0) {
            System.out.println("Reference Number: " + refNumber);
        } 
        else {
            System.out.println("ZZZ");
        }
    }
}
