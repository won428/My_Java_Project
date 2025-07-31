package ch04_class;

public class Saram03 {
    private String name;

    public void setName(String name){
        this.name = name;
        // this가 없으면 지역변수로 판정되지만(가까운 변수 정의를 참조하기 떄문)
        // this를 붙이면 매개변수가 들어왔을때 인스턴스 변수로 판정
        // 인스턴스 변수인지 확실하지 않다면 this를 붙임

    };


    public String getName(){
        return name;
    }
    private double height;


    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    private double weight;
    private String hobby;
    private String blood;

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private void display(){
      System.out.println(name);
      System.out.println(height);
  }


  public void getDisplay(){
      display();
  }
}
