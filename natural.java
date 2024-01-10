import java.util.Scanner;
class natural{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n,i,sum=0;
System.out.print("Enter the number:");
n=s.nextInt();
for(i=0;i<=n;i++)
{
sum=sum+i;
}
System.out.print("sum of n numbers " +sum);
s.close();
}
}