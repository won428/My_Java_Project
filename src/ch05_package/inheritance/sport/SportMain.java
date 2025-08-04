package ch05_package.inheritance.sport;

public class SportMain {
    public static void main(String[] args) {

        FootBall footBall = new FootBall("축구", 11, "전반전, 후반전", 5);
        BaseBall baseBall = new BaseBall("야구", 9, 9, 0.412);

        footBall.comment();
        baseBall.comment();

        }
    }

