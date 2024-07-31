import java.util.Scanner;

public class CustomerManagement {

    static String[][] customer = new String[100][4];
    // customer Process
    public static void customerManagement() {
        Scanner input = new Scanner(System.in);
        String[] cutomerQuestion = {
                "1)Save customer",
                "2)Find customer",
                "3)Update customer",
                "4)Delete customer",
                "5)Find all customers",
                "6)Back to Home",
        };

        while (true){
            for (String question: cutomerQuestion){
                System.out.println(question);
            }

            System.out.println("Enter Your Choice: ");
            int userInput = input.nextInt();

            switch (userInput){
                case 1:
                    saveCustomer();
                    break;
                case 2:
                    findCustomer();
                    break;
                case 3:
                    updateCustomer();
                    break;
                case 4:
                    deleteCustomer();
                    break;
                case 5:
                    findAllCustomers();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid Entry");
                    return;
            }
        }

    }


    //save process
    private static void saveCustomer() {
        Scanner input = new Scanner(System.in);
        Scanner opt = new Scanner(System.in);
        loop:
        while (true){
            String nic,name,address;
            double salary;

            System.out.println("Insert customer NIC:");
            nic= input.nextLine();
            System.out.println("Insert customer Name:");
            name= input.nextLine();
            System.out.println("Insert customer Address:");
            address= input.nextLine();
            System.out.println("Insert customer Salary:");
            salary= opt.nextDouble();


            for (int i = 0; i < customer.length; i++) {
                if(customer[i][0] != null){
                    if(customer[i][0].equals(nic)){
                        System.out.println("Customer already exist!");
                        continue loop;
                    }
                }else {
                    customer[i][0] = nic;
                    customer[i][1] = name;
                    customer[i][2] = address;
                    customer[i][3] = String.valueOf(salary);
                    System.out.println("Customer Saved\n");



                    System.out.println("1) Do you want to add new customer??");
                    System.out.println("2) Back to main menu");

                    System.out.println("Enter your choice: ");
                    int option = opt.nextInt();

                    switch (option) {
                        case 1:
                            continue loop;

                        case 2:
                            return;
                        default:
                            System.out.println("Invalid entry");
                            return;

                    }


                }
            }

        }

    }
    //save process



    //find process
    private static void findCustomer() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your NIC: ");
        String nic = input.nextLine();

        for (int i = 0; i < customer.length; i++) {
            if (customer[i][0] != null){
                if(customer[i][0].equals(nic)){
                    System.out.println("NIC "+customer[i][0]+"/n");
                    System.out.println("Name "+customer[i][1]+"/n");
                    System.out.println("Address "+customer[i][2]+"/n");
                    System.out.println("Salary "+customer[i][3]+"/n/n");
                    return;
                }
            }

        }
        System.out.println("Customer not Found");
    }

    //find process
    //update process
    private static void updateCustomer() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your NIC to update: ");
        String nic = input.nextLine();

        for (int i = 0; i < customer.length; i++) {
            if (customer[i][0] != null) {
                if (customer[i][0].equals(nic)) {

                    String newNic, newName, newAddress;
                    double newSalary;

                    System.out.println("Insert customer NIC:");
                    newNic = input.nextLine();
                    System.out.println("Insert customer Name:");
                    newName = input.nextLine();
                    System.out.println("Insert customer Address:");
                    newAddress = input.nextLine();
                    System.out.println("Insert customer Salary:");
                    newSalary = input.nextDouble();

                    customer[i][0]=newNic;
                    customer[i][1]=newName;
                    customer[i][2]=newAddress;
                    customer[i][3]=String.valueOf(newSalary);


                    System.out.println("NIC " + customer[i][0]);
                    System.out.println("Name " + customer[i][1]);
                    System.out.println("Address " + customer[i][2]);
                    System.out.println("Salary " + customer[i][3]);
                    System.out.println("/n/n/n");
                    return;
                }
            }
        }
        System.out.println("Customer not Found");
    }
    //update process

    //delete process
    private static void deleteCustomer() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the customer NIC that you want to delete:  ");
        String nic = input.nextLine();

        for (int i = 0; i < customer.length; i++) {
            if (customer[i][0]!=null){
                if(customer[i][0].equals(nic)){

                    customer[i][0]=null;
                    customer[i][1]=null;
                    customer[i][2]=null;
                    customer[i][3]=null;

                    System.out.println("Customer Deleted /n/n");
                    break;
                }
            }

        }
        System.out.println("Customer Not Found/n/n");
    }
    //delete process

    //find all customers process

    private static void findAllCustomers() {

        for (int i = 0; i < customer.length; i++) {
            if(customer[i][0] != null){
                System.out.println("NIC: "+customer[i][0] + "/nName: "+customer[i][1] + "/nAddress: "+customer[i][2] + "/nSalary: "+customer[i]
                        [3]);
            }
            return;

        }
    }

    //find all customers process
}
//customer process