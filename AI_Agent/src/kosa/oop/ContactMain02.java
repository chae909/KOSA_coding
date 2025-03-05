package kosa.oop;

import java.util.Scanner;

public class ContactMain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contact01 arr[] = new Contact01[3];
        int count = 0;

        while (true){
            System.out.println("1. 추가 2. 전체출력 3. 검색 4. 종료");
            System.out.print("메뉴번호를 선택하세요: ");
            String menu = sc.nextLine();
            
            // 1번 메뉴를 선택했을때 이름 전화번호 생년월일을 입력받음
            if (menu.equals("1")){
                System.out.print("이름: ");
                String name = sc.nextLine();
                System.out.print("전화번호: ");
                String number = sc.nextLine();
                System.out.print("생년월일: ");
                String birth = sc.nextLine();
                
                // 배열에 저장 후 등록완료 메세지 출력
                arr[count++] = new Contact01(name, number, birth);
                System.out.println("전화번호가 등록 되었습니다.");
            } 
            
            // 2번 메뉴 선택했을때 저장된 정보 모두 출력
            else if (menu.equals("2")){
                for (int i = 0; i < count; i++) {
                    arr[i].printContact();
                }
            } 
            
            // 3번 메뉴 선택했을때 이름 입력, 이름과 일치하는 정보 검색
            else if (menu.equals("3")){
                System.out.print("이름 검색: ");
                String searchName = sc.nextLine();
                for (int i = 0; i < count; i++) {
                    arr[i].searchContact(searchName);
                }
            } 
            
            else if (menu.equals("4")){
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("메뉴를 다시 골라주세요.");
            }
            }
        }
    }