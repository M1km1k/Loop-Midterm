public class PageTwoSix{

private int n;

public PageTwoSix(int n){

this.n = n;

}


public int getn(){

return this.n;

}

public void display(){

int i = 1;
int fact = 1;

while(i <= getn()){

fact *= i;
i++;


}

System.out.printf("Factorial is    :%d",fact);

}



}