package day02;
<<<<<<< HEAD

public class EX07 {public static void main(String[] args) {
	String name = "김말이" , a = "20" , b = "173,3" , c = "120" , d = "B";
	System.out.println("이름\t" + name);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
}
=======
//sc 컨트롤 엔터 임폴트값 추가
//자료형
import java.util.Scanner;

public class EX07 {public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	String name;
	System.out.println("이름 입력 :");
	name = input.next();
	
	System.out.print("수 입력 :");
	num = input.nextInt(); //정수만 입력받겠다.넥스트인트
	
	
	System.out.println("이름  :"+name);
	System.out.println("입력 수 :"+num);
	//import 특정기능을 불러와서 사용한다.
	
	double dou;
	System.out.println("실수 입력");
	dou = input.nextDouble();
	System.out.println("실수 :"+dou);
	}
>>>>>>> e6cf3e8d269720b06c2f76c21edbc1fce0a1d02c

}
