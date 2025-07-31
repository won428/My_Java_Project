package ch04_class;

public class ShapeArea {
    final double PI = 3.141593;

    void area(int a){
        System.out.println("원의 면적 : " + (a * a * PI));
    }

    void area(int a, int b){
        System.out.println("사각형의 면적 : " + (a * b));
    }

    void area(int a, int b, int c){
        System.out.println("사다리꼴의 면적 : " + ((a + b) * c / 2));
    }
}
