package Main;

public class HittingController {
	HittingState currentState;
	
	HittingState onDeckState;
	HittingState atBatState;
	HittingState singleState;
	HittingState doubleState;
	HittingState tripleState;
	HittingState homeState;
	HittingState benchState;
	
	int bases = 0;
	
	public HittingController() {
		onDeckState = new OnDeckState(this);
		atBatState = new AtBatState(this);
		singleState = new SingleState(this);
		doubleState = new DoubleState(this);
		tripleState = new TripleState(this);
		homeState = new HomeState(this);
		benchState =  new BenchState(this);
		
		reset();
	}
	
	public void reset() {
		currentState = benchState;
	}

	public void WarmingUp(){
		currentState.WarmingUp();
	}
	
	public void HitTheBall(){
		currentState.HitTheBall();
	}
	
	public void MissedTheBall(){
		currentState.MissedTheBall();
	}
	
	public void CompletedAtBat(){
		currentState.CompletedAtBat();
	}
	
	public void CallToThePlate(){
		currentState.CallToThePlate();
	}
	
	public int getBases() {
		return bases;
	}

	public void setBases(int bases) {
		this.bases = bases;
	}
	
    public HittingState getState() {
        return currentState;
    }
    
	public void setState(HittingState state) {
		currentState = state;
	}
	
	public HittingState getOnDeckState() {
		return onDeckState;
	}
	
	public HittingState getAtBatState() {
		return atBatState;
	}
	
	public HittingState getSingleState() {
		return singleState;
	}
	
	public HittingState getDoubleState() {
		return doubleState;
	}
	
	public HittingState getTripleState() {
		return tripleState;
	}
	
	public HittingState getHomeState() {
		return homeState;
	}
	
	public HittingState getBenchState() {
		return benchState;
	}
	
	public String toString() {
		String result = String.format("Hitter's current status: %1$s", currentState.toString());
		System.out.println(result);
		return result;
	}
}
