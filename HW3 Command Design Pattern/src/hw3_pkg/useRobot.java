package hw3_pkg;

import java.util.Scanner;

public class useRobot {

	public static void main(String[] args) {


		System.out.println("Choose a Type of Robot:");
		System.out.println("1) Domestic Robot");
		System.out.println("2) Repair Robot");

		Scanner s = new Scanner(System.in);
		int selection =s.nextInt();

		RobotType robot = null;

		switch (selection) {

		case 1: robot = new Domestic_Robot();
		break;

		case 2: robot = new Repair_Robot();
		break;

		default: System.out.println("Selection not Valid defaulting to: Repair Robot");
		}// end switch


		System.out.println("Choose an action");
		System.out.println("1) Enter Sleep Mode ");
		System.out.println("2) Wake Robot Up");
		System.out.println("3) Perform usual Duties");
		System.out.println("4) Perform Self Diagnostics");
		System.out.println("5) Perform Special Task"  );

		Scanner a = new Scanner(System.in);
		int action =a.nextInt();


		switch (action) {

		case 1: TurnRobotOff off = new TurnRobotOff(robot);
		InvokerProtocol ivp1 = new  InvokerProtocol(off);
		ivp1.startInvoker();
		break;
		case 2:TurnRobotOn on = new TurnRobotOn(robot);
		InvokerProtocol ivp2 = new  InvokerProtocol(on);
		ivp2.startInvoker();
		break;
		case 3:SpecialTask st = new SpecialTask(robot);
		InvokerProtocol ivp3 = new  InvokerProtocol(st);
		ivp3.startInvoker();
		break;
		case 4:ExecuteMainProtocol mprotocol = new ExecuteMainProtocol(robot);
		InvokerProtocol ivp4 = new  InvokerProtocol(mprotocol);
		ivp4.startInvoker();
		break;
		case 5:PerformDiagnostics sd = new PerformDiagnostics(robot);
		InvokerProtocol ivp5 = new  InvokerProtocol(sd);
		ivp5.startInvoker();
		break;
		default: System.out.println("System Incorrect Selection");
		break;
		}//end switch


	}// end main

}// end class
