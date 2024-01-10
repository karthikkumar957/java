import java.util.Scanner;
class armstrong{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n,sum=0,r,temp;
System.out.print("Enetr the number:");
n=s.nextInt();
temp=n;
while(n>0)
{
r=n/10;
sum+=r*r*r;
n=n%10;
}
if(sum==temp)
System.out.println("S");
else
System.out.println("N");
s.close();
}
}
