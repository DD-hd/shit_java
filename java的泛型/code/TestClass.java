import java.util.ArrayList;
import java.util.List;

class Sub<T> {
    public T info;

    // public Apple() {
    // };

    // public Apple(T info) {
    // this.info = info;
    // }

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return this.info;
    }
}

// 设定类型形参的上限
class Sub1<T extends Number> {
    public T info;

}

public class TestClass {

    public static void main(String[] args) {
        // TestClass test = new TestClass<String>();
        // System.out.println(args.length);
        // System.out.println(test.a);
        // System.out.println(test.b);

        // Sub<Double> sub = new Sub();
        // 泛型并不存在类型继承
        List<String> strList = new ArrayList<String>();
        // 类型不兼容
        // TestClass.test(strList);
        TestClass.test1(strList);

        Sub1<Double> sub1 = new Sub1<Double>();
        System.out.println(sub1.info);

        // 类型不在器声明范围
        // Sub1<String> sub12 = new Sub1<String>();
        // System.out.println(sub12.info);

        int[][] arrs = new int[1][2];

    }

    public static void test(List<Object> c) {
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }
    }

    public static void test1(List<?> c) {
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }
    }
}