public class Main {

    public static void main(String[] args) throws ArrayDataException, ArraySizeException {
        String matrix[][] = {
                {"ab","2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        System.out.println("Сума чисел у матриці: " + ArrayValueCalculator.doCalc(matrix));
    }
}
