import java.util.Scanner;

public class Ass7 {
    public static int sumDigit(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;}
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int no,sum=0;
            System.out.println("Enter Number ");
            no=sc.nextInt();
            sum=sumDigit(no);
            System.out.println(sum);

        }
}
