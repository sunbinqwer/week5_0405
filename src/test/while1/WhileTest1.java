package test.while1;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  s = new Scanner(System.in);
		while (true) {
			System.out.print("성명 입력 : ");
			String name = s.nextLine();
			System.out.println(name + "님 환영합니다.");
			System.out.println("계속하시겠습니까?(y/n)");
			String msg = s.nextLine();
			if(msg.equals("n"))
				break;
					
		
		}
		
		
		s.close();
		
		
		

	}

}
