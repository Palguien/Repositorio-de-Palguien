package exceptionExample;

import dialogs.EasyDialogs;

public class ExceptionTryIntervalException {

	public static void main(String[] args) throws IntervalException {
		int mark;
		try {
			mark=askMark();
			EasyDialogs.infoMessage("Nota: "+mark);
		}catch(IntervalException e) {
			EasyDialogs.showError(e.getMessage());
		}
	}
	/**
	 * Pide nota
	 * @throws IntervalException
	 */
	public static int askMark() throws IntervalException {
		int mark=EasyDialogs.askIntDialog("Give me a mark");
		if(mark<0||mark>10) {
			throw new IntervalException("Out of range of the interval");
		}
		return mark;
	}

}
