package kr.ac.sahmyook.home.run;
import kr.ac.sahmyook.home.view.Menu;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        String s;

        do {
            System.out.println();
            System.out.println("***** 프로그래밍 기본 기능 테스트 프로그램 *****\n");
            System.out.println("1. 변수 테스트\n");
            System.out.println("2. 기본 자료형 테스트\n");
            System.out.println("3. if문 테스트\n");
            System.out.println("4. switch문 테스트\n");
            System.out.println("5. for문 테스트\n");
            System.out.println("6. while문 테스트\n");
            System.out.println("7. do~while문 테스트\n");
            System.out.println("8. break문 테스트\n");
            System.out.println("9. continue문 테스트\n");
            System.out.println("10. static 메소드 사용 테스트\n");
            System.out.println("11. non-static 메소드 사용 테스트\n");
            System.out.println("12. 프로그램 종료\n");
            System.out.print("메뉴 번호 입력 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    menu.subVarMenu();
                    break;
                case 2:
                    menu.subPTypeMenu();
                    break;
                case 3:
                    menu.subIfMenu();
                    break;
                case 4:
                    menu.subSwitchMenu();
                    break;
                case 5:
                    menu.subForMenu();
                    break;
                case 6:
                    menu.subWhileMenu();
                    break;
                case 7:
                    menu.subDoWhileMenu();
                    break;
                case 8:
                    menu.subBreakMenu();
                    break;
                case 9:
                    menu.subContinueMenu();
                    break;
                case 10:
                    menu.subStaticMethodMenu();
                    break;
                case 11:
                    menu.subNonStaticMethodMenu();
                    break;
                case 12:
                    System.out.print("\n정말로 종료하시겠습니까? (예:y/아니오:n) : ");
                    s = sc.next();
                    if(s.equals('y') || s.equals('Y')) {
                    }
                    return;
                default:
                    System.out.print("\n1~12 사이의 번호를 입력해주세요.\n");
                    continue;
            }
        } while (true);
    }
}
