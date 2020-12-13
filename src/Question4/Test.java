package Question4;

import Question4.QuadraticEquation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        float a = Float.parseFloat(sc.nextLine());
        System.out.print("Enter b: ");
        float b = Float.parseFloat(sc.nextLine());
        System.out.print("Enter c: ");
        float c = Float.parseFloat(sc.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, c, c);
//        System.out.println(quadraticEquation);
//        System.out.println(quadraticEquation.getDiscriminant());
        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has no roots");
            } else {
                System.out.println("The equation has a root: "
                        + "x = " + (-c / b));
            }
            return;
        }
        if (quadraticEquation.getDiscriminant()> 0){
            System.out.println("First root: "+quadraticEquation.getRoot1(quadraticEquation.getDiscriminant()));
            System.out.println("Second root: "+quadraticEquation.getRoot2(quadraticEquation.getDiscriminant()));
        }
        else if (quadraticEquation.getDiscriminant()== 0){
            System.out.println("Root: "+ quadraticEquation.getRoot());
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}
