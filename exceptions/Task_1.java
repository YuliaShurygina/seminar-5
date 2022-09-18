import java.util.Scanner;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
// Метод createArray : создает исходный массив, длина которого вводится с клавиатуры
// Возможные ошибки обрабатываются циклом while;
// Метод findArrayElement:найти элемент массива по его индексу. 
// В методе findArrayElement обрабатываем ошибку через код ошибки -1.
// Метод divide осуществляет деление найденного элемента на целое число, вводимое с клавиатуры.
// в этом методе исключение обрабатывается через  RuntimeException("Ошибка: делить на ноль нельзя");

class Task_1 {

    public static int findArrayElement(int[] array, int index) {
        if (index >= array.length) {
            return -1;
        } else {
            return array[index];
        }
    }

    public static float divide(int a1, int a2) {
        if (a2 == 0) {
            throw new RuntimeException("Ошибка: делить на ноль нельзя");
        } else {
            return a1 / a2;
        }
    }

    public static int[] createArray() {
        System.out.print("Введите число элементов массива: ");
        int l = 0;
        while (l <= 0) {
            Scanner sc = new Scanner(System.in);
            l = sc.nextInt();
        }
        int[] array = new int[l];
        for (int i = 0; i < l; i++) {
            array[i] = ((int) (Math.random() * 31) - 15);
        }
        return array;

    }

    public static void main(String[] args) {
        int[] array = createArray();
        System.out.print("Введите индекс нужного элемента: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int answer = findArrayElement(array, index);
        if (answer == -1) {
            System.out.println("Ошибка: проверьте индекс выводимого элемента");

        } else {
            System.out.printf("Элемент с индексом %d равен %d", index, answer);
            System.out.println();
            System.out.println("Введите делитель: ");
            int divider = sc.nextInt();
            System.out.println(divide(answer, divider));
            sc.close();
        }

    }
}