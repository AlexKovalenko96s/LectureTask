package ua.kas.lectureTask;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ExcelentPupil exPupil = new ExcelentPupil();
		GoodPupil goPupil = new GoodPupil();
		BadPupil bPupil = new BadPupil();

		ArrayList<Pupil> list = new ArrayList<Pupil>();
		list.add(exPupil);
		list.add(goPupil);
		list.add(bPupil);
		list.add(goPupil);
		@SuppressWarnings("unused")
		ClassRoom classRoom = new ClassRoom(list);
	}

}
