package day02;

import java.util.Scanner;

public class EX10 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String name;
	int a = 0, b = 0 , c = 0, n = 0;
	
	System.out.print("당신의 이름은 무엇입니까?");
	name = input.next();
	System.out.print(name+"님의 국어 점수:");
	a = input.nextInt();
	System.out.print(name+"님의 영어 점수");
	b = input.nextInt();
	System.out.print(name+"님의 수학 점수");
	c = input.nextInt();
	n = a+b+c;
	System.out.println("합계 :"+n);
	
	
	System.out.println("==================================");
	System.out.println("이름 :"+name);
	System.out.println("==================================");
	System.out.println("국어 :"+a);
	System.out.println("수학 :"+c);
	System.out.println("영어 :"+b);
	System.out.println("==================================");
	System.out.println("합계 :"+n);
	System.out.println("==================================");
	
}
}
