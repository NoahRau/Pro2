package Lektion25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ThrowingConsumerTest {
    @Test
    public void testThrowingConsumer() {
        ThrowingConsumer<String, CustomException> consumer = s -> {
            if (s == null) {
                throw new CustomException("Input cannot be null");
            }
            System.out.println(s);
        };

        // Test with null input
        assertThrows(CustomException.class, () -> consumer.accept(null));
    }

    private static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }
}
