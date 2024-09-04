package assignment_3;
import java.util.*;
public class Assignment_3 {
  static  Scanner s = new Scanner(System.in);
  static int successive_correct;
  static int  successive_wrong;
  static boolean exit=false;
  static int finalScore=0;
  static String name="";
  static int numberOfQuestions;
    public static void main(String[] args) {
        
        System.out.println("Welcome to the Multiplication Learning Game !");
            System.out.println("Enter Your name : ");
            s.nextLine();
             name= s.nextLine();
           
            
           while(!exit){
            System.out.println("1 .Start Game ");
            System.out.println("2. Help ");
            System.out.println("3. Show High Score ");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choose = s.nextInt();
               
               
            switch (choose) {
                case 1 -> friLevel();
                case 2 -> help();
                case 3 -> System.out.println("The High Score is: " + finalScore);
                case 4 -> exit();
                default -> System.out.println("Invalid option selected, please try again.");
                 }
              
            }
          }
    
    
    
    
    
    static void friLevel(){
         System.out.println("1st difficulty level.");
         for(int i=1;i<=20;i++){
            if(successive_wrong==3){
                System.out.println("Game over. You ve made 3 successive wrong answers\n please ask your teacher for extra help.");
                System.out.println("The High Score is :"+finalScore);
                exit=true;
                break ;
                
               }
           
            int num1=(int)(Math.random() * (10-0+1) + 0);
            int num2=(int)(Math.random() * (10-0+1) + 0);
            
            System.out.println("How much is "+num1+" times "+num2+"?");
            int answer = s.nextInt();
            
            if(answer==num1*num2){
                System.out.println("correct !");
                successive_correct+=1;
                finalScore++;
                successive_wrong=0;
                numberOfQuestions++;
                
            }else{
                System.out.println("Wrong answer.");
                successive_wrong+=1;
                successive_correct=0;
                numberOfQuestions++;}
            
            if(successive_correct==3)  {
              successive_correct=0;  
              secLevel();
              break;
             }
           if(numberOfQuestions==20){
              System.out.println("Congratulations! "+ name +" you won");
              System.out.println("your score is "+finalScore+"/20");
              exit=true;
              break;
           }
         }
    }
    
    
    static void secLevel(){
         System.out.println("2rd difficulty level.");
         for(int i=1;i<=20;i++){
            if(successive_wrong==3){
                System.out.println("Game over. You ve made 3 successive wrong answers\n please ask your teacher for extra help.");
                System.out.println("The High Score is :"+finalScore); 
                exit=true;
                break;
               }
           
            int num1=(int)(Math.random() * (20-10+1) + 10);
            int num2=(int)(Math.random() * (20-10+1) + 10);
            
            System.out.println("How much is "+num1+" times "+num2+"?");
            int answer = s.nextInt();
            
            if(answer==num1*num2){
                System.out.println("correct !");
                successive_correct+=1;
                finalScore++;
                successive_wrong=0;
                numberOfQuestions++;
                
            }else{
                System.out.println("Wrong answer.");
                successive_wrong+=1;
                successive_correct=0;
                numberOfQuestions++;}
              if( successive_correct==3)  {
              successive_correct=0;    
              thrLevel();
              break;
             }
              if(numberOfQuestions==20){
              System.out.println("Congratulations! "+ name +" you won");
              System.out.println("your score is "+finalScore);
              exit=true;
              break;
           }
         } 
     }
    
    static void thrLevel(){
         System.out.println("3rd difficulty level.");
         for(int i=1;i<=20;i++){
            if(successive_wrong==3){
                System.out.println("Game over. You ve made 3 successive wrong answers\n please ask your teacher for extra help.");
                System.out.println("The High Score is :"+finalScore);
                exit=true;
                break;
               }
           
            int num1=(int)(Math.random() * (50-20+1) + 20);
            int num2=(int)(Math.random() * (50-20+1) + 20);
            
            System.out.println("How much is "+num1+" times "+num2+"?");
            int answer = s.nextInt();
            
            if(answer==num1*num2){
                System.out.println("correct !");
                successive_correct+=1;
                finalScore++;
                successive_wrong=0;
                numberOfQuestions++;
                
            }else{
                System.out.println("Wrong answer.");
                successive_wrong+=1;
                successive_correct=0;
                numberOfQuestions++;}
            
              if( successive_correct==3)  {
              System.out.println("Congratulations! "+ name +" you won");
              System.out.println("your score is "+finalScore);
              exit=true;
              break;
             }
              if(numberOfQuestions==20){
              System.out.println("Congratulations! "+ name +" you won");
              System.out.println("your score is "+finalScore );
              exit=true;
              break;
           }
            
         }  
     }

    
    static void exit(){
         System.out.print("Are you sure you want to exit? (y/n): ");
                  s.nextLine();
                  String confirmation = s.nextLine();

                    if (confirmation.equalsIgnoreCase("y")) {
                        exit = true;  
                        System.out.println("Goodbye!");
                    } else {
                        System.out.println("Returning to the main menu...");
                    }
    }
    
    static void help(){
        System.out.println("Instructions:");
        System.out.println("1. Answer multiplication questions to improve your skills.");
        System.out.println("2. The difficulty level increases after three consecutive correct answers.");
        System.out.println("3. The game ends after 20 questions or if you get three consecutive wrong answers.");
    }
 
}

