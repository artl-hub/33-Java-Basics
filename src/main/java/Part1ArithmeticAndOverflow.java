public class Part1ArithmeticAndOverflow {
    public static void main(String[] args) {

        //0) применить несколько арифметических операций ( + , -, * , /)

        System.out.println("0) применить несколько арифметических операций ( + , -, * , /)");

        int a = 3;
        int b = 5;

        System.out.println("Addition: a + b = " + (a + b));
        System.out.println("Subtraction: a - b = " + (a - b));
        System.out.println("Multiplication: a * b = " + (a * b));
        System.out.println("Division: a / b = " + (a / b));

        //1) применить несколько арифметических операций над int и double в одном выражении

        System.out.println("1) применить несколько арифметических операций над int и double в одном выражении");

        int intValue = 10;
        double doubleValue = 5.5;

        // Сложение

        System.out.println("Sum: " + intValue + " + " + doubleValue + " = " + (intValue + doubleValue));

        // Вычитание

        System.out.println("Difference: " + intValue + " - " + doubleValue + " = " + (intValue - doubleValue));

        // Умножение

        System.out.println("Product: " + intValue + " * " + doubleValue + " = " + (intValue * doubleValue));

        // Деление

        System.out.println("Quotient: " + intValue + " / " + doubleValue + " = " + (intValue / doubleValue));


        int c = 10;
        int d = 5;

//        2) применить несколько логических операций ( < , >, >=, <= )

        System.out.println("2 Применить несколько логических операций ( < , >, >=, <= )");

        System.out.println("(c > d): " + (c > d));
        System.out.println("c < d: " + (c < d));
        System.out.println("c >= d: " + (c >= d));
        System.out.println("c <= d: " + (c <= d));


//        4) получить переполнение при арифметической операции

        System.out.println("4 Получить переполнение при арифметической операции");


        byte maxByte = Byte.MAX_VALUE;
        byte maxOverflow = (byte) (maxByte + 1);

        byte minByte = Byte.MIN_VALUE;
        byte minOverflow = (byte) (minByte - 1);

        System.out.println(maxByte + " " + "+ 1" + " " + "=" + " " + (maxOverflow));
        System.out.println(minByte + " " + "- 1" + " " + "=" + " " + (minOverflow));

    }
}
