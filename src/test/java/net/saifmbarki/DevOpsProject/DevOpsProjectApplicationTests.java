package net.saifmbarki.DevOpsProject;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class DevOpsProjectApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	DevOpsProjectApplication dvApplication;
	
    @Test
    public void calcTest() {
        Integer expected = 12; // Expected result
        Integer actual = dvApplication.calc(); // Call the method under test
        assertEquals(expected, actual); // Assert that the expected result matches the actual result
    }

}
