import javax.swing.*;

public class PageTwoEight{

private int choose;
private double burger = 25.00;
private double coke = 25.00;
private double fries = 15.00;

private static double total = 0.00;
private double none = 0.00;

public PageTwoEight(int choose){

this.choose = choose;


}

public int getchoose(){

return this.choose;

}

public void display(){

JOptionPane.showMessageDialog(null,"TANQUIS FOOD STORE\n*********************\n(1) Burger  Php 25.00\n(2) Coke    Php 25.00\n(3) Fries   Php 50.00\n *********************\n");

}

public void display2(){

if (getchoose() == 1){

total += burger;

}

else if (getchoose() == 2){

total += coke;

}

else if (getchoose() == 3){

total += fries;

}

else if (getchoose() == 0){
JOptionPane.showMessageDialog(null, "Total cost: "+ total);
System.exit(0);
}



}

}



