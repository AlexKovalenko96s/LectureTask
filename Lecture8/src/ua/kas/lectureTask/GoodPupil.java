package ua.kas.lectureTask;

public class GoodPupil extends Pupil {

	@Override
	void study() {
		System.out.println("study - ok");
	}

	@Override
	void read() {
		System.out.println("read - some");
	}

	@Override
	void write() {
		System.out.println("write - some");
	}

	@Override
	void relax() {
		System.out.println("relax - a lot");
	}

}
