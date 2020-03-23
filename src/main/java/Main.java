import org.apache.commons.io.IOUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();
        JerkSONConverter jerkConverter = new JerkSONConverter();
        GroceryList myList = new GroceryList();
        Converter converter = new Converter();
        int originalLength = jerkConverter.wholeLength(output);
        myList.convertAllToList(jerkConverter.lineBreaker(output));
        System.out.println(converter.printMilk(myList));
        System.out.println(converter.printApples(myList));
        System.out.println(converter.printBread(myList));
        System.out.println(converter.printCookies(myList));


        System.out.println(converter.errorCounterPrinter(myList, originalLength));

    }
//    public int errorCounter(){
//        String line = "";
//        int errorCount = 0;
//        String[] strArr;
//        try{
//            BufferedReader br = new BufferedReader(new FileReader("RawData.txt"));
//            while(line = br.readLine() != null)
//            strArr = line.split(":")
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
