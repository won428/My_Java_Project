package ch02_control_statement;

public class DaysInMonth {
    public static void main(String[] args) {
        int month = 30;
        int last_day = 0;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                last_day = 31;
                break;
            case 2:
                last_day = 28;
                break;
            case 4: case 6: case 9: case 11:
                last_day = 30;
                break;
        }
        if(month <= 12 && month >= 1 ) {
            System.out.println(month + "월은 " + last_day + "일까지 있습니다.");
        }else {
            System.out.println("존재하지 않는 날짜입니다.");
            System.exit(0);
            }
        }
    }

