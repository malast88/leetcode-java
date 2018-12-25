package malast88.leetcode.problems.validparentheses;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ValidParenthesesTest {

    @InjectMocks
    private ValidParentheses sut;

    private static Stream<Arguments> getTwoSumArgs() {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false),
                Arguments.of("([)]", false),
                Arguments.of("{[]}", true),
                Arguments.of("", true),
                Arguments.of("())", false),
                Arguments.of("[}", false),
                Arguments.of("{])", false)
        );
    }

    @ParameterizedTest
    @MethodSource("getTwoSumArgs")
    public void itShouldAnswerIfItIsValid(String s, boolean expectedResult) {
        // init

        // test
        boolean result = sut.isValid(s);

        // verify
        assertEquals(expectedResult, result);
    }
}
