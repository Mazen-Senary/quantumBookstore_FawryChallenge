//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book b1=new PaperBook("A11","MATH",2020,67,20);
        Book b2=new ElectronicBook("A12","science",2024,54,"pdf");
        Book b3=new PaperBook("A14","MATH",2007,67,10);
        Book b4=new ElectronicBook("A13","science",2004,54,"pdf");
        BookInventory inventory = new BookInventory();
       inventory.addBooks(b1);
       inventory.addBooks(b2);
        inventory.addBooks(b3);
        inventory.addBooks(b4);
        double total = b1.buy("mazen@gmail.com", "smouha", 2);
        System.out.println("Quantum book store: You paid $" + total);
        System.out.println(" Removing outdated books...");
        for (Book outdated : inventory.removeBooks()) {
            System.out.println("Removed: " + outdated.getTitle() + " (" + outdated.getYear() + ")");
        }

        System.out.println(" Current Inventory:");
        for (Book book : inventory.getAllBooks()) {
            System.out.println("- " + book.getTitle() + " (" + book.getYear() + ")");
        }
    }


    }
