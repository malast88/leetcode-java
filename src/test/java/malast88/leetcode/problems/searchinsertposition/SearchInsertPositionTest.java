package malast88.leetcode.problems.searchinsertposition;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SearchInsertPositionTest {

    @InjectMocks
    private SearchInsertPosition sut;

    private static Stream<Arguments> getSearchInsertArgs() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 6}, 5, 2),
                Arguments.of(new int[]{1, 3, 5, 6}, 2, 1),
                Arguments.of(new int[]{1, 3, 5, 6}, 10, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("getSearchInsertArgs")
    public void itShouldSearchInsert(int[] nums, int target, int expectedResult) {
        // init

        // test
        int result = sut.searchInsert(nums, target);

        // verify
        assertEquals(expectedResult, result);
    }
}
