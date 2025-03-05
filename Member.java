package KOSA_coding;

public class Member {
    private String name;
    private int age;

    // 디폴트연산자
    public Member() {}

    // 연산자
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 메소드드
    public void printMember() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
 }