import java.util.ArrayList;
import java.util.Scanner;

public class EquipmentManager {
    private ArrayList<Equipment> equipmentList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void createMobileEquipment() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter description: ");
        String description = scanner.nextLine();
        System.out.print("Enter number of wheels: ");
        int wheels = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        equipmentList.add(new MobileEquipment(name, description, wheels));
    }

    public void createImmobileEquipment() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter description: ");
        String description = scanner.nextLine();
        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        equipmentList.add(new ImmobileEquipment(name, description, weight));
    }

    public void listAllEquipment() {
        if (equipmentList.isEmpty()) {
            System.out.println("No equipment available.");
        } else {
            for (int i = 0; i < equipmentList.size(); i++) {
                System.out.println("Index: " + i + " - " + equipmentList.get(i).getBasicDetails());
            }
        }
    }

    public void showEquipmentDetails(int index) {
        if (index >= 0 && index < equipmentList.size()) {
            System.out.println(equipmentList.get(index).getFullDetails());
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void moveEquipment(int index, double distance) {
        if (index >= 0 && index < equipmentList.size()) {
            equipmentList.get(index).moveBy(distance);
            System.out.println("Equipment moved.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void deleteEquipment(int index) {
        if (index >= 0 && index < equipmentList.size()) {
            equipmentList.remove(index);
            System.out.println("Equipment deleted.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void run() {
        while (true) {
            System.out.println("\nEquipment Manager Menu:");
            System.out.println("1. Create Mobile Equipment");
            System.out.println("2. Create Immobile Equipment");
            System.out.println("3. List All Equipment");
            System.out.println("4. Show Equipment Details");
            System.out.println("5. Move Equipment");
            System.out.println("6. Delete Equipment");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    createMobileEquipment();
                    break;
                case 2:
                    createImmobileEquipment();
                    break;
                case 3:
                    listAllEquipment();
                    break;
                case 4:
                    System.out.print("Enter equipment index: ");
                    int showIndex = scanner.nextInt();
                    showEquipmentDetails(showIndex);
                    break;
                case 5:
                    System.out.print("Enter equipment index: ");
                    int moveIndex = scanner.nextInt();
                    System.out.print("Enter distance to move: ");
                    double distance = scanner.nextDouble();
                    moveEquipment(moveIndex, distance);
                    break;
                case 6:
                    System.out.print("Enter equipment index: ");
                    int deleteIndex = scanner.nextInt();
                    deleteEquipment(deleteIndex);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        EquipmentManager manager = new EquipmentManager();
        manager.run();
    }
}
