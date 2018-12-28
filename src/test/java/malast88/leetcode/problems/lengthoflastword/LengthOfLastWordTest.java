package malast88.leetcode.problems.lengthoflastword;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LengthOfLastWordTest {

    @InjectMocks
    private LengthOfLastWord sut;

    private static Stream<Arguments> getXXXArgs() {
        return Stream.of(
                Arguments.of("Hello world", 5),
                Arguments.of("Hello wo   ", 2),
                Arguments.of("       ", 0),
                Arguments.of("", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getXXXArgs")
    public void itShouldGetLengthOfLastWord(String s, int expectedResult) {
        // init

        // test
        int result = sut.lengthOfLastWord(s);

        // verify
        assertEquals(expectedResult, result);
    }
}
