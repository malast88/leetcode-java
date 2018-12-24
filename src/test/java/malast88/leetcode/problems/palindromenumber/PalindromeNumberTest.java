package malast88.leetcode.problems.palindromenumber;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class PalindromeNumberTest {

    @InjectMocks
    private PalindromeNumber sut;

    private static Stream<Arguments> getIsPalindromeArgs() {
        return Stream.of(
                Arguments.of(123, false),
                Arguments.of(0, true),
                Arguments.of(121, true),
                Arguments.of(12321, true),
                Arguments.of(-12321, false)
        );
    }

    @ParameterizedTest
    @MethodSource("getIsPalindromeArgs")
    public void itShouldAnswerIfItIsPalindrome(int x, boolean expectedResult) {
        // init

        // test
        boolean result = sut.isPalindrome(x);

        // verify
        assertEquals(expectedResult, result);
    }
}
