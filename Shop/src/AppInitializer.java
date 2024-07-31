
import java.util.Scanner;
public class AppInitializer {

    static boolean exitState = true;
    public static void main(String[] args) {

        //objects//
        Login l1 = new Login();
        Register r1 = new Register();
        Dashboard d1= new Dashboard();
        //objets//



         //program initialization
        Scanner input = new Scanner(System.in);
        String[] initializePageQuestions= {
                "1)Do you want to login?",
                "2)Are you new to here",
                "3)Do you want to exit the page"
                };
   while(exitState){
       for(String question: initializePageQuestions){
           System.out.println(question);
       }

       System.out.println("Enter your choice: ");
       int userInput = input.nextInt();

       switch(userInput){
           case 1:
               if(l1.login()){
                   d1.openDashboard();
               }
               break;
           case 2:
               if(r1.register()){
                   d1.openDashboard();
               }
               break;
           case 3:
               System.out.println("Good byee!!");
               return;
           default:
               System.out.println("Invalid input...");

       }

   }

        //program initialization
    }

}

