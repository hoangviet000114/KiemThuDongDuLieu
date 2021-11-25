import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class BOUND {
    Triangle tamgiac = new Triangle();
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    @Test
    void test1(int a1, int b1, int c1, int ketqua){
        int res = tamgiac.Check(a1, b1, c1);
        assertEquals(res, ketqua);
    }
}