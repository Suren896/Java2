package practice2;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        System.out.println("Не правильный размер массива");
    }
}
