package ua.kas.lectureTask;

import java.util.ArrayList;

public class ClassRoom {

	private ArrayList<Pupil> list = new ArrayList<Pupil>();

	ClassRoom(ArrayList<Pupil> list) {
		this.list = list;
		howTime();
	}

	private void howTime() {
		for (int i = 0; i < list.size(); i++) {
			Pupil temporary = list.get(i);
			temporary.study();
			temporary.read();
			temporary.write();
			temporary.relax();
			System.out.println("-----");
		}
	}
}
