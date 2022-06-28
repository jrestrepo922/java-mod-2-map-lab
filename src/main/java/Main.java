import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a try with resources
        try (Scanner scanner = new Scanner(System.in)) {
            // define a shouldLoop variable
            Boolean moreBooks = true; 
            // Instantiate the library
            Library library = new Library(); 

            System.out.println("========== CREATE A BOOKS AND ADD TO THE LIBRARY ==========");


            // do  a while loop if should loop is set to true
            while(moreBooks){
                
                // ask user if they want to search a book or create one
                System.out.println("Would you like to create a book or search for one? ");
                System.out.println("For create type: create");
                System.out.println("For search type: search");
                String searchOrCreate = scanner.nextLine();


                if(searchOrCreate.equals("create")){

                    // create a scanner that ask for all the construtor values
                    System.out.println("Please provide title");
                    String title = scanner.nextLine();

                    System.out.println("Please provide genre");
                    String genre = scanner.nextLine();

                    System.out.println("Please provide the number of pages");
                    String numberOfPages = scanner.nextLine();

                    // create the book and insert them into library; 
                    Book newBook = new Book(title, genre, Integer.valueOf(numberOfPages)); 
                    library.getCollectionOfBooks().put(newBook.getTitle(), newBook); 

                    System.out.println("Book was created and added to library");
                    // once all the values are entered create another scanner
                    // asking if the user wants to add another book
                    System.out.println("Would you like to create a book or search for one? ");
                    String moreBooksScanner = scanner.nextLine();
                    // if users types no than change shouldLoop to false;
                    if(moreBooksScanner.equals("no")){
                        moreBooks = false;
                    }
                }  else if (searchOrCreate.equals("search")){
                    System.out.println("Please provide the title of the book you would like to search?");
                    String searchByName = scanner.nextLine(); 
                    Book searchedBook = library.getCollectionOfBooks().get(searchByName);
                    if(searchedBook != null){
                        System.out.println("Title: " + searchedBook.getTitle() + ", Genre: " + searchedBook.getGenre() + ", Number of Pages: " + searchedBook.getNumberOfPages());
                    } else {
                        System.out.println("The library does not have that book");
                    }

                    System.out.println("Would you like to create a book or search for one? ");
                    String searchMoreBooksScanner = scanner.nextLine();
                    // if users types no than change shouldLoop to false;
                    if(searchMoreBooksScanner.equals("no")){
                        moreBooks = false;
                    }

                }  else {
                    System.out.println("please type either search or create");
                    return; 
                }            
            } 
        } 
        // catch (Exception e) {
        //     System.out.println("Something when wrong");
        // }
    }
}


// Instructions
// Convert your list-based library from the previous section into a map-based library. In your map-based list of books, use the title of the book as the key and the book itself as the value. Also add a new option to your loop to support the following functionality:

// Ask the user if they want to add a book or look up an existing book
// If they want to look up an existing book, ask them for the title of the book
// Using the title they enter, look up the book in your map-based list
// If you find the book, display the book's information and continue your loop
// If you don't find the book, tell the user your library doesn't have that book and continue your loop