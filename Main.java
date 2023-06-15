/*
 * Задача 1 - Конструируем калькулятор, применяя архитектуру MVP (Model-View-Presenter), 
 * с возможностью выполнения базовых математических операций, таких как сложение, вычитание, 
 * умножение и деление, работающий с дробными числами.
Доп. Задача (*) Мы также обеспечим обработку возможных ошибок, чтобы предотвратить некорректные операции.
 */

public class Main {
    public static void main(String[] args) {
        CalcView view = new CalcView();
        CalcModel model = new CalcModel();
        CalcPresenter presenter = new CalcPresenter(view, model);

        presenter.performCalculation();
    }
}