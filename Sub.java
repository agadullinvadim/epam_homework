public class Sub{
    public static void main(String[] args) {
        int sub = 0;
        for (int i = 0; i < args.length - 1; i++){
            sub = Integer.parseInt(args[i]) - Integer.parseInt(args[i+1]) ;
        }
        System.out.println(sub);
    }
}