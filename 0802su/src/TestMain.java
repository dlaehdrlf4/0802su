
public class TestMain {

	public static void main(String[] args) {
		
		//생성자를 이용해서 객체를 생성
		//T obj1 = new T();
		//T obj2 = new T();
		
		
		//싱글톤 패턴을 적용할 클래스의 객체 만들기
		T obj1 = T.getInstance(); // 싱글톤으로 해서 해시코드가 동일 즉 하나가지고 계속 쓰는 것이다.
		T obj2 = T.getInstance();
		
		
		//해시코드출력
		System.out.println(System.identityHashCode(obj1));//해시코드가 저장공간
		System.out.println(System.identityHashCode(obj2));
		
		int a = 10; //상수는 한번 만들어지면 안없어지고 계속 재사용
		int b = 10;

		System.out.println(System.identityHashCode(a));//해시코드가 저장공간
		System.out.println(System.identityHashCode(b));
	}

}
