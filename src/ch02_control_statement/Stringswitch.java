package ch02_control_statement;

public class Stringswitch {
    public static void main(String[] args) {
        //January(1월), February(2월) ,March(3월), April(4월), May(5월), June(6월), July(7월), August(8월), September(9월), October(10월), November(11월), December(12월)
        String month = "January";
        int monthNumber = 0;
        switch(month){
            case "January":
                monthNumber = 1;
                break;
            case "February":
                monthNumber = 2;
                break;
            case "March":
                monthNumber = 3;
                break;
            case "April":
                monthNumber = 4;
                break;
            case "May":
                monthNumber = 5;
                break;
            case "June":
                monthNumber = 6;
                break;
            case "July":
                monthNumber = 7;
                break;
            case "August":
                monthNumber = 8;
                break;
            case "September":
                monthNumber = 9;
                break;
            case "October":
                monthNumber = 10;
                break;
            case "November":
                monthNumber = 11;
                break;
            case "December":
                monthNumber = 12;
                break;
            default:
                monthNumber = 0;
        }
        if(monthNumber == 0) {
            System.out.println("존재하지 않는 날짜입니다.");
        }else{
            String message = month + "은(는) " + monthNumber + "월입니다." ;
            System.out.println(message);
        }
    }
}
