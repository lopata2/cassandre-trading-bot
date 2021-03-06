package tech.cassandre.trading.strategy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.awaitility.pollinterval.FibonacciPollInterval.fibonacci;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Simple strategy test.
 */
@SpringBootTest
@DisplayName("Simple strategy test")
public class SimpleCassandreStrategyTest {

	/** How much we should wait for tests to last. */
	protected static final long MAXIMUM_RESPONSE_TIME_IN_SECONDS = 60;

	/** Dumb strategy. */
	@Autowired
	SimpleCassandreStrategy strategy;

	/**
	 * Check data reception
	 */
	@Test
	@DisplayName("Check data reception")
	public void receivedData() {

	}

}
