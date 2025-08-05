package ch06_abstract_interface.myshape;

public class Circle extends Shape{
    private double radius; // 반지름
    private double xpos ; // x좌표
    private double ypos; // y좌표
    private final double PI = 3.14;


    public Circle(String linecolor, String fillcolor, double radius, double xpos, double ypos){
        super(linecolor, fillcolor);
        this.radius = radius;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    @Override
    public double calcArea(){
        return PI * (Math.pow(this.radius,2));
    }

    @Override
    public double calcPerimeter(){
        return 2.0 * PI * radius;
    }

    @Override
    public void display(){
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();
        System.out.println("원의 정보");
        System.out.println("면적 : " + super.area);
        System.out.println("둘레 : " + super.perimeter);
        String message = "원 중심 : (" + this.xpos +", " + ypos + ")";
        System.out.println(message);
        super.draw();
    }
}
