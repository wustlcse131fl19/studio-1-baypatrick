package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        double n1 = ap.nextDouble("Put first number");
        double n2 = ap.nextDouble("Put second number");
        double Average = (n1 + n2)/2;
        System.out.println("The average of your two numbers is " + Average);

    }
}
