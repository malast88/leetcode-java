package malast88.leetcode.problems.mergesortedarray;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(MockitoExtension.class)
public class MergeSortedArrayTest {

    @InjectMocks
    private MergeSortedArray sut;

    private static Stream<Arguments> getMergeArgs() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6}),
                Arguments.of(new int[]{0, 0, 0}, 0, new int[]{1, 1}, 2, new int[]{1, 1, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("getMergeArgs")
    public void itShouldMerge(int[] nums1, int m, int[] nums2, int n, int[] expectedResult) {
        // init

        // test
        sut.merge(nums1, m, nums2, n);

        // verify
        assertArrayEquals(expectedResult, nums1);
    }
}
