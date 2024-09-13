
package library.management.system;
import java.util.ArrayList;
public class Member {
        private String Member;
        private String membership_ID;
        private String contact_information;
        private ArrayList<Book> borrowedBooks;
        

    public Member(String Member, String  membership_ID, String contact_information) {
        this.Member = Member;
        this.membership_ID = membership_ID;
        this.contact_information = contact_information;
        this.borrowedBooks = new ArrayList<>();  
    }
    public String getMember() {
        return Member;
    }

    public void setMember(String Member) {
        this.Member = Member;
    }

    public String getMembership_ID() {
        return membership_ID;
    }

    public void setMembership_ID(String membership_ID) {
        this.membership_ID = membership_ID;
    }

    public String getContact_information() {
        return contact_information;
    }

    public void setContact_information(String contact_information) {
        this.contact_information = contact_information;
    }
        
        
     public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setIsAvailable(false);  
            System.out.println("Book borrowed successfully: " + book.getTitle());
        } else {
            System.out.println("Book is not available: " + book.getTitle());
        }
    }
     
     
      public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.setIsAvailable(true);  
            System.out.println("Book returned successfully: " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by this member.");
        }
    }
    
}
