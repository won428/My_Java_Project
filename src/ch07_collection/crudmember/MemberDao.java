package ch07_collection.crudmember;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
    private List<Member> memberList = null;

    public MemberDao(){
       this.memberList = new ArrayList<>();
   }

   public int insertData(Member memver){ //회원 한명 추가하기
       System.out.println("아이디가 " + memver.getId() + "인 사람을 추가합니다.");
       this.memberList.add(memver);
       return 1;
   }

   public int getSize(){
        return memberList.size();
   }

   public List<Member> selectAll(){
        return this.memberList;
   }

   public Member getOne(String id){
        Member idData = null;
        for(Member member : memberList){
            if(id  == member.getId()){
                idData = member;
                break;
            }else{

            }
        }
        return idData;
   }

   public int deleteData(String deleteId){
        int data = -1;
        for(Member member : memberList){
            if(deleteId.equals(member.getId())){
                memberList.remove(member);
                data = 1;
                break;
            }
        }
        return data;
   }


    public void deleteAlldata() {
        memberList.clear();
    }
}
