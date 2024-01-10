import java.util.Scanner;
class fibo{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
int n,n1=0,n2=1,nt,i,sum=0;
System.out.print("Enetr the number:");
n=scanner.nextInt();
System.out.println("Fibonacii series " +n1+" "+n2);
for(i=2;i<=n;i++){
nt=n1+n2;
System.out.print(" " +nt);
n1=n2;
n2=nt;
sum+=nt;
}
System.out.println("\n"+sum);
scanner.close();
}
}