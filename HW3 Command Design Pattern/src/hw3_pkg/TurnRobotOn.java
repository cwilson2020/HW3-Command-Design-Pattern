package hw3_pkg;

public class TurnRobotOn implements Command {
	
	RobotType thisRobot;

	public TurnRobotOn(RobotType lRobot) {
		thisRobot = lRobot;
	}
	
	@Override
	public void execute() {
		thisRobot.exit_sleep_mode();
		
	}

}
