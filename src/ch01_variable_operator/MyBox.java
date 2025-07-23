package ch01_variable_operator;

public class MyBox {
    public static void main(String[] args) {
        double width = 10, height = 5, area = width * height, perimeter = (width + height)*2,
                diagonal = Math.sqrt(width*width + height*height);
        System.out.println("가로 : " + width);
        System.out.println("세로 : " +  height);
        System.out.println("면적 : " + area);
        System.out.println("둘레 : " + perimeter);
        System.out.println("대각선 : " + diagonal);
    }
}
