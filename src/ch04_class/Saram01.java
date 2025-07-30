package ch04_class;
// 단계 1 : 클래스 정의(선언)
public class Saram01 {
    static String nationality;
        // 공유하고자 하는 변수는 static 키워드를 사용합니다.
        // 접근 지정자가 public인 클래스들 끼리는 다 같이 공유합니다.
    // 멤버 변수들은 기본 값이 존재합니다.
    // String 기본값 null
     String name;
    double height; // double의 기본값 0.0, int의 기본값 0
    double weight;
    String hobby;
    String blood;
    // 메소드 정의
    // 반환타입 메소드이름(매게 변수 리스트){ ... }
    String showGenderinfo(int juminno) {
        String gender;
        if(juminno == 1 || juminno == 3){
            gender = "남자";
        }else{
            gender = "여자";
        }
        String message = name +  "님은 " + gender + "이군요." ;
        System.out.println(message);
        return message;
    }
        String showbmiInfo(){
        double heightmeter = height/100;
        double bmi = weight/(heightmeter * heightmeter);
        String result;
        if(bmi >= 25.00){
            result = "비만";
        }else if(bmi >= 23.00){
            result = "과체중";
        }else if(bmi >= 18.50){
            result = "정상";
        }else{
            result = "저체중";
        }
            String message = name + "님은 " + result + "입니다.";
            System.out.println(message);
            System.out.println("bmi는" + (int)bmi + "입니다.");
        return message;
        }
        void display(){
            System.out.println(name + "님의 신상정보");
            System.out.println("국적 : " + nationality);
            System.out.println("이름 : " + name);
            System.out.println("키 : " + height + "cm");
            System.out.println("몸무게 : " + weight + "kg");
            System.out.println("취미 : " + hobby);
            System.out.println("혈액형 : " + blood + "형");
    }
}
    // boolean의 기본값 false

