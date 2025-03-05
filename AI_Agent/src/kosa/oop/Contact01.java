package kosa.oop;

public class Contact01 {
    // field
    private String name;
    private String number;
    private String birth;
    
    // 디폴트 연산자
    public Contact01() {}

    // 연산자
    public Contact01(String name, String number, String birth) {
        this.name = name;
        this.number = number;
        this.birth = birth;
    }

    // 출력 method
    public void printContact() {
        System.out.println("이름: " + name);
        System.out.println("전화번호: " + number);
        System.out.println("생년월일: " + birth);
    }

    // 검색 method
    public void searchContact(String name) {
        if (this.name.equals(name)) {
            printContact();
        }
    }
}