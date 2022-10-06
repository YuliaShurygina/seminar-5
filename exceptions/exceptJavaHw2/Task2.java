public class Task2 {
    public static void main(String[] args) {
        try {
            int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int number = 0;
            int item = 8;
            System.out.println("catchedRes1 = " + defineResult(array, number, item));
        } catch (NullPointerException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Проверьте индекс элемента массива: " + e);
        } catch (Throwable e) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static double defineResult(int[] intArray, int d, int element) {
        double catchedRes1 = intArray[element] / d;
        return catchedRes1;
    }

}
