package ch07_collection;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String args[]){
        List<String> coffeeList = new ArrayList<String>();
        coffeeList.add("아메리카노"); //0 : 인덱스번호
        coffeeList.add("카페라떼"); //1
        coffeeList.add("에스프레소"); //2
        coffeeList.add("마키야또"); //3
        coffeeList.add("카페라떼"); //4

        int idx = -1;
        String findData = "카페라떼";
        idx = coffeeList.indexOf(findData);
        System.out.println(findData + "의 인덱스 번호 : " + idx);

        idx = coffeeList.lastIndexOf(findData);
        System.out.println(findData + "의 마지막 인덱스 번호 : " + idx);

        findData = "카푸치노";
        idx = coffeeList.indexOf(findData);
        System.out.println(findData + "의 인덱스 번호 : " + idx);

        //카푸치노 항목이 존재하지 않으면 2번째 위치에 추가해 보세요

        if(coffeeList.indexOf(findData) == -1){
            coffeeList.add(2,findData);
            System.out.println(findData + "를 추가했습니다.");
        }else{
            System.out.println(findData + "는 이미 존재합니다.");
        }

        System.out.println("확장 for 구문을 이용한 출력");

        for(String coffee : coffeeList){
            System.out.print(coffee + " ");
        }
        System.out.println();

        findData = "콜드 브루";
        coffeeList.set(5, findData);

        findData = "카푸치노";
        coffeeList.remove(findData);

        coffeeList.add(findData);

        String item  = coffeeList.get(3);
        System.out.println("특정 위치 요소 : " + item);

        System.out.println("일반 for 구문으로 요소 출력하기");
        for (int i = 0; i < coffeeList.size(); i++) {
            String data = coffeeList.get(i);
            System.out.println(data);
        }

        System.out.println(coffeeList);
        System.out.println("요소 크기 : " + coffeeList.size());
    }
}
