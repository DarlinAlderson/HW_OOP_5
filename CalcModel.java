public class CalcModel {
    private Number result;

    public CalcModel() {
        this.result = 0;
    }

    public void add(Number firstNumber, Number secondNumber) {
        result = firstNumber.doubleValue() + secondNumber.doubleValue();
    }

    public void subtract(Number firstNumber, Number secondNumber) {
        result = firstNumber.doubleValue() - secondNumber.doubleValue();
    }

    public void multiply(Number firstNumber, Number secondNumber) {
        result = firstNumber.doubleValue() * secondNumber.doubleValue();
    }

    public void divide(Number firstNumber, Number secondNumber) {
        if (secondNumber.doubleValue() != 0) {
            result = firstNumber.doubleValue() / secondNumber.doubleValue();
        } else {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
    }

    public Number getResult() {
        return result;
    }

    public void setResult(Number result) {
        this.result = result;
    }
}