package hw3_pkg;

public class TurnRobotOff implements Command {
	
	RobotType thisRobot;

	public TurnRobotOff(RobotType lRobot) {
		thisRobot = lRobot;
	}
	
	@Override
	public void execute() {
		thisRobot.enter_sleep_mode();
		
	}

}
