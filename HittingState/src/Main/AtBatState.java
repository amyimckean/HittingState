package Main;

public class AtBatState implements HittingState {
	HittingController controller;
	
	public AtBatState(HittingController control) {
		controller = control;
	}
	
	public void WarmingUp() {
		System.out.println("The hitter is warm and at the plate");	
	}
	
	public void CallToThePlate() {
		System.out.println("The hitter is already at the plate");	
	}

	public void HitTheBall() {
		switch(controller.getBases()) {
			case 1: 
				controller.setState(controller.getSingleState());
				break;
			case 2: 
				controller.setState(controller.getDoubleState());
				break;
			case 3: 
				controller.setState(controller.getTripleState());
				break;
			case 4: 
				controller.setState(controller.getHomeState());
				break;
			default: System.out.println("Please set the number of bases to something 1-4.");
		}
	}

	public void MissedTheBall() {
		controller.setState(controller.getBenchState());
	}

	public void CompletedAtBat() {
		System.out.println("The at bat is currently occurring.");
	}

	public String toString() {
		return HittingStateEnum.AtBat.toString();
	}
}
