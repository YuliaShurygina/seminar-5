//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
//вместо этого, необходимо повторно запросить у пользователя ввод данных.
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            System.out.printf("Вы ввели число %f", inputNumber());
        } catch (NumberFormatException e) {
            System.out.println("Это совсем не число! Проверьте ввод");
            System.out.printf("Вы ввели число %f", inputNumber());
        }
    }

    public static float inputNumber() {
        Scanner scanner = new Scanner(System.in);
        String prompt;
        while (true) {
            System.out.print("Введите дробное число:");
            prompt = scanner.nextLine();
            if ((!prompt.contains(".")) || (parseString(prompt)) || (!parseString2(prompt))) {
                System.out.println("Введите дробное число еще раз!");
                continue;
            } else {
                float number = Float.parseFloat(prompt);
                scanner.close();
                return number;
            }
        }
    }

    public static Boolean parseString(String str) {
        char[] symbols = str.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            if (Character.isLetter(symbols[i]) & (symbols[i] != 'F')) {
                return true;
            }
        }
        return false;
    }

    public static Boolean parseString2(String str) {
        char[] symbols = str.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            if (Character.isDigit(symbols[i])) {
                return true;
            }
        }
        return false;
    }
}
