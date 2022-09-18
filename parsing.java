import java.util.*;


public class parsing {
    public static String [] digitParsing(char [] array, int i) {
        String [] indexAndString = new String[2];
        String result = "";
        while (Character.isDigit(array[i])){
            result += array[i];
            i++;
        }
        indexAndString[0] = Integer.toString(i);
        indexAndString[1] = result;
        return indexAndString;
        }
    public static String [] letterParsing(char [] array, int i) {
        String [] indexAndString = new String[2];
        String result = "";
        while (Character.isLetter(array[i])){
            result += array[i];
            i++;
        }
        indexAndString[0] = Integer.toString(i);
        indexAndString[1] = result;
        return indexAndString;
        }
        
    public static void main(String [] args) {
        String exp = "(2^3 * (10 / (5 - 3)))^(Sin(Pi))";
        char [] array = exp.toCharArray();
        List<String> list = new LinkedList<>();
        int i = 0; 
        while (i < array.length){
            if (Character.isDigit(array[i])){
                String [] indexAndString = digitParsing(array, i);
                i = Integer.parseInt(indexAndString[0]);
                String str = indexAndString[1];
                list.add(str);
            }
            else if (Character.isLetter(array[i])){
                String [] indexAndString = letterParsing(array, i);
                i = Integer.parseInt(indexAndString[0]);
                String str = indexAndString[1];
                list.add(str);   
            }
            else if (array[i] == ' '){
                i++;
                continue;
            } else {
               list.add(Character.toString(array[i]));
                i++;
            }
        }
        String[] parsedArray = list.toArray(new String[list.size()]); 
        for (int j = 0; j < parsedArray.length; j++){
            System.out.println(parsedArray[j]);
        }
    
}
}