package malast88.leetcode.problems.twosumiiinputarrayissorted;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(MockitoExtension.class)
public class TwoSumiiInputArrayIsSortedTest {

    @InjectMocks
    private TwoSumiiInputArrayIsSorted sut;

    private static Stream<Arguments> getTwoSumArgs() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}),
                Arguments.of(new int[]{1, 2, 7}, 9, new int[]{2, 3}),
                Arguments.of(new int[]{1, 2, 7}, 10, null)
        );
    }

    @ParameterizedTest
    @MethodSource("getTwoSumArgs")
    public void itShouldReturnTwoSum(int[] nums, int target, int[] expectedResult) {
        // init

        // test
        int[] result = sut.twoSum(nums, target);

        // verify
        assertArrayEquals(expectedResult, result);
    }
}
