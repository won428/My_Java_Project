package ch07_collection.crudboard;

// DAO 클래스 : 데이터 베이스에게 데이터를 추가/수정/삭제 등의 작업을 요청해주는 중간 middle-ware 성격의 클래스

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    private List<Board> boardList = null; // 게시물을 담는 통(bottle)

    public BoardDao(){
               this.boardList = new ArrayList<>(); // 게시물 담는 통 초기화
    }

    public int insertDate(Board board){
        System.out.println("게시물 번호 " + board.getNo() + "이(가) 추가됩니다.");
        boardList.add(board);
        return 1; // 데이터에서 0은 false를 의미
    }

    public int getSize(){
        return this.boardList.size();
    }

    public List<Board> selectAll(){
        return this.boardList;
    }

    public Board getOne(int findId){
        Board findData = null;
        for(Board board : boardList){
            if(board.getNo() == findId){
                findData = board;
                break;
            }
        }
        return findData;
    }

    public int removeData(int deleteId){
        int deleteData = -1; // -1은 발견 여부를 나타내는 flag 변수
        for(Board board : boardList) {
            if (deleteId == board.getNo()) {
                boardList.remove(board);
                deleteData = 1;
                break;
            }else{
            }
        }
        return deleteData;
    }

    public void removeAll(){
        this.boardList.clear();
    }
}
