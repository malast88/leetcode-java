package malast88.leetcode.problems.removeduplicatesfromsortedarray;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class RemoveDuplicatesFromSortedArrayTest {

    @InjectMocks
    private RemoveDuplicatesFromSortedArray sut;

    private static Stream<Arguments> getXXXArgs() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2}, 2, new int[]{1, 2, -1}),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5, new int[]{0, 1, 2, 3, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("getXXXArgs")
    public void itShouldXXX(int[] nums, int expectedResult, int[] expectedNums) {
        // init

        // test
        int result = sut.removeDuplicates(nums);

        // verify
        assertEquals(expectedResult, result);
        for (int i = 0; i < expectedResult; i++) {
            assertEquals(nums[i], expectedNums[i]);
        }
    }
}
