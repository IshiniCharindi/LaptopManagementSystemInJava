import java.util.Scanner;

public  class Login {

    //login process
    static String[][] users =  new String[3][2];

    public static boolean login(){
        users[0][0]="ishini@gmail.com";
        users[0][1]="1234";
        Scanner input = new Scanner(System.in);

        System.out.println("Insert your Email: ");
        String email=input.nextLine();
        System.out.println("Insert your Password: ");
        String password=input.nextLine();

        for (int i = 0; i < users.length; i++) {
            if(users[i][0]!=null &&  users[i][0].equals(email)){
                if(users[i][1].equals(password)){
                    System.out.println("Welcome");
                    return true;
                }
                else{
                    System.out.println("wrong password");
                    return false;
                }
            }

        }
        System.out.println("404 Not Found");
        return false;

    }


    //login process
}
