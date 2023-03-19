public class ArrayValueCalculator {

    public static String doCalc(String stringArray[][]) throws ArraySizeException, ArrayDataException {
        int sum = 0;

        if (stringArray == null) {
            throw new NullPointerException("The array must not be null, the array must be 4x4");
        }
        if (stringArray.length != 4 || stringArray[0].length != 4) {
            throw new ArraySizeException("The array must be 4x4");
        }

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                try {
                    int number = Integer.parseInt(stringArray[i][j]);
                    sum += number;
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Невірні дані в комірці [" + i + "][" + j + "]: " + stringArray[i][j] + "\n" + "Дані повинні бути введені у форматі цифр або чисел '1', '2' та інше, але не 'abc', 'a', тощо");
                }
            }
        }
        return "Сума чисел у масиві: " + sum;
    }
}