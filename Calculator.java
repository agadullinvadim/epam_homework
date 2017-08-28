import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Vadim on 27.08.2017.
 */
public class Calculator {
    public static boolean isNumber(String s) throws NumberFormatException{
      try {
          Double.parseDouble(s);
          return true;
      }
      catch (NumberFormatException e){
          return false;
      }
    }
    public static boolean isNumberOfOperation(String s) throws NumberFormatException{
        try {
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите первое число: ");
        String inputdata = reader.readLine();

        while (!isNumber(inputdata)) {

            System.out.print("Необходимо ввести число! Повторите ввод: ");
            inputdata = reader.readLine();
        }



        double num1 = Double.parseDouble(inputdata);


        System.out.print("Введите второе число: ");
        inputdata = reader.readLine();

        while (!isNumber(inputdata)) {

                System.out.print("Необходимо ввести число! Повторите ввод: ");
                inputdata = reader.readLine();
        }

        double num2 = Double.parseDouble(inputdata);

        System.out.println("Что будем делать:Суммирование - 1, Вычитание - 2, Умножение - 3, Деление - 4 (введите номер операции): ");

        inputdata = reader.readLine();

        while (!isNumberOfOperation(inputdata)) {

                System.out.print("Неккоректный номер операции! Повторите ввод: ");
                inputdata = reader.readLine();
        }

        int numofoperation = Integer.parseInt(inputdata);

        boolean check = (numofoperation < 1) | (numofoperation > 4);

        while (check){

                System.out.print("Неккоректный номер операции! Повторите ввод: ");
                inputdata = reader.readLine();
                numofoperation = Integer.parseInt(inputdata);
                check = (numofoperation < 1) | (numofoperation > 4);
        }


        switch (numofoperation){
            case 1: Summation var1 = new Summation();
            var1.summation(num1, num2);
            break;
            case 2: Subtract var2 = new Subtract();
                var2.subtract(num1, num2);
                break;
            case 3: Multiply var3 = new Multiply();
                var3.multiply(num1, num2);
                break;
            case 4: Divide var4 = new Divide();
                var4.divide(num1, num2);
                break;
        }
    }
}
