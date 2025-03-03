package KOSA_coding;
//      전화번호부 :  이름, 전화번호, 생년월일, 한명의 전화내역을 출력
//      >1.추가 2.전체출력 3.검색 4.종료
//      >메뉴: 1
//      >이름 : 홍길동
//      >전화번호 : 111-1111
//      >생년월일 : 20/01/01
//      >전화번호가 등록 되었습니다.

//      >1.추가 2.전체출력 3.검색 4.종료
//      >메뉴 : 2
//      >이름 : 홍길동
//      >전화번호 : 111-1111
//      >생년월일 : 20/01/01

//      >1.추가 2.전체출력 3.검색 4.종료
//      >메뉴 : 3
//      >검색 이름 : 홍길동
//      >이름 : 홍길동
//      >전화번호 : 111-1111
//      >생년월일 : 20/01/01

//      >1.추가 2.전체출력 3.검색 4.종료
//      >메뉴 : 4
//      >프로그램 종료

public class Contact {
    // field
    private String name;
    private String number;
    private String birth;
    
    // 디폴트 연산자
    public Contact() {}

    // 연산자
    public Contact(String name, String number, String birth) {
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
