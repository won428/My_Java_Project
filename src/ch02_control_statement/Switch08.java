package ch02_control_statement;

public class Switch08 {
    public static void main(String[] args) {
        int month = 5;
        String 계절="";
        switch (month) {
            case 3:
            case 4:
            case 5:
                계절 = "봄";
                System.out.println(month + "월은 봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                계절 = "여름";
                System.out.println(month + "월은 여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                계절 = "가을";
                System.out.println(month + "월은 가을입니다.");
                break;
            case 12:
            case 1:
            case 2:
                계절 = "겨울";
                System.out.println(month + "월은 겨울입니다.");
                break;
            default:
                System.out.println("존재하지 않는 날짜입니다.");
        }
        switch (계절){
            case "봄":
                System.out.println("봄은 3월부터 5월까지 입니다.");
                break;
            case"여름":
                System.out.println("여름은 6월부터 8월까지 입니다.");
                break;
            case"가을":
                System.out.println("가을은 9월부터 11월까지 입니다.");
                break;
            case"겨울":
                System.out.println("겨울은 12월부터 2월까지 입니다.");
                break;
            default:
                System.out.println("존재하지 않는 계절입니다.");
        }



        }
    }

