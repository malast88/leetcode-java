package malast88.leetcode.problems.excelsheetcolumntitle;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ExcelSheetColumnTitleTest {

    @InjectMocks
    private ExcelSheetColumnTitle sut;

    private static Stream<Arguments> getConvertToTitleArgs() {
        return Stream.of(
                Arguments.of(1, "A"),
                Arguments.of(26, "Z"),
                Arguments.of(27, "AA"),
                Arguments.of(28, "AB"),
                Arguments.of(701, "ZY")
        );
    }

    @ParameterizedTest
    @MethodSource("getConvertToTitleArgs")
    public void itShouldConvertToTitle(int n, String expectedResult) {
        // init

        // test
        String result = sut.convertToTitle(n);

        // verify
        assertEquals(expectedResult, result);
    }
}
