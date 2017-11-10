package study.designpattern.adapter;

public class PhotoEngineTest {

	public static void main(String[] args) {
		String[] photoList = {"1.jpg", "2.jpg", "3.jpg"};
		
		PhotoLibraryOld oldLib = new PhotoLibraryOld();
		
		oldLib.printPhotoAll(photoList);
		
		/*
		 * 이렇게 코드가 작성되어 있다고 하자.
		 * 새로운 newLib를 가지고 코드를 수정하고자 할 때,
		 * printPhotoAll() 메소드는 해당 클래스에 존재하지 않으므로
		 * 위의 코드는 기본 로직(알고리즘) 수정이 불가피하다.
		 * 
		 * 이 때 로직은 손 대지 않고 변경하기 위해서는 Adapter Pattern을 이용해야 한다.
		 * 현재 소스 코드에서 사용하고 있는 혹은 사용하고자 하는 메소드를 최상위 interface에 선언해두고
		 * 해당 interface를 구현하는 adapter class를 만들어 사용하면 된다.
		 */
		PhotoEngine newLib = new NewLibraryAdapter();
		
		newLib.printPhotoAll(photoList);
		
		
		/*
		 * 이렇게 interface를 상속하도록 adapter를 만들면 확장성이 용이해진다.
		 */
		PhotoEngine oldLib = new OldLibraryAdapter();
		
		oldLib.printPhotoAll(photoList);
		
		/*
		 * 결국 코드를 수정할 때 기존의 코드 로직은 변경하지 않고 새로운 클래스 
		 * 즉, 현재 코드에서 사용하는 메소드와 새로운 라이브러리 메소드를 연결하는 
		 * adapter 클래스만 작성하면 된다. 
		 */
	}

}
