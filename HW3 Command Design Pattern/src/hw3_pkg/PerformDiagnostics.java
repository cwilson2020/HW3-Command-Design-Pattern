package hw3_pkg;

public class PerformDiagnostics implements Command{


	RobotType thisRobot;

	public PerformDiagnostics(RobotType lRobot) {
		thisRobot = lRobot;
	}

	@Override
	public void execute() {
		thisRobot.perform_diagnostics();
	}

}