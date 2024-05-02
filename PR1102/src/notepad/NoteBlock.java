package notepad;

import java.time.LocalDate;

public class NoteBlock {
	//atributes
	private final int MAX=5;
	private Note[] noteblock=new Note[MAX];
	//builder
	public NoteBlock() {
		super();
	}
	public NoteBlock(Note[] noteblock) {
		setNoteblock(noteblock);
	}
	//methods
	public void addNote(Note nota) throws MaxCapacityException {
		if(getNotasNumber()<MAX) {
			for (int i = 0; i < noteblock.length; i++) {
				if(noteblock[i]==null) {
					noteblock[i]=nota;
					break;
				}
			}
		}else {
			throw new MaxCapacityException();
		}
	}
	
	private int getNotasNumber() {
		int total=0;
		for (int i = 0; i < noteblock.length; i++) {
			if(noteblock[i]!=null) {
				total++;
			}
		}
		return total;
	}
	public void showNotes() {
		for (int i = 0; i < noteblock.length; i++) {
			if(noteblock[i]!=null) {
				noteblock[i].readContent();
			}
		}
	}
	public void showNotesDate(LocalDate fecha) {
		for (int i = 0; i < noteblock.length; i++) {
			if(noteblock[i]!=null && (noteblock[i]).getMeetingDate() ) {
				noteblock[i].readContent();
			}
		}
	}
	//get y set
	public Note[] getNoteblock() {
		return noteblock;
	}

	public void setNoteblock(Note[] noteblock) {
		this.noteblock = noteblock;
	}
}
