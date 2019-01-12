package malast88.leetcode.problems.validpalindrome;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ValidPalindromeTest {

    @InjectMocks
    private ValidPalindrome sut;

    private static Stream<Arguments> getIsPalindromeArgs() {
        return Stream.of(
                Arguments.of("", true),
                Arguments.of("::", true),
                Arguments.of(":::b::", true),
                Arguments.of(":::bab::", true),
                Arguments.of(":::b1a1b::", true),
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("race a car", false)
        );
    }

    @ParameterizedTest
    @MethodSource("getIsPalindromeArgs")
    public void itShouldAnswerIfItIsPalindrome(String s, boolean expectedResult) {
        // init

        // test
        boolean result = sut.isPalindrome(s);

        // verify
        assertEquals(expectedResult, result);
    }
}
