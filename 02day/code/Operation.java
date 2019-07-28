class Operation {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i << 1);

        Integer inta = 2;
        Integer intb = 2;
        // 输出true
        System.out.println("两个2自动装箱后是否相等：" + (inta == intb));

        Integer binta = 128;
        Integer bintb = 128;
        // 输出false
        System.out.println("两个2自动装箱后是否相等：" + (binta == bintb));

        int a = 5;
        int b = 4;
        int c = a++ - a;
        // int temp = --b * ++a / b--;
        // System.out.println("超级前缀运算" + a + b+temp);
        // int temp1 = temp / b--;
        // System.out.println("超级前缀运算" + a + b);
        // int temp2 = a++ / b--;
        // System.out.println("超级前缀运算" + a + b);
        // System.out.println("超级前缀运算" + temp1);
        // System.out.println("超级前缀运算" + temp);
        // System.out.println("超级前缀运算" + temp2);
        System.out.println("超级前缀运算" + c + a);
    }
}