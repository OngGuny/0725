import java.util.*;

public class UserInfo2 {
	public static void main(String[] args) {				//string 문자열 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("귀하의 이름은? :");
		String name = sc.nextLine();
		
		
		System.out.print("귀하의 나이는? :");
		int age = sc.nextInt();
		sc.nextLine();		//공백을 넣어서 버퍼(엔터치는거)를 날려버림 
		
		System.out.print("귀하의 신장은? : ");
		double height = sc.nextDouble();
		
		// 이름 받아서 네임에 저장   나이 받아서 age에 저장  전화번호 받아서 tel에 저장
		System.out.println("이름 : "+ name +", 나이 :" +age+ ", 키 :"+height );
		
	}
}
/*next는 공백이 들어가면 안됨 
 * nextLine은 공백은 되는데 엔터입력하는것까지 입력변수에 포함이 되서 오류발생 
 */
