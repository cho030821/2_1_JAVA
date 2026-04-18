package main.java.inhatc.cse.java.basic.chapter12.ex2_collection.test;

import java.util.ArrayList;

public class MemberManager {
    private ArrayList<Member> memberlist;

    public MemberManager() {
        this.memberlist = new ArrayList<>();
    }

    public void addMember(Member member){
        memberlist.add(member);
    }

    public boolean removeMember(String name){
        for ( int i = 0; i < memberlist.size(); i++){
            Member membername = memberlist.get(i);
            if(membername.getName().equals(name)){
                memberlist.remove(i);
                return true;
            }

        }
        System.out.println("그런 사람 없습니다");
        return false;
    }

    public void showMember(){
        for(Member member : memberlist){
            System.out.println(member.getName());
        }
    }

}
