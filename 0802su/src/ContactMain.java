public class ContactMain {

	public static void main(String[] args) {
		/*//인터페이스나 클래스를 상속한 경우에는
		//상위 인터페이스나 클래스 이름으로 변수를 만들고 
		//하위 클래스의 인스턴스를 생성해서 대입합니다.
		ContactDao dao = new ContactDaoImpl();
		Contact contact = new Contact();
		contact.setNum(1);
		contact.setName("파이어");
		contact.setPhone("01011112222");
		contact.setEmail("ffsddd222@naver.com");
		//현재 시간을 저장한 캘린더 생성
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1998);
		cal.set(Calendar.MONTH,7);
		cal.set(Calendar.DAY_OF_MONTH,20);
		Date birthDay = new Date(cal.getTimeInMillis());
		contact.setBirthday(birthDay);
		
		List<Contact> list = dao.allContact("파이어");
		System.out.println(list);
		
		
		
		
		//모든 데이터 불러오기 메소드 호출
		List<Contact> a = dao.allContact();
		//System.out.println(a);
		for(Contact contact : a) {
			System.out.println(contact);
		}
		
		
		
		
		//데이터를 삭제하는 메소드 호출
		boolean a = dao.deleteContact(5);
		if(a == true) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
		
		
		
		//데이터를 수정하는 메소드 호출
		boolean r= dao.updateContact(contact);
		if(r = true) {
			System.out.println("수정 성공");
		} else {
			System.out.println("수정 실패");
		}
		
		
		//데이터를 삽입하는 메소드 호출
		boolean result = dao.insertContact(contact);
		if(result == true) {
			System.out.println("삽입 성공");
		}else {
			System.out.println("삽입 실패");
		}*/
		new ContactView();
		
	}

}
