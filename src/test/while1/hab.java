package test.while1;

import java.util.Scanner;

public class hab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		while (true) {
			
			
		System.out.print("수를 입력하세요 : ");
		int num = s.nextInt();
		int sum = 0;
			
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
			
		System.out.printf("1부터 %d까지의 합은 %d입니다.\n", num, sum);
		System.out.print("계속하시겠습니까?(y/n): ");
		String end = s2.nextLine();
		if(end.equals("n"))
			break;
		}
			
		s.close();
		s2.close();	
		
		
	}

}
