package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Robot cc[] = new Robot[5];
		for (int i = 0; i < cc.length; i++) {
			cc[i] = new Robot();
		}
		cc[0].moveTo(150, 800);
		Thread cc1 = new Thread(() -> {
			cc[0].setSpeed(5);

			boolean raceOver = false;
			while (raceOver == false) {
				cc[0].move(new Random().nextInt(50));
				int posY = cc[0].getY();
				if (posY <= 0) {
					System.out.println("Robot number 1 won the race");
					raceOver = true;
				}
			}
		});
		cc[1].moveTo(450, 800);
		Thread cc2 = new Thread(() -> {
			cc[1].setSpeed(5);

			boolean raceOver = false;
			while (raceOver == false) {
				cc[1].move(new Random().nextInt(50));
				int posY = cc[1].getY();
				if (posY <= 0) {
					System.out.println("Robot number 2 won the race");
					raceOver = true;
				}
			}
		});
		cc[2].moveTo(750, 800);
		Thread cc3 = new Thread(() -> {
			cc[2].setSpeed(5);

			boolean raceOver = false;
			while (raceOver == false) {
				cc[2].move(new Random().nextInt(50));
				int posY = cc[2].getY();
				if (posY <= 0) {
					System.out.println("Robot number 3 won the race");
					raceOver = true;
				}
			}
		});
		cc[3].moveTo(1150, 800);
		Thread cc4 = new Thread(() -> {
			cc[3].setSpeed(5);

			boolean raceOver = false;
			while (raceOver == false) {
				cc[3].move(new Random().nextInt(50));
				int posY = cc[3].getY();
				if (posY <= 0) {
					System.out.println("Robot number 4 won the race");
					raceOver = true;
				}
			}
		});
		cc[4].moveTo(1550, 800);
		Thread cc5 = new Thread(() -> {
			cc[4].setSpeed(5);

			boolean raceOver = false;
			while (raceOver == false) {
				cc[4].move(new Random().nextInt(50));
				int posY = cc[4].getY();
				if (posY <= 0) {
					System.out.println("Robot number 5 won the race");
					raceOver = true;
				}
			}
		});

		cc1.start();
		cc2.start();
		cc3.start();
		cc4.start();
		cc5.start();

	}

}
