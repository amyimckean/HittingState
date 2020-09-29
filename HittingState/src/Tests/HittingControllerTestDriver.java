package Tests;

import Main.*;
import org.junit.*;

public class HittingControllerTestDriver {

	@Test
	public void TestOnDeck() {
		HittingController controller = new HittingController();
		controller.WarmingUp();
		Assert.assertEquals("Hitter's current status: On Deck", controller.toString());
	}

	@Test
	public void testBench() {
		HittingController controller = new HittingController();
		Assert.assertEquals("Hitter's current status: Bench", controller.toString());
	}

	@Test
	public void TestAtBat() {
		HittingController controller = new HittingController();
		controller.WarmingUp();
		controller.CallToThePlate();
		Assert.assertEquals("Hitter's current status: At Bat", controller.toString());
	}
	
	@Test
	public void TestSingle() {
		HittingController controller = new HittingController();
		controller.WarmingUp();
		controller.CallToThePlate();
		controller.setBases(1);
		controller.HitTheBall();
		Assert.assertEquals("Hitter's current status: Single", controller.toString());
	}

	@Test
	public void TestDouble() {
		HittingController controller = new HittingController();
		controller.WarmingUp();
		controller.CallToThePlate();
		controller.setBases(2);
		controller.HitTheBall();
		Assert.assertEquals("Hitter's current status: Double", controller.toString());
	}

	@Test
	public void TestTriple() {
		HittingController controller = new HittingController();
		controller.WarmingUp();
		controller.CallToThePlate();
		controller.setBases(3);
		controller.HitTheBall();
		Assert.assertEquals("Hitter's current status: Triple", controller.toString());
	}

	@Test
	public void TestHomerun() {
		HittingController controller = new HittingController();
		controller.WarmingUp();
		controller.CallToThePlate();
		controller.setBases(4);
		controller.HitTheBall();
		Assert.assertEquals("Hitter's current status: Homerun", controller.toString());
	}
}
