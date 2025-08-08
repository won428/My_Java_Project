package ch07_collection;

import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String args[]){
        Set<Object> set = new HashSet<Object>();
        set.add("아메리카노");
        set.add(123);
        set.add(false);
        set.add("아메리카노");

        set.clear();

        set.add("아메리카노");
        set.add("에스프레소");
        set.add("믹스커피");
        set.add("카페라떼");

        String findData = "카푸치노";

        System.out.println(findData + " 존재 여부 : " + set.contains(findData) );

        if(set.contains(findData)){
            System.out.println(findData + " 있음");
        }else{
            System.out.println(findData + " 없음");
        }

        // '마키야또'가 존재하는지 확인하시고 , 없으면 추가해 보세요.

        String addDate = "마키야또";

        if(set.contains(addDate) == false) {
            set.add(addDate);
        }
        findData = "믹스커피";
        // 믹스커피가 존재하면 삭제하고 삭제 성공이라는 문구를 출력해보세요
        // 없으면 존재하지 않음이라는 문구를 출력해주세요
        if(set.remove(findData)){
            set.remove(findData);
            System.out.println(findData + "삭제 성공");
        }else{
            System.out.println("존재하지 않음");
        }

        System.out.println("확장 for 구문을 이용한 요소 출력");
        // for(타입 단수이름:복수이름){...}
        for(Object item : set){
            System.out.println(item);
        }






        System.out.println("요소 크기 : " + set.size());







    }
}
