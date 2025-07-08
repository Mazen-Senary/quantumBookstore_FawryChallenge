public class PaperBook extends Book implements isShippable{
    private int stock;

    public PaperBook(String isbn, String title, int year, double price, int stock) {
        super(isbn, title, year, price);
        this.stock = stock;
    }

    @Override
    public double buy(String email, String address, int quantity) {
        if(stock<quantity){
            System.out.println("stock isn't sufficent");
            return 0;
        }
        else{
            stock=stock-quantity;
            ship(address);
            return getPrice() * quantity;

        }
    }

    @Override
    public void ship(String address) {
        System.out.println("Shipping to address : " +address);

    }
}
