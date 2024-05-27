package com.ex.reveiw;

public class MemberFinder {

    public Member[] findALLMembers() {

    Member[] foundMembersFromRepository = MemberRepository.findAllMembers();

    return MemberRepository.findAllMembers();
    }

}
