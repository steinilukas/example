import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BugTests {
	@Test
	public void testMinimum1() {
		// actual minimum: 1
		int[] a = {1, 2, 3, 4, 5, 6};

		assertEquals(Bug.minimum(a), 1);
	}

	@Test
	public void testMinimum2() {
		// Expect IllegalArgumentException if called with null
		assertThrows(IllegalArgumentException.class, () -> Bug.minimum(null));

		// Expect IllegalArgumentException if called with empty array
		assertThrows(IllegalArgumentException.class, () -> Bug.minimum(new int[0]));
	}
}