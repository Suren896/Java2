package practice2;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int i, int j) {
        super(String.format("По адресу элемента array[%d][%d] находится не число", i, j));
    }
}