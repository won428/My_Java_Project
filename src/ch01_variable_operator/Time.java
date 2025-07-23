package ch01_variable_operator;

public class Time {
    public static void main(String[] args) {
        int Time = 4000;
        int hour = Time / 3600;
        int minute = (Time - hour * 3600) / 60;
        int second = Time - hour * 3600 - minute * 60;
        System.out.println("4000초는 " + hour + ("시간 ") + minute + ("분 ") + second + ("초 입니다") );
    }
}
