package Main;

public class BenchState implements HittingState {
	HittingController controller;
	
	public BenchState(HittingController control) {
		controller = control;
	}
	
	public void WarmingUp() {
		controller.setState(controller.getOnDeckState());
		System.out.println("Hitter is getting up to warm-up");	
	}
	
	public void CallToThePlate() {
		System.out.println("The hitter is waiting to be called to warm-up");	
	}
	
	public void HitTheBall() {
		System.out.println("You cant hit the ball from the bench");	
	}

	public void MissedTheBall() {
		System.out.println("You cant miss the ball from the bench");	
	}

	public void CompletedAtBat() {
		System.out.println("The at bat hasn't started.");
	}

	public String toString() {
		return HittingStateEnum.Bench.toString();
	}
}
