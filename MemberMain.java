package KOSA_coding;

import java.util.Scanner;

public class MemberMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Member arr[] = new Member[3];
        int count = 0;

        while (true) {
            System.out.println("이름: ");
            String name = sc.nextLine();
            System.out.println("나이: ");
            int age = Integer.parseInt(sc.nextLine());

            arr[count++] = new Member(name, age);
            if (count == 3)
                break;
        }
        for (int i = 0; i < count; i++) {
            arr[i].printMember();
        }

    }
}
