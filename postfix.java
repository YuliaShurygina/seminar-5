import java.util.Stack;
//Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.
//Вычислить запись если это возможно
public class postfix {
    public static int findPriority(char c) {
           
        if (c == '(') return 1;
        if (c == '^') return 3;
        if (c == '*' || c == '/') return 2;
        if (c == '+' || c == '-') return 4;
        else return 0;
    }
    public static void main(String [] args) {
        var exp = "(2^3*(10/(5-3)))";
        char [] array = exp.toCharArray();
        Stack<Character> st = new Stack<>();
        String outputString = "";
        int i = 0;
        while (i < array.length){
            
            if (Character.isDigit(array[i])){
                outputString += array[i];
                
            }
            if (array[i] == '('){
                st.add(array[i]);
            }
            if (array[i] == ')'){
                char a = st.peek();
                while(a != '('){
                    outputString += a;
                    st.pop();
                    a = st.peek();
                }
                st.pop();
            }  
            if (array[i] == '+' || array[i] == '*' || array[i] == '^' || array[i] == '/' || array[i] == '-'){
                
                if (st.isEmpty() || (findPriority(st.peek()) < findPriority(array[i]))) st.add(array[i]);
                else {
                    while(findPriority(st.peek()) >= findPriority(array[i])){
                        outputString += st.pop();
                        
                    }
                    if ((st.isEmpty() || findPriority(st.peek()) < findPriority(array[i]))) st.add(array[i]);
                }
            }
            if (i == array.length - 1){
                while (!st.isEmpty()){
                    outputString += st.pop();
                }
            }    
            
           
            
            i++;
            } 
        System.out.println(outputString);
        }
    }
        
    

    

