package malast88.leetcode.problems.besttimetobuyandsellstockii;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class BestTimeToBuyAndSellStockiiTest {

    @InjectMocks
    private BestTimeToBuyAndSellStockii sut;

    private static Stream<Arguments> getReturnMaxProfitArgs() {
        return Stream.of(
                Arguments.of(new int[0], 0),
                Arguments.of(new int[]{11}, 0),
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 7),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getReturnMaxProfitArgs")
    public void itShouldReturnMaxProfit(int[] prices, int expectedResult) {
        // init

        // test
        int result = sut.maxProfit(prices);

        // verify
        assertEquals(expectedResult, result);
    }
}
