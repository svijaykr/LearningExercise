package in.nondescript.learningexercise;

import java.util.UUID;

public class Crime {
	private UUID mId;
	private String title;
	
	public Crime() {
		mId = UUID.randomUUID();
	}
}
