import org.junit.platform.commons.util.StringUtils;

public class Triangle {
    public int Check(int a, int b, int c){
        if (a + b > c)
            if (b + c > a)
                if (c + a > b)
                    return 1;
                else return 0;
            else return 0;
        else return 0;
    }
}