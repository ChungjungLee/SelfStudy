package study.designpattern.adapter;

public interface PhotoEngine {
	void printPhotoAll(String[] photoNames);
	void printPhoto(String photoName);
	void deletePhoto(String photoName);
}
