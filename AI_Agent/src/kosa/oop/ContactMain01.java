package kosa.oop;

import java.util.Scanner;

public class ContactMain01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contact01 arr[] = new Contact01[3];
        int count = 0;

        while (true){
            System.out.println("1. �߰� 2. ��ü��� 3. �˻� 4. ����");
            System.out.print("�޴���ȣ�� �����ϼ���: ");
            String menu = sc.nextLine();
            switch (menu) {
                case "1":
                    System.out.print("�̸�: ");
                    String name = sc.nextLine();
                    System.out.print("��ȭ��ȣ: ");
                    String number = sc.nextLine();
                    System.out.print("�������: ");
                    String birth = sc.nextLine();
                    
                    arr[count++] = new Contact01(name, number, birth);
                    System.out.print("��ȭ��ȣ�� ��� �Ǿ����ϴ�.");
                    break;
                case "2":
                    for (int i = 0; i < count; i++) {
                        arr[i].printContact();
                    }
                    break;
                case "3":
                    System.out.print("�̸� �˻�: ");
                    String searchName = sc.nextLine();
                    for (int i = 0; i < count; i++) {
                        arr[i].searchContact(searchName);
                    }
                    break;
                case "4":
                    System.out.println("���α׷� ����");
                    break;
                default:
                    System.out.println("�޴��� �ٽ� ����ּ���.");
                    break;
            }
        }
    }

}