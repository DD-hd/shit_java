public class TestChar {
    public static void main(String[] main) {
        char aCHar = 'a';
        char enterChar = '\r';
        char ch = '\u0001';
        System.out.println(ch);
        char zhong = '中';
        int zhongValue = zhong;
        System.out.println(zhongValue);
        char c = 97;
        System.out.println(c);
        boolean b = true;
        // 不兼容的类型: boolean无法转换为int
        // int a = b;
        // 不兼容的类型: boolean无法转换为double
        // double d=b;
        // 不兼容的类型: boolean无法转换为char
        // char c=b;
        // boolean无法转换为int,double,char
        // int a = (int) b;
        // System.out.println(a);
    }
}