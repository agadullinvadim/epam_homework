/**
 * Created by Vadim on 27.08.2017.
 */
public class Divide {
    public void divide(double a, double b){
        if (b == 0){
            System.out.println("На ноль делить нельзя!");
        }
        else {
            double result = a / b;
            System.out.println("Результат: " + result);
        }

    }
}
