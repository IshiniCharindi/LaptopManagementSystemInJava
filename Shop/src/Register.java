import java.util.Scanner;

public class Register {

    //register process
    public static boolean register(){
        //[free??],[1?,2?,3?]======>empty===>insert value



        Scanner input = new Scanner(System.in);
        if(Login.users[Login.users.length-1][0] != null){
            System.out.println("User database is already full");
            return false;
        }
        System.out.println("Insert your email: ");
        String email=input.nextLine();

        System.out.println("Insert your password: ");
        String password= input.nextLine();

        for(int x=0;x< Login.users.length;x++){
            if(Login.users[x][0]==null){
                Login.users[x][0]=email;
                Login.users[x][1]=password;

            }else{
                if(Login.users[x][0].equalsIgnoreCase(email)){
                    System.out.println("Email is already exists");
                    return false;
                }
            }
        }
        return false;
    }

}
//register process