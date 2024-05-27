package com.ex.reveiw;

import com.sun.source.tree.MemberReferenceTree;

public class MemberRegister {
    public void regist(Member[] members) {
        System.out.println("회원을 등록합니다.");

        for (Member m : members) {
            System.out.println(m.getNmae() + "님을 회원 등록에 하겠습니다");
        }

        if (MemberRepository.store(members)) {
            System.out.println("총" + members.length + "명의 회원 등록에 성공했습니다.");
        }
    }
}
