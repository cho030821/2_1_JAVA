package main.java.inhatc.cse.java.basic.chapter12.ex2_collection.test;

public class MemberTest {
    static void main(String[] args) {
        MemberManager manager = new MemberManager();
        Member member1 = new Member(100,"홍길동");
        Member member2 = new Member(101,"최길동");
        Member member3 = new Member(102,"김길동");

        manager.addMember(member1);
        manager.addMember(new Member(120,"김민호"));
        manager.removeMember("김민호");
        manager.showMember();

    }

}
