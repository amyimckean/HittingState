package Main;

public class OnDeckState implements HittingState {
	HittingController controller;
	
	public OnDeckState(HittingController control) {
		controller = control;
	}
	
	public void WarmingUp() {
		System.out.println("The hitter is currently warming up.");	
	}
	
	public void CallToThePlate() {
		System.out.println("The hitter is being called to the plate");	
		controller.setState(controller.getAtBatState());
	}

	public void HitTheBall() {
		System.out.println("You cant hit the ball from the on-deck circle");	
	}

	public void MissedTheBall() {
		System.out.println("You cant miss the ball from the on-deck circle");	
	}

	public void CompletedAtBat() {
		System.out.println("The at bat hasn't started.");
	}

	public String toString() {
		return HittingStateEnum.OnDeck.toString();
	}
}
