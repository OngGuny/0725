
import java.util.*;
public class HelloNeo {
	public static void main(String[] args)  
	{

		System.out.println("***********");
		System.out.println("Hello, Neo");
		System.out.println("***********");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은? : ");
		String name  = sc.nextLine();
		

		System.out.println("귀하의 이름은 " + name + "이군요");
	}
}
// 1번째 줄에는 import java.lang.*; 이 숨겨져있다.생략가능. 기본적으로 갖고옴   *:everything    (a).(b) : a 소속 중 b 
// class 첫글자는 대문자로 HelloNeo  
// 자바의 표준출력 : 모니터에 출력 print 
/* api 활용 잘하기. 문법읽는법 
 * 모든것은 입력, 연산, 출력 .
 * 스캐너 는 입력하는걸 받아들이는거 
 */