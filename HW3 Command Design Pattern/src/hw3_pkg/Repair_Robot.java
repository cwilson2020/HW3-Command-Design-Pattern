package hw3_pkg;

import javax.print.DocFlavor.STRING;

public class Repair_Robot implements RobotType{

	@Override
	public void exit_sleep_mode() {
		System.out.println("Repair Robot has been turned on");
		
	}

	@Override
	public void enter_sleep_mode() {
		System.out.println("Repair Robot has been sent to sleep mode");
		
	}

	@Override
	public void execute_main_protocol() {
		System.out.println("Repair Robot has begun repairing objects ");
		
	}

	@Override
	public void perform_diagnostics() {
		System.out.println("Repair Robot has begun self-diagnostics ");
		
	}

	@Override
	public void special_task() {
			System.out.println("Repair Robot has started special tasks of repairing itself... " );
		
	}

	
	
}
