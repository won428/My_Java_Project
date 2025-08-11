package ch07_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String args[]) {
        Map<String, Integer> teamMap = new HashMap<>();

        teamMap.put("lg", 1);
        teamMap.put("ssg", 2);
        teamMap.put("두산", 3);
        teamMap.put("kt", 4);

        String findItem = "nc";
        boolean bool = teamMap.containsKey(findItem);
        System.out.println(findItem + "팀이 목록에 있나요 ? " + bool);

        //nc 팀이 존재하는지 체크하고, 없으면 순위 5위로 추가해주세요

        if (bool == false) {
            teamMap.put("nc", 5);
        }

        //순위가 6위인 팀이 존재하는지 체크하고, 존재하지 않으면 kia를 추가해 주세요
        final int pos = 6;
        String team = "kia";
        if (teamMap.containsValue(pos)) {
            System.out.println(pos + "위 팀은 " + team + " 입니다");
        } else {
            System.out.println(pos + "위 팀에 " + team + "를 추가합니다");
            teamMap.put(team, pos);
        }

        String[] teams = {"롯데", "한화", "키움", "삼성"};
        for (int i = 0; i < teams.length; i++) {
            teamMap.put(teams[i], i + 7);
        }

        findItem = "한화";
        Integer rank = teamMap.get(findItem);

        if (rank == null) {
            System.out.println("팀은 존재하지 않습니다");
        } else {
            String message = "팀명 : " + findItem + "\n순위 : " + rank;
            System.out.println(message);
        }

        System.out.println("다음 팀들의 순위 정보를 출력해주세요");
        String[] findTeams = {"두산", "kt", "빙그레"};

        for (String findTeam : findTeams) {
            rank = teamMap.get(findTeam);
            String message;
            if (rank == null) {
                message = "팀이 존재하지 않아서 추가합니다";
                System.out.println(message);
                teamMap.put(findTeam, 11);
            } else {
                message = "팀명 : " + findItem + "\n순위 : " + rank;
                System.out.println(message);
            }
        }

        System.out.println("전체 목록을 출력해봅니다");
        Set<String> items = teamMap.keySet();
        for (String item : items) {
            String message = item + "팀은 순위가 " + teamMap.get(item) + "위 입니다.";
            System.out.println(message);
        }
        //keySet : Map의 Key값들만 반환타입으로 정렬
        //values : Map의 Value값들만 반환타입으로 정렬
        System.out.println(teamMap);
        System.out.println("요소 개수 : " + teamMap.size());

        teamMap.clear();
        //메소드에 비동사가 붙으면 반환타입이 boolean일 가능성이 매우 높다
        if (teamMap.isEmpty()) {
            System.out.println("teamMap is empty");
        } else {
            System.out.println("teamMap is not empty");
        }
    }
}