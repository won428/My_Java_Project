package ch04_class;

public class SaramMain03 {
    public static void main(String[] args) {
        Saram03 yusin = new Saram03();

        Saram03 soon = new Saram03();

        yusin.setName("김유신");
        yusin.setHeight(172.3);
        yusin.setWeight(62.5);
        yusin.setHobby("야구");
        yusin.setBlood("A");

        soon.setName("유관순");
        soon.setHeight(168.2);
        soon.setWeight(52.3);
        soon.setHobby("농구");
        soon.setBlood("B");

        System.out.println("이름 : " + yusin.getName());
        System.out.println("키 : " + yusin.getHeight());
        System.out.println("키 : " + yusin.getWeight());
        System.out.println("키 : " + yusin.getHobby());
        System.out.println("키 : " + yusin.getBlood());

        System.out.println("이름 : " + soon.getName());
        System.out.println("키 : " + soon.getHeight());
        System.out.println("키 : " + soon.getWeight());
        System.out.println("키 : " + soon.getHobby());
        System.out.println("키 : " + soon.getBlood());


    }
}
