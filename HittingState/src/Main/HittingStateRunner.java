package Main;

public class HittingStateRunner {
	
	public static void main(String[] args) {
		HittingController controller = new HittingController();
		
		System.out.println("Hitter #1");
		//Didn't set the number of balls
		controller.WarmingUp();
		controller.CallToThePlate();
		controller.HitTheBall();
		controller.reset();
		System.out.println();
		
		System.out.println("Hitter #2");
		//Hit a triple
		controller.WarmingUp();
		controller.CallToThePlate();
		controller.setBases(3);
		controller.HitTheBall();
		controller.CompletedAtBat();
		System.out.println();
		
		System.out.println("Hitter #3");
		//Miss the ball
		controller.WarmingUp();
		controller.CallToThePlate();
		controller.MissedTheBall();
		System.out.println();
		
		System.out.println("Hitter #4");
		//Miss the ball
		controller.setBases(4);
		controller.WarmingUp();
		controller.CallToThePlate();
		controller.HitTheBall();
		controller.CompletedAtBat();
		System.out.println();
		
	}
}
