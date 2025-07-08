public class DemoBooks extends Book {
    public DemoBooks(String isbn, String title, int year, double price) {
        super(isbn, title, year, price);
    }

    @Override
    public double buy(String email, String address, int quantity) {
        throw new UnsupportedOperationException("demo books aren't for sale");

    }
}
