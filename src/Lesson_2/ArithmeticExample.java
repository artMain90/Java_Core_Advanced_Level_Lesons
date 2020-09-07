package Lesson_2;

public class ArithmeticExample {
    public static void main(String[] args) {

        try {
            wrongCalc(42,0);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        int[] numbers = new int[]{0,1,2,3,4,5};
        System.out.println(calc(numbers));

        try {
            System.out.println(calcWithValidation(numbers));
        } catch (MyCheckException e) {
            e.printStackTrace();
        }

        System.out.println("Успешное завершение программы");

    }

    private static void wrongCalc(int a,int b) throws IllegalArgumentException{
        if (a == 0 || b == 0){
            throw new IllegalArgumentException("Argument b & a should no be zero");
        }
//
//        try {
//            System.out.println(a/b);
//        }catch (ArithmeticException e){
//            throw new MyCheckException("Деление на ноль",e);
//        }
    }

    public static int calcWithValidation(int[] numbers) throws MyCheckException {
        for (int n : numbers) {
            if (n == 0) {
                throw new MyCheckException("В массиве есть 0!");
            }
        }

        int result = 1;

        for (int i = 0; i <= numbers.length; i++) {
            result = result / numbers[i];
        }

        return result;
    }



    public static int calc(int[] numbers){
        int result = Integer.MAX_VALUE;

        for (int i = 0; i <= numbers.length; i++) {
            try {
                result = result / numbers[i];
            }catch (ArithmeticException e){
                System.out.println("Деление на ноль! Result: " + result);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Вышли за пределы массива");
            }catch (Throwable t){
                System.out.println("Что то пошло не так!");
            }
        }
        return result;
    }

//    public static int calcChecked(int[] numbers)

}

class MyCheckException extends Exception{
    public MyCheckException(String message){
        super(message);
    }
    public MyCheckException(String message, Throwable cause){
        super(message, cause);
    }
}

class ArrayWithZeroException extends RuntimeException{
    public ArrayWithZeroException(String message){
        super(message);
    }
}


