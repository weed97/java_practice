package com.ex.reveiw;

import java.util.Scanner;

public class Application {


    /*
     * 여러명의 정보를 받아와서 등록
     * 등록한거를 객체 배열로 저장
     * 객체 배열을 저장된 값 꺼내서 출력
     * */

    /*
     * 시스템 요구사항
     * 1. 여려명의 회원 정보를 받아 한 변에 여러 회원 정보를 등록
     * 2. 전체 회원 조회시 여러명의 회원 정보를 반환
     *
     * 제약사항
     * 1.MemberRepository에 static 필드로 정보를 교환한다.
     * 2. 회원 정보는 최대 10명까지 지정할 수 있다.
     * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberService memberService = new MemberService();


        while (true) {
            System.out.println(""" 
                    ============= 회원 관리 프로그램 등록 ================
                    1. 회원등록
                    2. 회원 전체 조회
                    9. 프로그램 종료
                    메뉴 선택 :""");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    memberService.signUpMember();
                    break;
                case 2:
                    memberService.signAllMembers();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다. ");
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }


        }


    }

}
