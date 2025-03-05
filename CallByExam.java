package kosa.basic;

public class CallByExam {
	
	public static int change(int num) {
		num += 10;
		return num;
	}
	
	public static void change2(int brr[]) { // method안에 배열 넣을때는 []표시를 꼭 넣어줘야함
		brr[0] += 100;
	}

	public static void main(String[] args) {
		int arr[] = {100};
		change2(arr);
		System.out.println(arr[0]);
	}
}