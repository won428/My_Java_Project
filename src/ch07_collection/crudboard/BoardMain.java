package ch07_collection.crudboard;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {
    public static void main(String[] args) {
        Board date01 = new Board(10, "여름 폭염", "김철수", "2025/08/10", 5);
        Board date02 = new Board(9, "우크라이나 전쟁", "푸틴", "2025/07/17", 3);
        Board date03 = new Board(8, "홈플러스", "이수정", "2025/11/11", 8);

        BoardDao dao = new BoardDao();
        dao.insertDate(date01);
        dao.insertDate(date02);
        dao.insertDate(date03);
        dao.insertDate(new Board(7, "서이초등학교", "금잔디", "2025/11/11", 4));
        dao.insertDate(new Board(6, "남극탐험", "이강우", "2025/11/11", 11));

        System.out.println("요소 개수 : " + dao.getSize());
        System.out.println("\n전체 게시물 목록을 조회합니다");
        List<Board> boardList = dao.selectAll();


        System.out.println("글번호\t제목\t작성자\t작성 일자\t조회수");
        for(Board board : boardList){
            int no = board.getNo();
            String title = board.getTitle();
            String writer = board.getWriter();
            String regdate = board.getRegdate();
            int readcount = board.getReadcount();
            String message = no + "\t" + title + "\t" + writer + "\t" + regdate + "\t" + readcount;
            System.out.println(message);
        }

        System.out.println("\n게시물 번호를 이용하여 특정 게시물을 조회합니다.");
        int findId = 7;

        Board board = dao.getOne(findId);

        if(board == null){
            System.out.println(findId + "번 게시물은 존재하지 않습니다.");
        }else {
            System.out.println("글번호\t제목\t작성자\t작성 일자\t조회수");
            int no = board.getNo();
            String title = board.getTitle();
            String writer = board.getWriter();
            String regdate = board.getRegdate();
            int readcount = board.getReadcount();
            String message = no + "\t" + title + "\t" + writer + "\t" + regdate + "\t" + readcount;
            System.out.println(message);

        }
        int deleteId = 6;

        int result = dao.removeData(deleteId);

        if(result != -1){
            System.out.println(deleteId + "번 게시물 삭제 성공");
        }else{
            System.out.println(deleteId + "번 게시물을 발견하지 못했습니다.");
        }

        System.out.println("\nbefore all delete : " + dao.getSize());
        System.out.println("\n게시물 목록을 전부 삭제합니다.");
        dao.removeAll();

        System.out.println("\nafter all delete : " + dao.getSize());

    }
}
