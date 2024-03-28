package MavenJen.JenkinsPipeline;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorAppTest {
@Test
@Parameters({"a","b"})
public void testAdd() {
	CalculatorApp app=new CalculatorApp();
	int actual=app.addMethod(19, 7);
	int expected=26;
	Assert.assertEquals(actual,expected);
}
@Test
public void testSub() {
	CalculatorApp app=new CalculatorApp();
	int actual=app.subMethod(19, 7);
	int expected=12;
	Assert.assertEquals(actual,expected);
}
}
