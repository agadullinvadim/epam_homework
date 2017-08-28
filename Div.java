public class Div{
    public static void main(String[] args) {
        float div = 1;
        for (int i = 0; i < args.length - 1 ; i++){
            int a = Integer.parseInt(args[i]);
            float b = Integer.parseInt(args[i+1]);
            div = (float)(a/b);
        }
        System.out.println(div);
    }
}