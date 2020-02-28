package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		
	Robot r1 = new Robot(100,800);
	Robot r2 = new Robot(300,800);
	Robot r3 = new Robot(500,800);
	Robot r4 = new Robot(700,800);
	Robot r5 = new Robot(900,800);
	
	Thread rr1 = new Thread(()->{
		r1.setSpeed(10);
		for(int i = 0; i<360; i++) {
		r1.move(5);
		r1.turn(1);
	}});
	Thread rr2 = new Thread(()-> {
		r2.setSpeed(10);
		for(int i = 0; i<360; i++) {
		r2.move(5);
		r2.turn(1);
	}});
	Thread rr3 = new Thread(()-> {
		r3.setSpeed(10);
		for(int i = 0; i<360; i++) {
		r3.move(5);
		r3.turn(1);
	}});
	Thread rr4 = new Thread(()-> {
		r4.setSpeed(10);
		for(int i = 0; i<360; i++) {
		r4.move(5);
		r4.turn(1);
	}});
	Thread rr5 = new Thread (()->{
		r5.setSpeed(10);
		for(int i = 0; i<360; i++) {
		r5.move(i);
		r5.turn(i);
		}});
	

		rr1.start();
		rr2.start();
		rr3.start();
		rr4.start();
		rr5.start();
	
	}
	
}

