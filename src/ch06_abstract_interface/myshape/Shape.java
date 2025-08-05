package ch06_abstract_interface.myshape;

public abstract class Shape {
    protected double area ; // 면적
    protected double perimeter; // 도형의 둘레
    String linecolor; // 라인 색상
    String fillcolor; // 채우기 색상

    public Shape(){
    }

    public Shape(String linecolor, String fillcolor){
        this.linecolor = linecolor;
        this.fillcolor = fillcolor;
    }

    // abstract : 내용이 정의되지 않는 모델 개념으로, 불완전한 메소드입니다.
    public abstract double calcArea();
    public abstract double calcPerimeter();
    public abstract void display();

    protected final void draw(){
        System.out.println("라인 색상 : " + this.linecolor);
        System.out.println("채우기 색상 : " + this.fillcolor);
    }
}
