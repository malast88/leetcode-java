package malast88.leetcode.problems.plusone;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(MockitoExtension.class)
public class PlusOneTest {

    @InjectMocks
    private PlusOne sut;

    private static Stream<Arguments> getXXXArgs() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 4}),
                Arguments.of(new int[]{9, 9}, new int[]{1, 0, 0}),
                Arguments.of(new int[]{9, 8, 9}, new int[]{9, 9, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("getXXXArgs")
    public void itShouldXXX(int[] digits, int[] expectedResult) {
        // init

        // test
        int[] result = sut.plusOne(digits);

        // verify
        assertArrayEquals(expectedResult, result);
    }
}
