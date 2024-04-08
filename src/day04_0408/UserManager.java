package day04_0408;

import java.util.Scanner;

// 메인
public class UserManager {
    private static UserDAO userDao = new UserDAO();
    private static Scanner scanner = new Scanner(System.in);
    private static String loggedInUserId = null;

    public static void main(String[] args) {
        while (true) {
            System.out.println("1: 회원 가입, 2: 로그인, 3: 회원 정보 수정, 4: 탈퇴, 0: 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 숫자 입력 후 남은 줄바꿈 문자 제거

            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    updateUserInfo();
                    break;
                case 4:
                    deleteUser();
                    break;
                case 0:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    private static void register() {
        System.out.print("아이디: ");
        String id = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();
        System.out.print("이름: ");
        String name = scanner.nextLine();


        User user = new User(id, password, name);
        userDao.register(user);
        System.out.println(user.name + "님 가입을 환영합니다.");
    }


    private static void login() {
        System.out.print("아이디: ");
        String id = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();

        boolean loginSuccess = userDao.login(id, password);
        if (loginSuccess) {
            loggedInUserId = id; // 로그인 성공한 사용자의 아이디를 저장
        } else {
            System.out.println("로그인 실패");
        }
    }

    private static void updateUserInfo() {
        // 로그인 상태가 아닌 경우, 수정할 수 없음
        if (loggedInUserId == null) {
            System.out.println("로그인 상태가 아닙니다.");
            return;
        }

        System.out.print("새 비밀번호: ");
        String newPassword = scanner.nextLine();
        System.out.print("새 이름: ");
        String newName = scanner.nextLine();

        userDao.updateUserInfo(loggedInUserId, newPassword, newName);
    }

    private static void deleteUser() {
        // 로그인 상태가 아닌 경우, 수정할 수 없음
        if (loggedInUserId == null) {
            System.out.println("로그인 상태가 아닙니다.");
            return;
        }

        userDao.deleteUser(loggedInUserId);
    }
}