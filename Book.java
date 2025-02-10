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
    private int borrowed;
    private final boolean courseText;
    /**
     * Set the author, title, and pages fields when this object
     * is constructed.
     * reference number starts as empty string
     * borrowed count begins at 0
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText) {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = isCourseText;
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
    
    public int getBorrowed(){
        return borrowed;
    }
    
    public boolean isCourseText(){
        return courseText;
    }
    
    //setter
    public void setRefNumber(String ref) {
        //needs 3 characters or else error
        if (ref.length() >= 3) {
            refNumber = ref;
        } 
        else {
            System.out.println("Error: Reference number must be at least 3 characters long!!!");
        }
    }
    
    public void borrow() {
        //increases borrowed count each time it is called
        borrowed++;
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
        
        //reference number length has to be more than 0 to print anything
        if (refNumber.length() > 0) {
            System.out.println("Reference Number: " + refNumber);
        } 
        else {
            System.out.println("ZZZ");
        }
        
        //borrowed amount
        System.out.println("Times Borrowed: " + borrowed);
        
        //course text boolean
        if (courseText) {
            System.out.println("Course Textbook: Yes");
        }
        else {
            System.out.println("Course Textbook: No");
        }
    }
}
