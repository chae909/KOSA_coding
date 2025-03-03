package KOSA_coding;
import java.util.Scanner;

public class ContactMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contact arr[] = new Contact[3];
        int count = 0;

        while (true){
            System.out.println("1. 추가\t2. 전체출력\t3. 검색\t4. 종료");
            String menu = sc.nextLine();
            switch (menu) {
                case "1":
                    System.out.println("이름: ");
                    String name = sc.nextLine();
                    System.out.println("전화번호: ");
                    String number = sc.nextLine();
                    System.out.println("생년월일: ");
                    String birth = sc.nextLine();
                    arr[count++] = new Contact(name, number, birth);
                    System.out.println("전화번호가 등록 되었습니다.");
                    break;
                case "2":
                    for (int i = 0; i < count; i++) {
                        arr[i].printContact();
                    }
                    break;
                case "3":
                    System.out.println("이름 검색색: ");
                    String searchName = sc.nextLine();
                    for (int i = 0; i < count; i++) {
                        arr[i].searchContact(searchName);
                    }
                    break;
                case "4":
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("메뉴를 다시 골라주세요.");
                    break;
            }
        }
    }

}
