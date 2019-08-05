public class TestStatic {
    static int sval = 1;

    // 定义一个非静态的内部类，是一个空类
    private class In {
    };

    public void test() {
        System.out.println("TestStatic:" + sval);
    }

    // 外部类的静态方法
    public static void main(String[] args) {
        // 下面代码引发编译异常，因为静态成员（main方法）无法访问非静态成员(In类)
        new TestStatic().test();
    }

}