package library.management.system;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

     public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }
     
       public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }
       
     public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed: " + book.getTitle());
        } else {
            System.out.println("Book not found: " + book.getTitle());
        }
    }
     
      public void registerMember(Member member) {
        members.add(member);
        System.out.println("Member registered: " + member.getMember());
    }
      
      public void borrowBook(Member member, Book book) {
        member.borrowBook(book);
    }
      
       public void returnBook(Member member, Book book) {
        member.returnBook(book);
    }
       
       public void displayBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
      public void displayMembers() {
        System.out.println("Members of the Library:");
        for (Member member : members) {
            System.out.println(member);
        }
    }

}
