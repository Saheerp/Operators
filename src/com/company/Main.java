package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 3; //1+2=3
        System.out.println("1 + 2 =" + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println(" 3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2*10 =20
        System.out.println("2*10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3; //reminder of (4%3)
        System.out.println("4 % 3 = " + result);

        // result = result +1;
        result++;// 1+1=2
        System.out.println("1 + 1 = " + result);

        //result = result*10;
        result *= 10;// 2*10 =20
        System.out.println("2 * 10 = " + result);

        //result = result/5;
        result /= 5;// 20/5 =4
        System.out.println("20 / 5 = " + result);

        //result = result-2;
        result -= 2;// 4-2 =2
        System.out.println("4-2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I'm scared of aliens");

        }

    int topScore = 80;
        if(topScore <= 100) {
            System.out.println("You got the high score!");

        }

        int secondTopScore =81;
        if (topScore>secondTopScore && topScore<100)
            System.out.println("Greater than Second top score and less than 100");

    }
}
