package test.array;

import java.util.Scanner;

public class arraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] subjects = {"국어", "영어", "수학", "화학", "생명", "역사"};
		int[] scores = new int[subjects.length];
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < subjects.length; i++) {
			System.out.print(subjects[i] + ":");
			scores[i] = s.nextInt();
			sum += scores[i];
		}
		
		avg = sum / (double)subjects.length;
		
		for (int i = 0; i < subjects.length; i++) {
			System.out.printf("%s: %d점\t", subjects[i], scores[i]);
		}
		System.out.println();
		System.out.printf("합계: %d점\t 평균: %.2f점", sum, avg);
		
		
		
		s.close();
		
		
		
	}

}
