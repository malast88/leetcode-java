package malast88.leetcode.problems.countandsay;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CountAndSayTest {

    @InjectMocks
    private CountAndSay sut;

    private static Stream<Arguments> getCountAndSayArgs() {
        return Stream.of(
                Arguments.of(1, "1"),
                Arguments.of(2, "11"),
                Arguments.of(3, "21"),
                Arguments.of(4, "1211"),
                Arguments.of(5, "111221"),
                Arguments.of(6, "312211")
        );
    }

    @ParameterizedTest
    @MethodSource("getCountAndSayArgs")
    public void itShouldCountAndSay(int n, String expectedResult) {
        // init

        // test
        String result = sut.countAndSay(n);

        // verify
        assertEquals(expectedResult, result);
    }
}
