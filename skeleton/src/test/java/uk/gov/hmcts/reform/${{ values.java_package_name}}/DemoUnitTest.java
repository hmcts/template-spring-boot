package uk.gov.hmcts.reform.${{ values.java_package_name }};

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DemoUnitTest {

    @Test
    public void exampleOfTest() {
        assertTrue(System.currentTimeMillis() > 0, "Example of Unit Test");
    }
}
