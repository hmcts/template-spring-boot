package uk.gov.hmcts.${{ values.product}}.${{ values.component | replace("-", "") }};

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

// TODO Delete this when you create your first test
public class DemoUnitTest {

    @Test
    public void exampleOfTest() {
        assertTrue(System.currentTimeMillis() > 0, "Example of Unit Test");
    }
}
