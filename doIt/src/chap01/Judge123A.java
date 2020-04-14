package chap01;

import java.util.Scanner;

class Judge123A {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = stdIn.nextInt();
		
		if(n==1)
			System.out.println("1");
		else if(n==2)
			System.out.println("2");
		else if(n==3){
			System.out.println("3");
		}
	}
}
