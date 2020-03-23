import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroceryList {
    private List<GroceryItem> theGroceries = new ArrayList<>();


    public List<GroceryItem> getTheGroceries(){
        return theGroceries;
    }

    public int counter(String groceryName){
        int total = 0;
        for (GroceryItem item: theGroceries) {
            if (item.getName().equals(groceryName)){
                total++;
            }
        }return total;
    }
    public int priceCounter(String groceryPrice, String groceryName){
        int total = 0;
        for (GroceryItem item: theGroceries) {
            if (item.getPrice().equals(groceryPrice) && item.getName().equals(groceryName)){
                total++;
            }
        }return total;
    }

    public void convertAllToList(ArrayList<String> someStringList){
        for (String string: someStringList) {
            theGroceries.add(convertToGroceryItem(string));
        }
    }

    public GroceryItem convertToGroceryItem(String s){
        GroceryItem item = new GroceryItem(convertFood(s),convertPrice(s));
        return item;
    }

    public String convertFood(String s){
        String food = "";
        String foodConverter = "(\\w+)\\W(\\w{3,10})";
        Matcher matcher = Pattern.compile(foodConverter).matcher(s);
        while (matcher.find()){
            food += matcher.group(2);
        }
        return food.toLowerCase();
    }

    public String convertPrice(String s){
        String price = "";
        String priceConverter = "(\\d+\\W\\d+)";
        Matcher matcher = Pattern.compile(priceConverter).matcher(s);
        while (matcher.find()){
        price += matcher.group();
        }
        return price;
    }

}
