package Main;

public interface HittingState {
	void WarmingUp();
	void HitTheBall();
	void MissedTheBall();
	void CompletedAtBat();
	void CallToThePlate();
}
