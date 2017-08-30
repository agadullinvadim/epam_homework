/**
 * Created by Vadim on 28.08.2017.
 */
class Drawresult {

    void drawresult(double i) {
        double result = i;
        char ch = '.';
        String number = result + "";
        int dot = number.indexOf(ch);
        int endOfNumber = number.length();
        String beforeDotString = number.substring(0, dot);
        String afterDotString = number.substring(dot + 1, endOfNumber);

        int beforeDot = Integer.parseInt(beforeDotString);
        int afterDot = Integer.parseInt(afterDotString);

        int beforeDotLength = beforeDotString.length();
        int afterDotLength = afterDotString.length();


        for (int line = 1; line < 6; line++) {
            int t1 = beforeDot;
            for (int j = beforeDotLength; j > 0; j--) {
                int x = (int) Math.pow(10, j - 1);
                int numeral = t1 / x;
                t1 = t1 - numeral * x;
                StarNumeral var = new StarNumeral();
                var.stars(numeral, line);
                System.out.print(" ");
            }
            if (line == 5){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
            int t2 = afterDot;
            for (int j = afterDotLength; j > 0; j--){
                int x = (int)Math.pow(10, j - 1);
                int numeral = t2/x;
                t2 = t2 - numeral*x;
                StarNumeral var = new StarNumeral();
                var.stars(numeral, line);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

