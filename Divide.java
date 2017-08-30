/**
 * Created by Vadim on 27.08.2017.
 */
class Divide {
    void divide(double a, double b){
        if (b == 0){
            System.out.println("На ноль делить нельзя!");
        }
        else {
            double result = a / b;
            Drawresult var = new Drawresult();
            var.drawresult(result);
        }

    }
}
