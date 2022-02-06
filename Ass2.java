public class Ass2 {
    public static int max(int a, int b, int c){
        int max;
        max=a>b?(a>c?a:c):(b>c?b:c);
        return max;
}
public static void main(String[] args) {
    int max=max(23, 46, 12);
    System.out.println("Maximum "+max);
}
    
}
