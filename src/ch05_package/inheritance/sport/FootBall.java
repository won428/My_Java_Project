package ch05_package.inheritance.sport;

public class FootBall extends Sport{

    private String game;
    private int goals;

    public FootBall(String name, int entry, String game, int goals){
        super(name, entry);
        this.goals = goals;
        this.game = game;
    }

    @Override
    public void comment(){
        super.comment();
        System.out.println(game + "으로 구성되어 있으며 " + goals + "골이 들어갔습니다.");
    }
}
