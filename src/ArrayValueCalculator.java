public class ArrayValueCalculator {

    public static int doCalc(String[][] matrix) {
            if (matrix == null) {
                throw new NullPointerException("The array must not be null");
            }
            validateMatrixSize(matrix);

            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    try {
                        sum += Integer.parseInt(matrix[i][j]);
                    } catch (NumberFormatException e) {
                        throw new ArrayDataException("Невірні дані в комірці [" + i + "][" + j + "]: " + matrix[i][j] + "\n" + "Дані повинні бути введені у форматі цифр або чисел '1', '2' та інше, але не 'abc', 'a', тощо");
                    }
                }
            }
            return sum;
        }

        public static void validateMatrixSize(String[][] matrix) {
            if (matrix.length != 4) {
                throw new ArraySizeException("The array must be 4x4");
            }
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i].length != 4) {
                    throw new ArraySizeException("The array must be 4x4");
                }
            }
        }
    }
