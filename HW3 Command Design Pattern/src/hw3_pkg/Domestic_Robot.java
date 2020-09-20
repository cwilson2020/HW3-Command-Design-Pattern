package hw3_pkg;

import javax.print.DocFlavor.STRING;

public class Domestic_Robot implements RobotType{

	@Override
	public void exit_sleep_mode() {
		System.out.println("Domestic Robot has been turned on");
		
	}

	@Override
	public void enter_sleep_mode() {
		System.out.println("Domestic Robot has been sent to sleep mode");
		
	}

	@Override
	public void execute_main_protocol() {
		System.out.println("Domestic Robot has begun cleaning ");
		
	}

	@Override
	public void perform_diagnostics() {
		System.out.println("Domestic Robot has begun self-diagnostics ");
		
	}

	@Override
	public void special_task() {
			System.out.println("Domestic Robot has started special task of deep cleaning and decluttering..." );
		
	}

	
	
}
