package Main;

public enum HittingStateEnum {
	AtBat("At Bat"),
	Bench("Bench"),
	OnDeck("On Deck"),
	Single("Single"),
	Double("Double"),
	Triple("Triple"),
	Homerun("Homerun");
	
    public final String label;
	 
    private HittingStateEnum(String label) {
        this.label = label;
    }
    
    public String toString() {
    	return this.label;
    }
}
