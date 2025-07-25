package ch02_control_statement;

public class AdultCheck {
    public static void main(String[] args) {
        //이름과 나이와 성별에 대한 정보를 입력 받습니다.
        //변수 이름은 각각 name, age, gender으로 처리하도록 합니다.
        // 19세 이상이면 '성인'이라고 가정합니다.
        //성별은 숫자(1, 2, 3, 4)에서 하나를 입력 받고, "남자"/"여자"로 출력해 보세요.
        // prinf 메소드도 활용해 보세요.

        String name = "철수", gender;
        String adult ;
        int age = 25, _gender = 4;
        if(age>=20){
            adult = "성인";
        }else{
            adult ="미성년자";
        }
        if(_gender == 1 || _gender == 3){
            gender = "남자";
        }else{
            gender = "여자";
        }

        String message;
        message = "이름 : " + name + "님" + ", 나이 : " + age + ", 성인 체크 : " + adult + ", 성별 : " + gender;
        System.out.println(message);
    }
}
