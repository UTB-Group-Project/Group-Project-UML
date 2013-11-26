/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject1;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

/**
 *
 * @author Andrew
 */
public class Library {
    
    private ArrayList<Book> library;
            
    //Creates an ArrayList with entries of type Book
    public Library()
    {
        library = new ArrayList()<Book>;
        
    }
    
    //Searches through an "active books" folder for files with a certain suffix (here set to .ubr for the moment)
    //Eventually, it will take all files found in this directory that are properly formatted and make a Book with the data (Title, author, genre, website, icon)
    //NEED: I need stubs for the Book methods so I can implement this.
    public void initialize()
    {
        File parent = new File("C:/path/to/where/you/want");
        //You can check that the File is a directory with...
        
        if (parent.isDirectory()) {
    // Take action of the directory
            }

        //You can list the contents of the directory by...

 //       File[] children = parent.listFiles();
        // This will return null if the path does not exist it is not a directory...
        //You can filter the list in a similar way...
        
        File[] children = parent.listFiles(new FileFilter() {
            public boolean accept(File file) {
                return file.isDirectory() || file.getName().toLowerCase().endsWith(".ubr");
            }
        });
// This will return all the files that are directories or whose file name ends
// with ".dat" (*.dat)
        
        
        //Then go through one at a time, adding each as a book to the library.
        for(int i=0; i<children.length; i++)
        {
            //read children[i] in using a file reader (that needs to be cleaned each time?)
            //Then create a new book with the first 5 lines
            //Then add the new book to the library
        }
    }
    
    //Adds a single book to the library. 
    public boolean addBook(Book b)
    {
        //return true if successful
        return true;
    }
    
    //removes a single book from the library
    public boolean removeBook()
    {
        //return true if successful
        return true;
    }
    
    //**OPTIONAL**
    //Undoes a recent removeBook
    public boolean recover(Book b)
    {
        //return true if successful
        return true;
    }
    
    //Implements the Book search method on all books to find all instances of a search string
    public ArrayList searchAll(String searchString)
    {
        ArrayList results = new ArrayList();
        for(int i=0; i<library.size(); i++)
        {
            //do I need to put the book back in the library?
            //also need to fix "get"
            results.add(library.get(i).search(searchString));
        }
        
        return results;
    }
    
    /*
     * This one needs some serious work, but this would return the text of a given 
    chapter which was passed according to its reference (probably book-chapter)
    */
    public String getChapter(String reference)
    {
        return "This will return a selected chapter";
    }
    
    /*
     * This one needs some serious work, but this would return the text of a given 
    book which was passed according to its reference (probably book-chapter)
    * 
    * I am not sure that both this and the chapter one are needed.  Likely we can
    * pick to return a chapter at a time OR a book at a time and get rid of the other.
    */
    public String getBook(String reference)
    {
        return "This will return a selected book";
    }
    
    
    //saves all highlighted portions of text
    public void saveHighlights()
    {
        ArrayList results = new ArrayList();
        
        //fout = all the stuff needed to print this to a file.
        
        String temp = "";
        //this loops through all books and puts the highlighted text into a file
        for(int i=0; i<library.size(); i++)
        {
            String temp = library.get(i).getHighlighted();
            fout.println(temp);
            temp = "";
            //put back in library?
        }
        
        //this will need a try/catch/throw
        
        //fout.close()
    }
    
    
    public void sortBy(String field)
    {
        //This will sort the books alphabetically by the selected field (title,
        //genre, author), then...return the sorted list?  Do nothing?  TBD
    }
}
