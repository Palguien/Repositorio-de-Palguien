package notepad;

import java.time.LocalDate;

public class Note {
	//Atributes
	private String textField;
	private LocalDate creationDate;
	//builder
	public Note() {
		setTextField("");
		setCreationDate(LocalDate.now());
	}
	public Note(String textField) {
		setTextField(textField);
		setCreationDate(LocalDate.now());
	}
	//methods
	public void deleteContent() {
		setTextField("");
	}
	public void addContent(String add) {
		setTextField(textField+add);
	}
	public void addContentIni(String add) {
		setTextField(add+textField);
	}
	public void readContent() {
		System.out.println(textField);
	}
	//get y set
	public String getTextField() {
		return textField;
	}

	public void setTextField(String textField) {
		this.textField = textField;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	private void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Note [textField=" + textField + ", creationDate=" + creationDate + "]";
	}
	
}
