package ch05_package.inheritance.mybeverage;

public class Beverage04 {
    private String name;

    public String getName() {
        return name;
    }

    private double price;

    public Beverage04(){

    }

    void showInfo(){
        System.out.println("이름 : " + name);
        System.out.println("단가 : " + price);
    }

    public Beverage04(String name, double price){
        this.name = name;
        this.price = price;
    }

    // 메소드 은닉화 : 오버라이딩시 본의 아니게, 슈퍼 클래스의 메소드가 숨겨지는 현상을 일컫는 말입니다.
    // @으로 시작하는 항목들을 어노테이션(Annotation)이라고 부릅니다.
    @Override
    public String toString(){
        String message = "품명 : " + this.name + ", 단가 : " + this.price;
        return message;
     }

}
