class VarClass {

    private final int i=1;

    {
        System.out.println("初始化代码");
        i = 10;
    }

    public VarClass() {
        System.out.println("构造函数初始化之前" + i);
        i = 100;
        System.out.println("构造函数初始化" + i);
    }

    public static void main(String[] args) {
        VarClass var = new VarClass();
    }
}