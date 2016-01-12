public class FinalTest {
    public static void main(String[] args) {
        final int var = 1;
        var = 2;
        assert 1 == var;
    }
}
