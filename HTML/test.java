package vars

import com.lesfurets.jenkins.unit.BaseRegressionTest

import org.junit.Before
import org.junit.Test
import static org.assertj.core.api.Assertions.assertThat
import java.util.Map


class logTest extends BaseRegressionTest {

  @Override
  @Before
  public void setUp() throws Exception {
    super.setUp();

    callStackPath = "test/vars/callstacks/"

    helper.registerAllowedMethod('ansiColor', [String.class, Closure.class], null)
  }

  @Test
  public void testRedMsg() throws Exception {

    //Load the Test script
    def script = loadScript('vars/log.groovy')

    //Call the script with parameters
    script.printRedMsg("red")

    printCallStack()

    testNonRegression("testRedMsg")
  }

  @Test
  public void testBlueMsg() throws Exception {

	//Load the Test script
	def script = loadScript('vars/log.groovy')

	//Call the script with parameters
	script.printBlueMsg("blue")

	printCallStack()

	testNonRegression("testBlueMsg")
  }

  @Test
  public void testPurpleMsg() throws Exception {

	//Load the Test script
	def script = loadScript('vars/log.groovy')

	//Call the script with parameters
	script.printPurpleMsg("purple")

	printCallStack()

	testNonRegression("testPurpleMsg")
  }

  @Test
  public void testGreenMsg() throws Exception {

	//Load the Test script
	def script = loadScript('vars/log.groovy')

	//Call the script with parameters
	script.printGreenMsg("green")

	printCallStack()

	testNonRegression("testGreenMsg")
  }

  @Test
  public void testCyanMsg() throws Exception {

	//Load the Test script
	def script = loadScript('vars/log.groovy')

	//Call the script with parameters
	script.printCyanMsg("cyan")

	printCallStack()

	testNonRegression("testCyanMsg")
  }
}