package service;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class AlticciSequenceServiceTest {

    @Inject
    AlticciSequenceService alticciSequenceService;


    @Test
    public void testInitialSequenceValues() {
        assertEquals(0L, alticciSequenceService.getResultByIndex(0L));
        assertEquals(1L, alticciSequenceService.getResultByIndex(1L));
        assertEquals(1L, alticciSequenceService.getResultByIndex(2L));
    }

    @Test
    public void testRecursiveValues() {
        assertEquals(9L, alticciSequenceService.getResultByIndex(10L));
    }
}
