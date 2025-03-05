package kosa.oop;

public class Contact01 {
    // field
    private String name;
    private String number;
    private String birth;
    
    // ����Ʈ ������
    public Contact01() {}

    // ������
    public Contact01(String name, String number, String birth) {
        this.name = name;
        this.number = number;
        this.birth = birth;
    }

    // ��� method
    public void printContact() {
        System.out.println("�̸�: " + name);
        System.out.println("��ȭ��ȣ: " + number);
        System.out.println("�������: " + birth);
    }

    // �˻� method
    public void searchContact(String name) {
        if (this.name.equals(name)) {
            printContact();
        }
    }
}