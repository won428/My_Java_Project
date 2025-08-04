package ch05_package.inheritance.sport;

public class Sport {
    private String name;
    private int entry;
    private String game;

    public Sport(String name, int entry){
       this.name =  name;
       this.entry =  entry;
    }

    public void comment(){
        System.out.println(name + " 경기는 " + entry + "명의 엔트리로 구성이됩니다.");
    }
}
