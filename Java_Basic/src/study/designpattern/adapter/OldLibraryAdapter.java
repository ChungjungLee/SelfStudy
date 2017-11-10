package study.designpattern.adapter;

public class OldLibraryAdapter implements PhotoEngine {

	PhotoLibraryOld oldLib = new PhotoLibraryOld();
	
	@Override
	public void printPhotoAll(String[] photoNames) {
		oldLib.printPhotoAll(photoNames);
	}

	@Override
	public void printPhoto(String photoName) {
		
	}

	@Override
	public void deletePhoto(String photoName) {
		
	}

}
