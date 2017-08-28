public class Mult{
    public static void main(String[] args) {
        int mult = 1;
        for (int i = 0; i < args.length ; i++){
            mult *= Integer.parseInt(args[i]);
        }
        System.out.println(mult);
    }
}