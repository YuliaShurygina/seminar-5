import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class parsing {
    public static HashMap<Integer, String> digitParsing(char [] array, int i) {
        HashMap<Integer, String> indexAndString = new HashMap<>();
        String result = "";
        while (Character.isDigit(array[i])){
            result += array[i];
            i++;
        }
        indexAndString.put(i, result);
        return indexAndString;
        }
    public static HashMap<Integer, String> digitParsing(char [] array, int i) {
        HashMap<Integer, String> indexAndString = new HashMap<>();
        String result = "";
        while (Character.isDigit(array[i])){
            result += array[i];
            i++;
        }
        indexAndString.put(i, result);
        return indexAndString;
        }
        
    
    public static void main(String [] args) {
        String exp = "(2^3*(10/(5-3)))";
        char [] array = exp.toCharArray();
        int i = 0;
        while (i < array.length){
            if (Character.isDigit(array[i])){
                HashMap<Integer, String> indexAndString = digitParsing(array, i);
                
                i = indexAndString.get(0);
                String str = indexAndString.getValue(i);
            }
            if (Character.isLetter(array[i])){

            }
    }
    
}
}