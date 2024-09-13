
package library.management.system;
public class LibraryManagementSystem {
  public static void main(String[] args) {
       Library library = new Library();
      
Book book1 = new Book("Atomic Habits", "James Clear", 01, "11/2/2022");
Book book2 = new Book("The Power of Habit", "Charles Duhigg", 02, "24/12/2015");
Book book3 = new Book("The 7 Habits of Highly Effective People", "Stephen R. Covey", 03, "5/9/1992");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
Member member1 = new Member("Ali", "M001", "ail@gmail.com");
Member member2 = new Member("hassan", "M002", "0123456789");
Member member3 = new Member("abdelrahman", "M003", "010101010");


        library.registerMember(member1);
        library.registerMember(member2);
        library.registerMember(member3);
        
        
        
        library.borrowBook(member1, book1);  
        library.borrowBook(member2, book2); 
        
        library.returnBook(member1, book1); 
        
        
        library.displayBooks();
        library.displayMembers();
        
        
     
        
          }
    
}
