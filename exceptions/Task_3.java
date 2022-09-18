// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Task_3 {
    public static int[] createNewArray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new ArrayIndexOutOfBoundsException("Ошибка: проверьте ваши массивы! Их длины не равны!");
        }
        int[] newArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i] - array2[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array1 = { 4, 5, 6, 7, 8, 9, 10 };
        int[] array2 = { 2, 1, 9, 0, 8, -10 };
        int[] someArray = createNewArray(array1, array2);
        for (int i = 0; i < someArray.length; i++) {
            System.out.format("%d  ", someArray[i]);
        }
    }
}
