package ch05_package.inheritance.sport;

public class BaseBall extends Sport{
    int game;
    double hit;

    public BaseBall(String name, int entry, int game, double hit){
        super(name,entry);
        this.game = game;
        this.hit = hit;
    }

    @Override
    public void comment(){
        super.comment();
        System.out.println(game + "개의 이닝으로 구성이 되며, 타율 " + hit + "을 기록하였습니다.");
    }

}
