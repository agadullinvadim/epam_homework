/**
 * Created by Vadim on 30.08.2017.
 */
class StarNumeral {
    void stars(int numeral, int line){
        if (line == 1){
            if (numeral == 1 ){
                System.out.print("  *");
            }
            else if (numeral == 4){
                System.out.print("* *");
            }
            else {
                System.out.print("***");
            }
        }
        if (line == 2){
            if ((numeral == 1) || (numeral == 2) || (numeral == 3) || (numeral == 7)){
                System.out.print("  *");
            }
            else if ((numeral == 5) || (numeral == 6)) {
                System.out.print("*  ");
            }
            else {
                System.out.print("* *");
            }
        }
        if (line == 3) {
            if (numeral == 0) {
                System.out.print("* *");
            }
            else if ((numeral == 1) || (numeral == 7)) {
                System.out.print("  *");
            }
            else {
                System.out.print("***");
            }
        }
            if (line == 4){
                if (numeral == 2){
                    System.out.print("*  ");
                }
                else if ((numeral == 6) || (numeral == 8) || (numeral == 0)){
                    System.out.print("* *");
                }
                else{
                    System.out.print("  *");
                }
            }
            if (line == 5){
                if ((numeral == 1) || (numeral == 4) || (numeral == 7)){
                    System.out.print("  *");
                }
                else{
                    System.out.print("***");
                }
            }
        }
    }

