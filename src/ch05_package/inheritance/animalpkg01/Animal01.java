package ch05_package.inheritance.animalpkg01;

public class Animal01 {
    private String name;
    private int lifespan;
    private String habiat;
    private double speed;
    private String animalparts;

    public Animal01() {
    }

    public Animal01(String name, int lifespan, String habiat, double speed, String animalparts){
        this.name = name;
        this.lifespan= lifespan;
        this.habiat = habiat;
        this.speed = speed;
        this.animalparts = animalparts;
    }


    @Override
    public String toString(){
        String message = "평균 수명이 " + this.lifespan + "년인 " + this.name + "의 서식지는 " + habiat + "입니다. \n" + name + " " + this.animalparts + "의 개수는 " ;
        return message;
    }

    public String speed(){
        String message = this.name + "가 " + this.speed + "의 속도로 ";
        return message;
    }
}
