import java.util.Scanner;
//Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class Task4 {
    public static void main(String[] args) {
        try {
            System.out.print("Введите строку:");
            System.out.printf("Вы ввели строку %s", inputSomeString());
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static String inputSomeString() throws MyException {
        try (Scanner scanner = new Scanner(System.in)) {
            String prompt;
            prompt = scanner.nextLine();
            if (prompt.isEmpty()) {
                throw new MyException("Пустые строки вводить нельзя!");
            } else {
                return prompt;
            }
        }
    }
}
