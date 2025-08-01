package ch04_class;

public class Gold2 {


    private double flower, sand, wood, iron, fee, flower_pot, wood_Axe;
    private String flower_name, sand_name = "모래", wood_name = "나무", iron_name = "철", flower_pot_name, wood_Axe_name = "나무 도끼";

    public Gold2(String flower_name, double flower, double sand, double wood, double fee, double flower_pot ){
        this.flower = flower;
        this.sand = sand;
        this.wood = wood;
        this.fee = fee;
        this.flower_pot = flower_pot;
        this.flower_name = flower_name;
    }


    public Gold2(double iron, double wood, double fee, double wood_Axe){
        this.iron = iron;
        this.wood = wood;
        this.fee = fee;
        this.wood_Axe = wood_Axe;
    }

    public void make_flower_pot(){
        double money = this.flower + this.sand + this.wood + this.fee;
        double Gain = flower_pot - money;
        double loss = -(flower_pot - money);
        String[] flower_parts = {flower_name, sand_name, wood_name};
        System.out.print(flower_name + "의 재료 목록은 ");
        for (int i = 0; i < flower_parts.length; i++) {
            if(i == flower_parts.length - 1){
                System.out.print(flower_parts[i]);
            }else {
                System.out.print(flower_parts[i] + ",");
            }
        }
        System.out.println("입니다 ");
        if(money < flower_pot){
            System.out.println(flower_name + "꽃 화분의 가격은" + flower_pot + "원 이고, " + flower_name + "꽃화분의 제작비용은 " + money + "원 이므로 제작이 "+ Gain + "원 이득입니다.");
        }else if(money > flower_pot){
            System.out.println(flower_name + "꽃 화분의 가격은" + flower_pot + "원 이고, " + flower_name + "꽃화분의 제작비용은 " + money +"원 이므로"+ loss + "원 손해입니다, 상점에서 구매하세요.");
        }else{
            System.out.println(flower_name + "꽃 화분의 가격은" + flower_pot + "원 이고, " + flower_name + "꽃화분의 제작비용은 " + money + "원으로 가격이 같아 제작과 구매 상관 없습니다.");
        }
    }

    public void make_wood_Axe(){
        double money = this.iron + this.wood + this.fee;
        double Gain = wood_Axe - money;
        double loss = -(wood_Axe - money);
        if(money < wood_Axe){
            System.out.println(wood_Axe_name + "의 가격은" + wood_Axe + "원 이고, " + wood_Axe_name + "의 제작비용은 " + money + "원 이므로 제작이 "+ Gain + "원 이득입니다.");
        }else if(money > wood_Axe){
            System.out.println(wood_Axe_name + "의 가격은" + wood_Axe + "원 이고, " + wood_Axe_name + "의 제작비용은 " + money +"원 이므로"+ loss + "원 손해입니다, 상점에서 구매하세요.");
        }else{
            System.out.println(wood_Axe_name + "의 가격은" + wood_Axe + "원 이고, " + wood_Axe_name + "의 제작비용은 " + money + "원으로 가격이 같아 제작과 구매 상관 없습니다.");
        }
    }
}