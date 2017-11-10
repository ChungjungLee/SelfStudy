package study.designpattern.adapter;

public class NewLibraryAdapter implements PhotoEngine {
	PhotoLibraryNew newLib = new PhotoLibraryNew();
	
	@Override
	public void printPhoto(String photoName) {
		System.out.println(photoName);
	}

	@Override
	public void deletePhoto(String photoName) {
		
	}

	/* 원 소스 코드에서 사용하고 있는 메소드 signature를 그대로 따라 만들었다.
	 * 동작 내용은 새로운 newLibrary의 메소드를 이용하여 출력한다.
	 * 즉, 기존 코드의 로직을 바꿀 필요 없게 된다.
	 * */
	@Override
	public void printPhotoAll(String[] photoNames) {
		for (String photoName : photoNames) {
			newLib.printPhoto(photoName);
		}
	}

}
