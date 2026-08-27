import java.util.Scanner;
public class primenumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                System.out.print("The number is composite");
            break;
            }
            else
                System.out.println("The number is prime");
    }
}
}