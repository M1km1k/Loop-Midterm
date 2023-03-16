public class PageTwoFive{

private int n;
private int sum;

public PageTwoFive(int n){

this.n = n;

}

public int getn(){

return this.n;

}

public void display(){

for(int i = 1; i <= getn(); i++){

sum = sum+i;

}

System.out.printf("Sum is          : %d",sum);

}



}