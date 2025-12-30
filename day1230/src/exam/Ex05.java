package exam;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("5명의 성적을 차례대로 입력하세요 : ");
		
		
		score[0] = Integer.parseInt(sc.nextLine());
		int max = 0;
		int min = 0;
		int sum = 0;
		
		double avg;
		
		for (int i = 0; i < score.length; i++) {
			score[i] = Integer.parseInt(sc.nextLine());
			if (score[i] > max) {
				max = score[i];
			} 
			
			if (min > score[i]) {
				min = score[i];
			}
			sum += score[i];
		}
		
		avg = (double) sum / score.length;
		System.out.println("5명의 평균점수 : " + avg + "점/ 최고점수 : " + max + "점/ 최소점수 : " + min + "점");	
	}
}

