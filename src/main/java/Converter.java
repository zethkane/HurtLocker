import javax.annotation.processing.Filer;
import java.io.BufferedReader;
import java.io.FileReader;

public class Converter {

    public String addSpace(String string){
        String space = "";
        while (space.length() != 8 - string.length()){
            space += " ";
        }
        space += string;
        return space;
    }

    public String addSeparator(){
        String separator = "=============";
        return separator;
    }
    public String addDashes(){
        String dashes = "-------------";
        return dashes;
    }

    public String priceSpace(String string){
        String space = "";
        while (space.length() != 7 - string.length()){
            space += " ";
        }
        space += string;
        return space;
    }
    public String printMilk(GroceryList myList){
        String foodPrinter = "";
        String pricePrinter1 = "";
        String pricePrinter2 = "";
        foodPrinter += "Name:" + addSpace("Milk") + "       seen: " + myList.counter("milk") +" times\n" + addSeparator()+ "       "+ addSeparator()+"\n";
        pricePrinter1 += "Price:" + priceSpace("3.23") + "       " + "Seen: "+
                myList.priceCounter("3.23", "milk") + " times\n" + addDashes()+ "       " + addDashes()+ "\n";
        pricePrinter2 += "Price:" + priceSpace("1.23") + "       " + "Seen: "+
                myList.priceCounter("1.23", "milk") + " times\n" + addDashes()+ "       " + addDashes()+ "\n";


        return foodPrinter + pricePrinter1 + pricePrinter2 ;
    }

    public String printCookies(GroceryList myList){
        String foodPrinter = "";
        String pricePrinter = "";
        foodPrinter += "Name:" + addSpace("Cookies") + "       seen: " + myList.counter("cookies") +" times\n" + addSeparator()+ "       "+ addSeparator()+"\n";
        pricePrinter += "Price:" + priceSpace("2.25") + "       " + "Seen: "+
                myList.priceCounter("2.25", "cookies") + " times\n" + addDashes()+ "       " + addDashes()+ "\n";


        return foodPrinter + pricePrinter;
    }

    public String printBread(GroceryList myList){
        String foodPrinter = "";
        String pricePrinter = "";
        foodPrinter += "Name:" + addSpace("Bread") + "       seen: " + myList.counter("bread") +" times\n" + addSeparator()+ "       "+ addSeparator()+"\n";
        pricePrinter += "Price:" + priceSpace("1.23") + "       " + "Seen: "+
                        myList.priceCounter("1.23", "bread") + " times\n" + addDashes()+ "       " + addDashes()+ "\n";


        return foodPrinter + pricePrinter;
    }

    public String printApples(GroceryList myList){
        String foodPrinter = "";
        String pricePrinter1 = "";
        String pricePrinter2 = "";
        foodPrinter += "Name:" + addSpace("Apples") + "       seen: " + myList.counter("apples") +" times\n" + addSeparator()+ "       "+ addSeparator()+"\n";
        pricePrinter1 += "Price:" + priceSpace("0.25") + "       " + "Seen: "+
                myList.priceCounter("0.25", "apples") + " times\n" + addDashes()+ "       " + addDashes()+ "\n";
        pricePrinter2 += "Price:" + priceSpace(".23") + "       " + "Seen: "+
                myList.priceCounter("0.23", "apples") + " times\n" + addDashes()+ "       " + addDashes()+ "\n";


        return foodPrinter + pricePrinter1 + pricePrinter2 ;
    }

    public String errorCounterPrinter(GroceryList myList, int number){
        return "Errors:" + addSpace("") + "     seen: " + "?how t" + " times";
    }



}
