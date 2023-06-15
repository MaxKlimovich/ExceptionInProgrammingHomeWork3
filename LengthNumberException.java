package HomeWork3;

public class LengthNumberException extends Exception {
    public LengthNumberException() {
        super("Некорректная длина номера телефона");
    }
}