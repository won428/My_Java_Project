package ch04_class;

public class Gold {
    private double flower; // 꽃의 가격
    public void setFlower(double flower){
        this.flower=flower;
    }
    public double getFlower(){
        return flower;
    }


    private double sand; // 모래의 가격
    public void setSand(double sand){
        this.sand = sand;
    }
    public double getSand(){
        return sand;
    }

    private double wood; // 나무의 가격
    public void setWood(double wood){
        this.wood = wood;
    }
    public double getWood(){
        return wood;
    }


    private double flower_pot; // 화분의 가격
    public void setFlower_pot(double flower_pot){
        this.flower_pot = flower_pot;
    }
    public double getFlower_pot(){
        return flower_pot;
    }

    private double flower_pot_fee; // 화분 제작 수수료
    public void setFlower_pot_fee(double flower_pot_fee){
        this.flower_pot_fee = flower_pot_fee;
    }
    public double getFlower_pot_fee(){
        return flower_pot_fee;
    }

    private String flower_name = "장미"; // 이하 재료들 이름
    public String getFlower_name(){
        return flower_name;
    }

    private String sand_name = "모래";
    public String getSand_name(){
        return sand_name;
    }

    private String wood_name = "나무";
    public String getWood_name(){
        return wood_name;
    }

    private double iron; // 철의 가격
    public void setIron(double iron){
        this.iron = iron;
    }
    public double getIron(){
        return iron;
    }

    private double wood_Axe_fee; // 나무 도끼 제작 수수료
    public void setWood_Axe_fee(double wood_Axe_fee){
        this.wood_Axe_fee =  wood_Axe_fee;
    }
    public double getWood_Axe_fee(){
        return wood_Axe_fee;
    }

    private double wood_Axe; // 나부도끼 가격
    public void setWood_Axe(double wood_Axe){
        this.wood_Axe = wood_Axe;
    }
    public double getWood_Axe(){
        return wood_Axe;
    }

    private String iron_name = "철"; // 철 이름
    public String getIron_name(){
        return iron_name;
    }


    private String make_flower_pot(){
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
        return message;
    }
    public String getMake_flower_pot(){
        return make_flower_pot();
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
        return message;
    }
    public String getMake_Wood_Axe(){
        return make_Wood_Axe();
    }
}
