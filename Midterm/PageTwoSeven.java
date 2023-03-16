import java.util.*;

public class PageTwoSeven{

int n;

public PageTwoSeven(int n){

this.n = n;

}


public int getn(){

return this.n;

}

public void display(){

int i = 1;
int sum = 0;
int average;
 
do
{

sum=sum+i;
average = sum / getn();
i++;

}while(i <= getn());
 
System.out.printf("Sum is              : %d\n",sum);
System.out.printf("Average is          : %d",average);


}



}