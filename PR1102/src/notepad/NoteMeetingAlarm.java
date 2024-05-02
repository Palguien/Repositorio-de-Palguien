package notepad;

import java.time.LocalDate;

public class NoteMeetingAlarm extends MeetingNote{
	private int remainingDays;
	
	public NoteMeetingAlarm(LocalDate meetingDate) {
		super(meetingDate);
		// TODO Auto-generated constructor stub
	}

	public NoteMeetingAlarm(String textField) {
		super(textField);
		// TODO Auto-generated constructor stub
	}

	public int getRemainingDays() {
		return remainingDays;
	}

	public void setRemainingDays() {
		this.remainingDays = getMeetingDate()-LocalDate.now();
	}

}
