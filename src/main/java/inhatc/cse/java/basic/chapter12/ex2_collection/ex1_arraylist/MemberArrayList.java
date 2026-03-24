package main.java.inhatc.cse.java.basic.chapter12.ex2_collection.ex1_arraylist;

import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member> arraylist;
    public MemberArrayList(){
        this.arraylist = new ArrayList<>();

    }
    public void addMember(Member member){
        arraylist.add(member);
    }
    public boolean removeMember(int id) {
        for (int i = 0; i < arraylist.size(); i++) {
            Member member = arraylist.get(i);
            if(member.getId()==id){
                arraylist.remove(i);

            }else {
                System.out.println("잘못 쳤어요");
            }

        }
        return true;
    }
    public void showAllMember(){
        for(Member member: arraylist){
            System.out.println(member);
        }
        System.out.println();
    }

}
