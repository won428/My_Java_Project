package ch02_control_statement;

public class Multilf01 {
    public static void main(String[] args) {
        //35도 이상 : "폭염 경보"
        //30도 이상 : "무더운 날씨"
        //20도 이상 : "쾌적한 날씨"
        //10도 이상 : "쌀쌀한 날씨"
        //이외 : "추운 날씨"
        //
        //출력 예시 : 24도는 쾌적한 날씨입니다.
        int temperature = 9;
        String weather;
        if(temperature >= 35){
            weather = "폭염";
        }else if(temperature >= 30){
            weather = "무더운 날씨";
        }else if(temperature >= 20){
            weather = "쾌적한 날씨";
        }else if(temperature >= 10) {
            weather = "쌀쌀한 날씨";
        }else{
            weather = "추운 날씨";
        }
        System.out.println(temperature + "도는 " + weather + " 입니다.");
        }
    }

