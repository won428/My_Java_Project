package ch04_class;

public class OverAddMain {
    public static void main(String[] args) {
        int a = 3, b = 5, c =7;
        double x = 1.1, y = 2.2;

        OverAdd obj = new OverAdd();

        obj.Add(a,b);
        obj.Add(x,y);

        int result = obj.Add(a,b,c);
        System.out.println("반환 결과 : " + result);

        a = 100;
        b = 200;
        obj.Add(a,b); // 메소드 시그니쳐(여기서는 정수형 + 정수형)가 같기 떄문에 오류가 나지 않는다.

        x = 5.5;
        y = 3.4;
        obj.Add(x,y);

        obj.Add(a,x); // 암시적 형변환이 되므로 오류가 생기지 않음. 지금은 실수 덧셈 시그니쳐로 가지만 만약 해당하는 메소드 시그니쳐가 있다면 그곳으로 할당됨
    }
}
