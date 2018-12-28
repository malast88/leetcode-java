package malast88.leetcode.problems.maximumsubarray;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MaximumSubarrayTest {

    @InjectMocks
    private MaximumSubarray sut;

    private static Stream<Arguments> getMaxSubArrayArgs() {
        return Stream.of(
                Arguments.of(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}, 6),
                Arguments.of(new int[]{8,-19,5,-4,20}, 21),
                Arguments.of(new int[]{}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getMaxSubArrayArgs")
    public void itShouldReturnMaxSubArray(int[] nums, int expectedResult) {
        // init

        // test
        int result = sut.maxSubArray(nums);

        // verify
        assertEquals(expectedResult, result);
    }
}
