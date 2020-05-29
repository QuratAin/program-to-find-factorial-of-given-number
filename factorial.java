import java.util.*;
public class factorial{
public static void main(String[]args){
Scanner Input=new Scanner(System.in);
System.out.println("Enter any number to generate its factorial");
int number=Input.nextInt();
int temp=1;
if(number>=0){
for(int i=number;i>0;i--){
temp*=i;
}
System.out.println("Factorial of "+ number + " = " + temp);}
else
System.out.println("Factorial of negative numbers does not exist");
}
}