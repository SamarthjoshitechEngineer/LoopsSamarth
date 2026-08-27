import java.util.Scanner;
public class EvenOdd {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter upto what number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
            else
                System.out.print("");
        }

    }
}
/*To print all the odd numbers
if(i%2!=0)
System.out.println(i); */
