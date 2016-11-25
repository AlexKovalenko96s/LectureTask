package ua.kas.lectureTask;

public class BadPupil extends Pupil {

	@Override
	void study() {
		System.out.println("study - no");
	}

	@Override
	void read() {
		System.out.println("read - no");
	}

	@Override
	void write() {
		System.out.println("write - no");
	}

	@Override
	void relax() {
		System.out.println("relax - more");
	}

}
