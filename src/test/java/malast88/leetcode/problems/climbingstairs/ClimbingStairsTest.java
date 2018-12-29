package malast88.leetcode.problems.climbingstairs;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ClimbingStairsTest {

    @InjectMocks
    private ClimbingStairs sut;

    private static Stream<Arguments> getClimbStairsArgs() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(3, 3),
                Arguments.of(5, 8),
                Arguments.of(10, 89)
        );
    }

    @ParameterizedTest
    @MethodSource("getClimbStairsArgs")
    public void itShouldClimbStairs(int n, int expectedResult) {
        // init

        // test
        int result = sut.climbStairs(n);

        // verify
        assertEquals(expectedResult, result);
    }
}
