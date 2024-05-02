package exceptionExample;

@SuppressWarnings("serial")
public class IntervalException extends Exception{
	public IntervalException() {
		super();
	}
	public IntervalException(String message) {
		super(message);
	}
}
