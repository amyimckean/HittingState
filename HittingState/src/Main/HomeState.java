package Main;

public class HomeState implements HittingState {
	HittingController controller;
	
	public HomeState(HittingController control) {
		controller = control;
	}
	
	public void WarmingUp() {
		System.out.println("The hitter is on base and doesn't need to warm-up");	
	}
	
	public void CallToThePlate() {
		System.out.println("The hitter is past the plate");	
	}
	
	public void HitTheBall() {
		System.out.println("The hitter has already hit the ball");	
	}

	public void MissedTheBall() {
		System.out.println("The hitter has already hit the ball");	
	}

	public void CompletedAtBat() {
		System.out.println("Hitter has completed their at-bat and hit a homerun!");
		controller.setState(controller.getBenchState());
	}

	public String toString() {
		return HittingStateEnum.Homerun.toString();
	}
}
