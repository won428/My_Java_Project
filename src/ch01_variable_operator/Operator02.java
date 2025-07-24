package ch01_variable_operator;

public class Operator02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        boolean bool1 = a != b; // a = 10 , b = 5 , bool1 = 10 != 5 , true
        boolean bool2 = --a == b++; // a = 9 , b = 6 , bool2 = 9 == 5 , false
        boolean bool3 = a++ != --b; // a = 10 , b = 5 , bool3 = 9 != 5 , true
        boolean bool4 = bool3 && ( 10 > 3 ); // bool4 = (9 != 5) && (10 > 3) , true
        boolean bool5  = !bool4 || (bool1 || bool2); // !((9 != 5) && (10 > 3)) ||  (10 != 5) || (9 == 5), true

        System.out.println("boo1 = " + bool1);
        System.out.println("bool2 = " + bool2);
        System.out.println("bool3 = " + bool3);
        System.out.println("bool4 = " + bool4);
        System.out.println("bool5 = " + bool5);
    }
}
