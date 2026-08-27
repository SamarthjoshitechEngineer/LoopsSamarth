/*To print all the natural numbers upto n */
import java.util.Scanner;
public class Numbers {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
for(int i=1;i<=n;i++){
    System.out.println(i);
}
    }
}
/*Alternate Variable Method
import java.util.Scanner;
public class Numbers {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
int a=1;
for(int i=1;i<=n;i++){
System.out.println(a);
a++;
}
    }
}*/
