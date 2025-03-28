package member;

import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {

    public void memberAllPrint(List<MemberDTO> list) {

        for (MemberDTO memberDTO : list) {
            // System.out.println("==== 회원 조회 ====");
            // System.out.println("번호 : " + dto.getNo());
            // System.out.println("아이디 : " + dto.getId());
            // System.out.println("이름 : " + dto.getName());
            // System.out.println("주소 : " + dto.getAddr());
            // System.out.println("이메일 : " + dto.getEmail());
            // System.out.println("나이 : " + dto.getAge());
            memberPrint(memberDTO);
        }

    }

    // 조회
    public String memberGetInfo(Scanner sc) {

        System.out.println("==== 회원 조회 ====");

        System.out.println("1. 아이디 조회 ");
        System.out.println("2. 이름 조회 ");

        System.out.print("번호 >> ");
        int no = Integer.parseInt(sc.nextLine());

        String input = "";

        if (no == 1) {
            System.out.println("조회 회원 아이디 >> ");
            input = sc.nextLine();
        } else {
            System.out.println("조회 회원 이름 >> ");
            input = sc.nextLine();
        }
        return input;

    }

    // dto 출력메소드
    public void memberPrint(MemberDTO dto) {
        System.out.println("==== 회원 조회 ====");
        System.out.println("번호 : " + dto.getNo());
        System.out.println("아이디 : " + dto.getId());
        System.out.println("이름 : " + dto.getName());
        System.out.println("주소 : " + dto.getAddr());
        System.out.println("이메일 : " + dto.getEmail());
        System.out.println("나이 : " + dto.getAge());
        // System.out.println("비고 : " + dto.getNo());
    }

    // 삭제 작업
    public String memberDeleteInfo(Scanner sc) {

        System.out.println("==== 회원 삭제 정보 입력 ====");

        System.out.println("아이디 >> ");
        String id = sc.nextLine();

        return id;
    }

    public MemberDTO memberInsertInfo(Scanner sc) {
        System.out.println();
        MemberDTO memberDTO = new MemberDTO();

        System.out.println("======= 회원 정보 입력 화면 =======");
        System.out.println("아이디 >> ");
        memberDTO.setId(sc.nextLine());

        System.out.println("이름 >> ");
        memberDTO.setName(sc.nextLine());

        System.out.println("주소 >> ");
        memberDTO.setAddr(sc.nextLine());

        System.out.println("이메일 >> ");
        memberDTO.setEmail(sc.nextLine());

        System.out.println("나이 >> ");
        memberDTO.setAge(Integer.parseInt(sc.nextLine()));

        return memberDTO;

    }

    // 성공시 출력 메소드
    public void printSuccessMessage(int result) {
        // reasult 값에 따라 입력 성공 / 입력 실패 출력
        System.out.println(result > 0 ? "입력 성공" : "입력 실패");
    }

    // 삭제시 출력 메소드
    public void printDeleteSuccessMessage(int result) {
        // reasult 값에 따라 입력 성공 / 입력 실패 출력
        System.out.println(result > 0 ? "삭제 성공" : "삭제 실패");
    }

    // 업데이트 성공시 출력 메소드
    public void printUpdateSuccessMessage(int result, String id) {
        // reasult 값에 따라 수정 성공 / 수정 실패 출력
        System.out.println(result > 0 ? id + " 님의 정보를 수정하였습니다" : id + " 님의 정보 수정에 실패하였습니다");
    }

    public MemberDTO memberUpdateMenu(Scanner sc) {
        System.out.println("========== 회원 정보 수정 ==========");
        System.out.println("1. 주소 수정");
        System.out.println("2. 이메일 수정");
        System.out.println("====================================");
        System.out.println("번호 >> ");
        int no = Integer.parseInt(sc.nextLine());

        if (no == 1) {
            // no == 1 memberUpdateAddr() 호출
            return memberUpdateAddr(sc);
        } else if (no == 2) {
            // no == 2 memberUpdateEmail() 호출
            return memberUpdateEmail(sc);
        }

        return null;
    }

    public MemberDTO memberUpdateAddr(Scanner sc) {
        // 수정할 값 입력(id, 변경할 addr) => DTO에 담은 후 리턴
        System.out.println("==== 수정 정보 입력 ====");
        System.out.println("아이디 >> ");
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(sc.nextLine());
        System.out.println("변경 주소 >> ");
        memberDTO.setAddr(sc.nextLine());
        return memberDTO;
    }

    public MemberDTO memberUpdateEmail(Scanner sc) {
        // 수정할 값 입력(id, 변경할 email) => DTO에 담은 후 리턴
        System.out.println("==== 수정 정보 입력 ====");
        System.out.println("아이디 >> ");
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(sc.nextLine());
        System.out.println("변경 이메일 >> ");
        memberDTO.setEmail(sc.nextLine());
        return memberDTO;
    }

}
