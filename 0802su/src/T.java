
public class T {
	// 외부에서 객체를 생성하지 못하도록 생성자를 private으로 변경
	private T() {}
	
	//1개만 만들어서 리턴해주기 위한 static 변수 선언
	private static T obj;
	
	//객체가 없으면 만들어서 리턴하고 있으면 그냥 리턴하는 static 메소드를 생성
	public static T getInstance() {
		if(obj == null) {
			obj = new T();
		}
		return obj;
	}
}
