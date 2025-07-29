package ch03_array;

public class Array01 {
    public static void main(String[] args) {
        String[] bts = {"진", "뷔", "정국" , "RM","지민", "슈가", "제이홉"};
        System.out.print("bts의 멤버는 ");
        for (int i = 0; i < bts.length ; i++){
            System.out.print(bts[i]);
            if(i < bts.length - 1){
                System.out.print(",");
            }
        }
        System.out.print("이 있다.");
    }
}
