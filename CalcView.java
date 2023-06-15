import java.util.Scanner;

public class CalcView {
    private Scanner scanner;

    public CalcView() {
        this.scanner = new Scanner(System.in);
    }

    public Number getInputNumber() {
        System.out.print("Введите число: ");
        String input = scanner.next();
        return Double.parseDouble(input);
    }

    public char getInputOperator() {
        System.out.print("Выберите действие (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public void displayResult(Number result) {
        System.out.println("Result: " + result.toString());
    }
}