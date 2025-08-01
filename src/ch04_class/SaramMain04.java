package ch04_class;

public class SaramMain04 {
    public static void main(String[] args)
    {
        Saram04 soo = new Saram04(); // 김철수
        soo.display();

        Saram04 hee = new Saram04("박영희", 162.5, 52.5, "퀼트", "AB"); //박영희
        hee.display();

        Saram04 yusin = new Saram04("김유신", 175.5, 70.5, "O"); //김유신
        yusin.display();

        Saram04 choi = new Saram04("최유식", 175.5, 70.5, "B"); //김유신
        choi.display();


    }
}
