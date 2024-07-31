import java.util.Scanner;

public class Dashboard {

    public static void openDashboard(){
        Scanner input = new Scanner(System.in);
        String[] dashBoardQuestion = {
                "1)Customer Management",
                "2)Item Management",
                "3)Order Management",
                "4)LogOut",
        };

        while(true){
            for(String question :dashBoardQuestion ) {
                System.out.println(question);
            }
            System.out.println("Enter your choice: ");
            int userInput = input.nextInt();

            switch (userInput){
                case 1:
                    CustomerManagement.customerManagement();
                    break;
                case 2:
                    ItemManagement.itemManagement();
                    break;
                case 3:
                    OrderManagement.orderManagement();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid input");
                    return;
            }


        }
    }

}
