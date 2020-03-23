public class GroceryItem {
    private String Name;
    private  String Price;


    public GroceryItem(String name, String price){
        this.Name = name;
        this.Price = price;
    }

    public String getName() {
        return Name;
    }

    public String getPrice() {
        return Price;
    }
}
