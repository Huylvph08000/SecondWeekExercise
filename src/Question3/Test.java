package Question3;

import Question3.Fan;

public class Test {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.getFAST());
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan1.setRadius(10);
        System.out.println(fan1);


        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.getMEDIUM());
        fan2.setColor("blue");
        fan2.setOn(false);
        fan1.setRadius(5);
        System.out.println(fan2);
    }
}
