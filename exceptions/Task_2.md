# Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
``` public static int sum(String[][] arr) {
        int sum = 0;
        for ( int i = 0; i < arr.length; i++){
            for (int j = 0; j < 5; j++){
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
                }
            }
        return sum;
        }
```
## В коде можно получить три типа исключения:

- Если исходный массив имеет меньше длину, чем задана в условии метода: ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
- Если строки в массиве содержат символы: NumberFormatException: For input string: "ll"
- Если исходный массив null. NullPointerException: Cannot read the array length because "arr" is null