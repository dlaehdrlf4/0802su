import java.util.List;

public interface ContactDao {
	//데이터를 삽입하는 메소드
	public boolean insertContact (Contact contact);
	
	// 데이터를 수정하는 메소드
	public boolean updateContact (Contact contact);
	
	// 데이터를 삭제하는 메소드
	public boolean deleteContact (int num); // 기본키로 삭제하는것을 한다 1번 삭제 2번 삭제 이런식을
	
	//데이터 전체를 읽어오는 메소드
	//데이터가 0개 이상이므로 List로 리턴하고 읽어올 컬럼들을 저장할 DTO클래스나 MAP으로 제너릭을 적용하면 됩니다.
	public List<Contact> allContact(); // 다 읽어야하니까 매개변수는 안넣어도된다.
	
	
	//이름을 가지고 조회하는 메소드
	public List<Contact> allContact(String name); 
	
	
	
}
  