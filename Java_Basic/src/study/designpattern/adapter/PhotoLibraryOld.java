package study.designpattern.adapter;

public class PhotoLibraryOld {
	public void printPhoto(String photoName) {
		System.out.println(photoName);
	}
	
	public void printPhotoAll(String[] photoNames) {
		for (String name : photoNames) {
			System.out.println(name);
		}
	}
	
	public void deletePhoto(String photoName) {
		
	}
}
