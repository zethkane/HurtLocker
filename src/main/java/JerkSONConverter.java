import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JerkSONConverter {
    private static String lineFixer = "[A-za-z]+\\W{1,2}[A-Za-z]+\\W{1,2}[A-Za-z]+\\W{1,2}\\d{1}\\.\\d+";
    private static String wholeLines = "[A-Za-z]\\W{1,2}[A-Za-z0-9]{0,8}\\W{1,2}[A-Za-z]+\\W{1,2}[A-Za-z0-9:;^\\.]{0,5}+\\W{1,2}[A-Za-z]+\\W{1,2}[A-Za-z]+\\W{1,2}\\d{1}\\W{1}\\d{2}\\W{1}\\d{4}";

    public ArrayList<String> lineBreaker(String string){
        ArrayList<String> broken = new ArrayList<>();
        Matcher matcher = Pattern.compile(lineFixer).matcher(string);
        while(matcher.find()){
            broken.add(matcher.group());
        }
        return broken;
    }

    public int wholeLength(String string){
        ArrayList<String> broken = new ArrayList<>();
        Matcher matcher = Pattern.compile(wholeLines).matcher(string);
        while(matcher.find()){
            broken.add(matcher.group());
        }
        return broken.size();
    }
}
