import java.util.Scanner;
import java.util.stream.*;
public class Input
{
 public static void main(String [] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.print("Write your number here : ");
  int a = sc.nextInt();
  System.out.print("Square root of the entered number is : ");
  Stream.of(a).map(Math::sqrt).forEach(x->System.out.println(x));
 }
}