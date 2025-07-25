package ch02_control_statement;

public class Logical01 {
    public static void main(String[] args) {
        //If 구문 및 논리 연산자를 사용하면 해결할 수 있습니다.
        //월은 month, 계절은 season이라는 변수 이름을 사용하도록 하세요.
        //참고 사항으로 계절은 다음과 같이 구분합니다.
        //봄 : 3~5/여름 : 6~8/가을 : 9~11/겨울 : 12, 1, 2
        String seson;
        int month = 12;
        if(month >= 3 && month <=5){
            seson = "봄";
        }else if(month >= 6 && month <=8){
            seson = "여름";
        }else if(month >= 9 && month <= 11){
            seson = "가을";
        }else {
            seson = "겨울";
        }
        System.out.println(month + "월은 " + seson + "입니다.");
    }
}
