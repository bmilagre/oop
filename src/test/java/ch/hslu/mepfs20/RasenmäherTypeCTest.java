package ch.hslu.mepfs20;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class RasenmäherTypeCTest {

    @Test
    void checkIfInvalidExceptionIsThrownWhenNotCompatibleGeneration() {
        assertThatThrownBy(() -> {
            new RasenmäherTypeC(new Antrieb());
        }).isInstanceOf(IllegalArgumentException.class);
    }
}