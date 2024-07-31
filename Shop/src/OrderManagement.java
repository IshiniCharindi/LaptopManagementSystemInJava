import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class OrderManagement {

    static ArrayList<String[]> orders = new ArrayList<>();

    public static void orderManagement() {
        //customer
        Scanner input = new Scanner(System.in);

        System.out.println("Enter customer NIC: ");
        String nic = input.nextLine();

        String name, address;
        double salary;

        for (String[] customer : CustomerManagement.customer) {
            if (customer[0] != null) {
                if (customer[0].equals(nic)) {
                    name = customer[1];
                    address = customer[2];
                    salary = Double.parseDouble(customer[3]);
                }
            }
        }
        //customer

        //item
        ItemManagement.itemDisplay();

        System.out.println("Enter Item Code: ");
        String code = input.nextLine();

        System.out.println("Enter the quantity ordered: ");
        int qty = input.nextInt();

        String description;
        double unitPrice = 0;
        int qtyOnHand = 0;

        for (String[] item : ItemManagement.items) {
            if (item[0] != null) {
                if (item[0].equals(code)) {
                    description = item[1];
                    qtyOnHand = Integer.parseInt(item[2]);
                    unitPrice = Double.parseDouble(item[3]);
                }
            }
        }

        //Item process
        int x = qtyOnHand - qty;
        String s = Integer.toString(x);
        for (String[] item : ItemManagement.items) {
            if (item[0].equals(code)) {
                item[2] = s;
            }
        }
        //Item process

        if (qtyOnHand > 0 && qty < qtyOnHand) {

            //Order Process
            System.out.println("Enter the order Id: ");
            String orderId = input.nextLine();

            for (String[] order : orders) {
                if (order[0] != null) {
                    if (order[0].equals(orderId)) {
                        System.out.println("order already exist.");
                        return;
                    } else {
                        Date date = new Date();
                        SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd");
                        String selectedDate = f.format(date);
                        String[] newOrder = {orderId, nic, code, selectedDate, String.valueOf(unitPrice * qty)};
                        orders.add(newOrder);

                        //print order details
                        System.out.println("================Order Details===============");
                        System.out.println("Order ID\tNIC\tItem Code\tOrder Date\tTotal");
                        System.out.println(newOrder[0] + "\t" + newOrder[1] + "\t" + newOrder[2] + "\t" + newOrder[3] + "\t" + newOrder[4]);
                        //print order details
                    }
                }
            }
            System.out.println("Order Complete");
        }
        //Order Process
        System.out.println("Sorry!!!The item is not available");
    }
}
