package hw3_pkg;

public class ExecuteMainProtocol  implements Command{


	RobotType thisRobot;

	public ExecuteMainProtocol(RobotType lRobot) {
		thisRobot = lRobot;
	}

	@Override
	public void execute() {
		thisRobot.execute_main_protocol();
	}

}
