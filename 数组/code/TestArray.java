
public class TestArray {
    public static void main(String[] args) {
        int[] a = { 22, 2342, 5 };
        int[] b = new int[] { 12, 2342, 5 };
        System.out.println(a);
        System.out.println(b);

        String[][] strs = new String[][] { new String[] { "1213" }, new String[] { "1213" } };
        System.out.println(strs);

        String[][] strs1 = new String[3][1];
        System.out.println(strs1);

        int[] utilsb;
        // 暂时无法编译通过 ==
        // Arrays.fill(utilsb, 23);
        // System.out.println(utilsb.toString());
    }
}