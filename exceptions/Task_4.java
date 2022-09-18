// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов
// в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException
public class Task_4 {
    public static double[] createNewArray(int[] array1, int[] array2) {
        double[] newArray = new double[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("Ошибка! делить на ноль нельзя! Проверьте array2");
            }
            newArray[i] = (double) array1[i] / (double) array2[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array1 = { 4, 5, 6, 7, 8, 9, 10 };
        int[] array2 = { 2, 1, 9, 0, 8, -10 };
        if (array1.length != array2.length) {
            System.out.println("Ошибка: проверьте ваши массивы! Их длины не равны!");
        } else {
            double[] someArray = createNewArray(array1, array2);
            for (int i = 0; i < someArray.length; i++) {
                System.out.format("%.2f  ", someArray[i]);
            }
        }
    }
}
