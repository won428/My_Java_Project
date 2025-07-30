package ch04_class;

public class Gold {
    double flower; // 꽃의 가격
    double sand; // 모래의 가격
    double wood; // 나무의 가격
    double flower_pot; // 화분의 가격
    double flower_pot_fee; // 화분 제작 수수료
    String flower_name = "장미"; // 이하 재료들 이름
    String sand_name = "모래";
    String wood_name = "나무";

    double iron; // 철의 가격
    double wood_Axe_fee; // 나무 도끼 제작 수수료
    double wood_Axe; // 나부도끼 가격
    String iron_name = "철"; // 철 이름



    String make_flower_pot(){
        String message; // 반환할 메세지
        double Production_Cost = flower + sand + wood + flower_pot_fee; // 제작값
        double Gain = flower_pot - Production_Cost; // 이득일때
        double loss = -(flower_pot - Production_Cost); // 손해일때
        if(Production_Cost < flower_pot){
            message = Gain + "원 이득이므로 제작을 하여 사용하시는것이 좋습니다.";
        }else if(Production_Cost > flower_pot){
            message = loss + "원 손해이므로 완제품을 사시는것이 좋습니다.";
        }else{
            message = " 제작과 완제품의 가격이 같아 편하신 방법으로 하세요.";
        }
        System.out.println(message);
        return message;
    }
    String make_Wood_Axe(){
        String message;
        double Production_Cost = iron + wood + wood_Axe_fee;
        double Gain = wood_Axe - Production_Cost;
        double loss = -(wood_Axe - Production_Cost);
        if(Production_Cost < wood_Axe){
            message = Gain + "원 이득이므로 제작을 하여 사용하시는것이 좋습니다.";
        }else if(Production_Cost > wood_Axe){
            message = loss + "원 손해이므로 완제품을 사시는것이 좋습니다.";
        }else{
            message = "가격이 같아 편하신 방법으로 하세요.";
        }
        System.out.println(message);
        return message;
    }
}
