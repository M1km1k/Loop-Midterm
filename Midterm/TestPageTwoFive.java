import java.util.*;

public class TestPageTwoFive{

public static void main(String [] args){

int n;

Scanner get = new Scanner(System.in);

System.out.print("Enter value of n: ");
n = get.nextInt();

PageTwoFive p = new PageTwoFive(n);
p.display();


}



}