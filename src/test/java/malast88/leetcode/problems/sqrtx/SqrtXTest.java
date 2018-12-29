package malast88.leetcode.problems.sqrtx;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SqrtXTest {

    @InjectMocks
    private SqrtX sut;

    private static Stream<Arguments> getSqrtXArgs() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(6, 2),
                Arguments.of(8, 2),
                Arguments.of(9, 3),
                Arguments.of(628, 25),
                Arguments.of(1000000, 1000)
        );
    }

    @ParameterizedTest
    @MethodSource("getSqrtXArgs")
    public void itShouldReturnSqrtX(int x, int expectedResult) {
        // init

        // test
        int result = sut.mySqrt(x);

        // verify
        assertEquals(expectedResult, result);
    }
}
