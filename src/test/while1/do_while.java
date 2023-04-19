package test.while1;

import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("반복횟수 입력: ");
		int count = s.nextInt();
		int i = 0;
		
		do {
			System.out.println(i + " : do ~ whlie문 실행됨");
			i++;
		}while(i < count);
		
		s.close();
	}

}
