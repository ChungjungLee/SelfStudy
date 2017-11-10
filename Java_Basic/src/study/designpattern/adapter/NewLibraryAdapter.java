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

	/* �� �ҽ� �ڵ忡�� ����ϰ� �ִ� �޼ҵ� signature�� �״�� ���� �������.
	 * ���� ������ ���ο� newLibrary�� �޼ҵ带 �̿��Ͽ� ����Ѵ�.
	 * ��, ���� �ڵ��� ������ �ٲ� �ʿ� ���� �ȴ�.
	 * */
	@Override
	public void printPhotoAll(String[] photoNames) {
		for (String photoName : photoNames) {
			newLib.printPhoto(photoName);
		}
	}

}
