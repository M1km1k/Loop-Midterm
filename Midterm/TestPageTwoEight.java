import javax.swing.*;

public class TestPageTwoEight {

public static void main(String [] args){

int choose;

JOptionPane.showMessageDialog(null,"TANQUIS FOOD STORE\n*********************\n(1) Burger  Php 25.00\n(2) Coke    Php 25.00\n(3) Fries   Php 50.00\n *********************\n");


for(int i = 1; i <= 4; i++){


choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your choice"));
PageTwoEight p = new PageTwoEight(choose);

JOptionPane.showMessageDialog(null,"Display the menu\n");
p.display();
p.display2();



}


}





}