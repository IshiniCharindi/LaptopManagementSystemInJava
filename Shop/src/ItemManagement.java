import java.util.ArrayList;
import java.util.Scanner;

public class ItemManagement {

    static ArrayList<String[]> items = new ArrayList<>();

    static {
        // Initialize items
        items.add(new String[]{"001", "Apple MacBook air m2    ", "5", " LKR 365,000.00"});
        items.add(new String[]{"002", "Asus Zenbook 14 OLED    ", "7", " LKR 222,200.00"});
        items.add(new String[]{"003", "Asus Zenbook S 13 OLED  ", "2", " LKR 499,000.00"});
        items.add(new String[]{"004", "Dell XPS 15 (9530)      ", "3", " LKR 445,500.00"});
        items.add(new String[]{"005", "Asus ROG Strix Scar 18  ", "10", " LKR1,122,000.00"});
        items.add(new String[]{"006", "Lenovo Yoga 9i (Gen 8)  ", "5", " LKR 760,000.00"});
        items.add(new String[]{"007", "Acer Chromebook Spin 714", "6", " LKR 264,000.00"});
        items.add(new String[]{"008", "MacBook Pro 14 (M3, 2023)", "1", " LKR 538,000.00"});
        items.add(new String[]{"009", "Lenovo X1 Carbon (11th Gen)", "9", " LKR 495,000.00"});
        items.add(new String[]{"010", "Acer Swift 14            ", "4", " LKR 323,072.00"});
    }

    public static void itemManagement() {
        Scanner input = new Scanner(System.in);

        String[] itemQuestion = {
                "1)Add Item",
                "2)Delete Item",
                "3)Find All Items",
                "4)Exit",
        };

        while (true) {
            for (String question : itemQuestion) {
                System.out.println(question);
            }

            System.out.println("Enter your choice: ");
            int ch = input.nextInt();

            switch (ch) {
                case 1:
                    addItem();
                    break;
                case 2:
                    deleteItem();
                    break;
                case 3:
                    itemDisplay();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid Entry");
                    return;
            }
        }
    }

    public static void itemDisplay(){
        System.out.println("Item Code | \t\tDescription | \t\t\tAvailable Units | \t\t\tUnit price |");
        for (String[] item : items) {
            System.out.println(item[0] + "\t\t\t\t" + item[1] + "\t\t\t" + item[2] + "\t\t\t\t" + item[3]);
        }
    }

    public static void addItem(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Item Code: ");
        String i1 = input.nextLine().trim();
        System.out.println("Enter the Item Description: ");
        String i2 = input.nextLine().trim();
        System.out.println("Enter the available Items: ");
        String i3 = input.nextLine().trim();
        System.out.println("Enter the Unit Price(Ex:-LKR xxxxxxx.xx): ");
        String i4 = input.nextLine().trim();

        for (String[] item : items) {
            if (item[0].equals(i1)) {
                System.out.println("Item already added");
                return;
            }
        }

        // If item not found, add it
        items.add(new String[]{i1, i2,"\t", i3, i4});
        System.out.println("Item added successfully");
    }

    public static void deleteItem(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Item Code: ");
        String i1 = input.nextLine();

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i)[0].equals(i1)) {
                items.remove(i);
                System.out.println("Item Deleted");
                return;
            }
        }
        System.out.println("Item Cannot found");
    }

    public static void main(String[] args) {
        itemManagement();
    }
}
