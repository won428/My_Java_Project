package ch04_class;

public class OverAdd {
    int Add(int x, int y , int z){
        return x + y + z;
    }


    public void Add(int a, int b) {
        System.out.println("정수 덧셈 : " + (a + b));
    }

    public void Add(double a, double b){
        System.out.println("실수 덧셈 : " + (a + b));
    }

    public void Add(int a, double y){
        System.out.println("혼합형 : " + (a + y));
    }

}
