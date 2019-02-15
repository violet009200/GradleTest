import static org.junit.Assert.*;

import org.junit.Test;

public class MainAppTest {

	@Test
	public void test() {
		MainApp app = new MainApp();
		assertNotNull("Success",app.sayHello());
	}

}
