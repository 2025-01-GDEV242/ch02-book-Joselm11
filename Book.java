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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    
    // Add the methods here ...
    
    //acessors
    public String getAuthor() {
        return author;
    }
    
    public String getTitle() {
        return title;
    }
    
    //print methods
     public void printAuthor() {
        System.out.println("Author: " + author);
    }

    public void printTitle() {
        System.out.println("Title: " + title);
    }
}
