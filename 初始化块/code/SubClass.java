class Base {
    protected String name = "Base-name";

    public Base() {
        // 在父类构造器调用引用子类属性的可能失败
        testMember();
    }

    public void testMember() {
        System.out.println("testMember:" + this.name);
    }

    public void multest() {
        System.out.println("multest");
        test();
    }

    public void test() {
        System.out.println("将被子类重写的方法");
    }
}

class SubClass extends Base {
    public String name = "2123";

    public void test() {
        System.out.println("子类重写父类的方法，其name字符串长度" + name.length());
    }

    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.multest();
        sub.testMember();
    }
}