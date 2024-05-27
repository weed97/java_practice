package com.ex.reveiw;

public class MemberService {

    public void signUpMember() {

        Member[] members = new Member[5];
        members[0] = new Member(1,"01011112222",1234,"홍길동",20,'남');
        members[1] = new Member(2, "01022223333", 3456, "나길동", 21, '남');
        members[2] = new Member(3, "01033333333", 4456, "다길동", 22, '여');
        members[3] = new Member(4, "01044443333", 5456, "라길동", 23, '남');
        members[4] = new Member(5, "01055553333", 6456, "마길동", 24, '여');

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);


    }


    public void signAllMembers() {
        MemberFinder finder = new MemberFinder();
        System.out.println("================== 가입된 회원 목록 ==================");

        Member[] foundMembers = finder.findALLMembers();
        for (Member m : foundMembers) {
            if (m != null) {
                System.out.println(m.getInformation());
            }
        }
        System.out.println("----------------------------------------------------");
    }
}
