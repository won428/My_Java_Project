package ch07_collection.crudmember;

import java.util.List;

public class MemberMain {
    public static void main(String[] args) {
        MemberDao dao = new MemberDao();

        dao.insertData(new Member("kim", "김만수", 10, "남자"));
        dao.insertData(new Member("park", "박영희", 20, "여자"));
        dao.insertData(new Member("lee", "이수진", 30, "여자"));
        dao.insertData(new Member("choi", "최윤식", 40, "남자"));

        int size = dao.getSize();
        System.out.println("회원은 총 " + size + "명입니다.");

        System.out.println("\n모든 회원 정보를 출력합니다.");
        System.out.println("id\tname\tage\tgender");
        List<Member> memberList = dao.selectAll();
        for (Member member : memberList) {
            String id = member.getId();
            String name = member.getName();
            int age = member.getAge();
            String gender = member.getGender();
            String message = id + "\t" + name + "\t" + age + "\t" + gender;
            System.out.println(message);
        }

        String findId = "kim";
        Member one = dao.getOne(findId);
        if (one == null) {
            System.out.println(findId + " 아이디는 존재하지 않습니다.");
        } else {
            System.out.println("\n해당 아이디의 정보를 출력합니다.");
            String id = one.getId();
            String name = one.getName();
            int age = one.getAge();
            String gender = one.getGender();
            String message = id + "\t" + name + "\t" + age + "\t" + gender;
            System.out.println(message);
        }

        System.out.println("\n특정 아이디를 사용하여 회원 정보를 삭제합니다.");
        String deleteId = "lee";

        int result = dao.deleteData(deleteId);
        if (result != -1) {
            System.out.println(deleteId + " 아이디의 정보를 삭제 완료했습니다.");
        } else {
            System.out.println("해당 아이디의 정보는 존재하지 않습니다.");
        }
        size = dao.getSize();
        System.out.println("회원은 총 " + size + "명입니다.");

        System.out.println("before delete all data : " + dao.getSize());
        System.out.println("회원 목록을 전부 삭제합니다.");
        dao.deleteAlldata();
        System.out.println("after delete all data : " + dao.getSize());
    }
}
