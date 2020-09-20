package hw3_pkg;

public class InvokerProtocol {
	Command thisCommand;

	public InvokerProtocol (Command lCommand) {

		thisCommand = lCommand;
	}

	public void startInvoker() {
		thisCommand.execute();
	}


}
