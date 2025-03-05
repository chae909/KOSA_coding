package kosa.oop;

import java.util.Scanner;

public class ContactMain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contact01 arr[] = new Contact01[3];
        int count = 0;

        while (true){
            System.out.println("1. �߰� 2. ��ü��� 3. �˻� 4. ����");
            System.out.print("�޴���ȣ�� �����ϼ���: ");
            String menu = sc.nextLine();
            
            // 1�� �޴��� ���������� �̸� ��ȭ��ȣ ��������� �Է¹���
            if (menu.equals("1")){
                System.out.print("�̸�: ");
                String name = sc.nextLine();
                System.out.print("��ȭ��ȣ: ");
                String number = sc.nextLine();
                System.out.print("�������: ");
                String birth = sc.nextLine();
                
                // �迭�� ���� �� ��ϿϷ� �޼��� ���
                arr[count++] = new Contact01(name, number, birth);
                System.out.println("��ȭ��ȣ�� ��� �Ǿ����ϴ�.");
            } 
            
            // 2�� �޴� ���������� ����� ���� ��� ���
            else if (menu.equals("2")){
                for (int i = 0; i < count; i++) {
                    arr[i].printContact();
                }
            } 
            
            // 3�� �޴� ���������� �̸� �Է�, �̸��� ��ġ�ϴ� ���� �˻�
            else if (menu.equals("3")){
                System.out.print("�̸� �˻�: ");
                String searchName = sc.nextLine();
                for (int i = 0; i < count; i++) {
                    arr[i].searchContact(searchName);
                }
            } 
            
            else if (menu.equals("4")){
                System.out.println("���α׷� ����");
                break;
            } else {
                System.out.println("�޴��� �ٽ� ����ּ���.");
            }
            }
        }
    }