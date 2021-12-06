import java.util.Scanner;
class MathematicalTable
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int num = sc.nextInt();
for (int i=1;i<=10;i++)
{
int r = num *i;
System.out.println(num+" * "+i+" = "+r);
}
}
}