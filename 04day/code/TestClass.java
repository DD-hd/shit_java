public class TestClass {
    public int test = 1;

    public static void main(String[] args) {
        TestClass t = new TestClass();
        System.out.println(t.test);
    }

    public int[] TestClass() {
        System.out.println("gg-->init");
        test = 123;
        return new int[1];
    }
}