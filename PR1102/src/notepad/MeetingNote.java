package notepad;

import java.time.LocalDate;

public class MeetingNote extends Note{
	//atributes
	private LocalDate meetingDate;
	//builders
	public MeetingNote(LocalDate meetingDate) {
		super();
		setMeetingDate(meetingDate);
	}

	public MeetingNote(String textField) {
		super(textField);
		setMeetingDate(meetingDate);
	}
	//get y set
	public LocalDate getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(LocalDate meetingDate) {
		this.meetingDate = meetingDate;
	}
	
}
