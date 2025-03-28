package member;

import java.util.List;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberDAO mDao = new MemberDAO();
        MemberDTO mDto = new MemberDTO();
        ConsoleUtil util = new ConsoleUtil();

        boolean run = true;

        while (run) {

            System.out.println("================= MEMBER =================");
            System.out.println("1. member 추가");
            System.out.println("2. member 수정");
            System.out.println("3. member 삭제");
            System.out.println("4. member 조회");
            System.out.println("5. member 전체 조회");
            System.out.println("6. 프로그램 종료");
            System.out.println("==========================================");

            System.out.println("메뉴 선택 >> ");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    mDto = util.memberInsertInfo(sc);
                    int result = mDao.insert(mDto);
                    util.printSuccessMessage(result);
                    break;
                case 2:
                    mDto = util.memberUpdateMenu(sc);
                    if (mDto != null) {
                        result = mDao.update(mDto);
                        // 출력문 호출
                        util.printUpdateSuccessMessage(result, mDto.getId());
                    }
                    break;
                case 3:
                    String id = util.memberDeleteInfo(sc);
                    result = mDao.delete(id);
                    util.printDeleteSuccessMessage(result);
                    break;
                case 4:
                    String input = util.memberGetInfo(sc);

                    // regex(정규식)
                    // input.matches("^[A-Za-z].*"); : 정규식과 일치하면 true
                    if (input.matches("^[A-Za-z].*")) {
                        MemberDTO row = mDao.getRow(input);
                        if (row != null) {
                            util.memberPrint(row);
                        }
                    } else {
                        List<MemberDTO> list = mDao.getNameList(input);
                        if (!list.isEmpty()) {
                            util.memberAllPrint(list);
                        }
                    }
                    // 출력 메소드

                    break;
                case 5:
                    // mDao.getList() => 받은 결과 화면 출력
                    List<MemberDTO> list = mDao.getList();
                    util.memberAllPrint(list);
                    break;
                case 6:
                    run = false;
                    break;

                default:
                    break;
            }
        }
    }
}
