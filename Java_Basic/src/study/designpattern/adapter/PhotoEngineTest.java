package study.designpattern.adapter;

public class PhotoEngineTest {

	public static void main(String[] args) {
		String[] photoList = {"1.jpg", "2.jpg", "3.jpg"};
		
		PhotoLibraryOld oldLib = new PhotoLibraryOld();
		
		oldLib.printPhotoAll(photoList);
		
		/*
		 * �̷��� �ڵ尡 �ۼ��Ǿ� �ִٰ� ����.
		 * ���ο� newLib�� ������ �ڵ带 �����ϰ��� �� ��,
		 * printPhotoAll() �޼ҵ�� �ش� Ŭ������ �������� �����Ƿ�
		 * ���� �ڵ�� �⺻ ����(�˰���) ������ �Ұ����ϴ�.
		 * 
		 * �� �� ������ �� ���� �ʰ� �����ϱ� ���ؼ��� Adapter Pattern�� �̿��ؾ� �Ѵ�.
		 * ���� �ҽ� �ڵ忡�� ����ϰ� �ִ� Ȥ�� ����ϰ��� �ϴ� �޼ҵ带 �ֻ��� interface�� �����صΰ�
		 * �ش� interface�� �����ϴ� adapter class�� ����� ����ϸ� �ȴ�.
		 */
		PhotoEngine newLib = new NewLibraryAdapter();
		
		newLib.printPhotoAll(photoList);
		
		
		/*
		 * �̷��� interface�� ����ϵ��� adapter�� ����� Ȯ�强�� ����������.
		 */
		PhotoEngine oldLib = new OldLibraryAdapter();
		
		oldLib.printPhotoAll(photoList);
		
		/*
		 * �ᱹ �ڵ带 ������ �� ������ �ڵ� ������ �������� �ʰ� ���ο� Ŭ���� 
		 * ��, ���� �ڵ忡�� ����ϴ� �޼ҵ�� ���ο� ���̺귯�� �޼ҵ带 �����ϴ� 
		 * adapter Ŭ������ �ۼ��ϸ� �ȴ�. 
		 */
	}

}
