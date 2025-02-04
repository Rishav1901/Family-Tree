import java.util.ArrayList;
import java.util.Scanner;

class Individual {
    private String name;
    private String birthdate;
    private ArrayList<Individual> children;

    public Individual(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
        this.children = new ArrayList<>();
    }

    public void addChild(Individual child) {
        children.add(child);
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public ArrayList<Individual> getChildren() {
        return children;
    }
}

class FamilyTree {
    private Individual root;

    public FamilyTree(String rootName, String rootBirthdate) {
        root = new Individual(rootName, rootBirthdate);
    }

    public void addChild(Individual parent, Individual child) {
        parent.addChild(child);
    }

    public void visualizeTree(Individual node, int depth) {
        if (node == null) return;

        // Print indentation for hierarchy
        System.out.println("  ".repeat(depth) + node.getName() + " (" + node.getBirthdate() + ")");

        for (Individual child : node.getChildren()) {
            visualizeTree(child, depth + 1);
        }
    }

    public Individual getRoot() {
        return root;
    }
}

public class FamilyTreeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Family Tree Generator!");
        System.out.print("Enter the name of the root individual: ");
        String rootName = scanner.nextLine();
        System.out.print("Enter the birthdate of the root individual: ");
        String rootBirthdate = scanner.nextLine();

        FamilyTree family = new FamilyTree(rootName, rootBirthdate);
        ArrayList<Individual> individuals = new ArrayList<>();
        individuals.add(family.getRoot());

        while (true) {
            System.out.println("\nFamily Tree Generator Menu:");
            System.out.println("1. Add Family Member");
            System.out.println("2. Visualize Family Tree");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            if (choice == 1) {
                System.out.print("Enter parent's name: ");
                String parentName = scanner.nextLine();
                System.out.print("Enter child's name: ");
                String childName = scanner.nextLine();
                System.out.print("Enter child's birthdate: ");
                String childBirthdate = scanner.nextLine();

                boolean parentFound = false;
                for (Individual parent : individuals) {
                    if (parent.getName().equals(parentName)) {
                        Individual child = new Individual(childName, childBirthdate);
                        family.addChild(parent, child);
                        individuals.add(child);
                        parentFound = true;
                        System.out.println("Family member added successfully.");
                        break;
                    }
                }

                if (!parentFound) {
                    System.out.println("Parent not found in the family tree. Please check the name.");
                }
            } else if (choice == 2) {
                System.out.println("\nFamily Tree Visualization:");
                family.visualizeTree(family.getRoot(), 0);
            } else if (choice == 3) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }
}
