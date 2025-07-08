public class ElectronicBook extends Book implements isEmailed {
    private String fileType;

    public ElectronicBook(String isbn, String title, int year, double price, String fileType) {
        super(isbn, title, year, price);
        this.fileType = fileType;
    }

    @Override
    public double buy(String email, String address, int quantity) {
        if (quantity <= 0) {
            System.out.println("you need to add at least 1 E-book");
            return 0;
        } else {
            System.out.println();
            email(email);
            return getPrice();

        }
    }

    @Override
    public void email(String email) {
        System.out.println("sending to the book to email :" +email);

    }
}
