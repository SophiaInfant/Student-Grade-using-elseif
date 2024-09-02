import java.io.*;
import java.util.*;

class Grades
{
public static void main(String args[])
{
Scanner n=new Scanner(System.in);
System.out.println("ENTER A MARKS");
int num=n.nextInt();

if(num>=81)
{
num+=(num*20)/100;
System.out.println("GRADE A "+ num);
}

else if (71<=num && num<=80)
{
num+=(num*10)/100;
System.out.println("GRADE B "+ num);
}

else if(61<=num && num<=70)
{
num+=(num*5)/100;
System.out.println("GRADE C");
}

else if(51<=num && num<=60)
{
num+=(num*2)/100;
System.out.println("GRADE D " + num);
}

else
{
System.out.println("FAIL");
}

}
}