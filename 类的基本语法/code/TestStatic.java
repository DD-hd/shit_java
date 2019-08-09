public class TestStatic {
    static int sval = 1;

    // 定义一个非静态的内部类，是一个空类
    private static class In {
        static int ok = 1;
    };

    static class In1 {
        static int ok = 1;

        public static void hello() {
            System.out.println(In.ok);
        }
    };

    public void test() {
        System.out.println("TestStatic:" + sval);
    }

    // 外部类的静态方法
    public static void main(String[] args) {
        // 下面代码引发编译异常，因为静态成员（main方法）无法访问非静态成员(In类)
        new TestStatic().test();
        System.out.println(In.ok);
        In1.hello();
    }

}

class Test {
    static void hello() {
        System.out.println(TestStatic.In1);
    }
}