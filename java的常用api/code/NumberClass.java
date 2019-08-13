import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Random;

class NumberClass {
    public static void main(String[] args) {
        DecimalFormat myFormat = new DecimalFormat();
        // 设置分组2
        myFormat.setGroupingSize(2);
        String output = myFormat.format(1234355.789);
        System.out.println(output);
        // Math
        System.out.println(Math.PI);
        System.out.println(Math.floor(324.12));
        System.out.println(Math.random());

        // Random 种子相同，则值相同
        Random r = new Random(123);
        System.out.println(r.nextInt());

        // BinIntege 大数操作
        String val = Integer.MAX_VALUE + "123424";
        System.out.println(val);
        BigInteger bigIng = new BigInteger(val).add(new BigInteger(val));
        System.out.println(bigIng + "->" + Integer.MAX_VALUE);

        // BinDecimal 大数操作
        String val1 = Double.MAX_VALUE + "4";
        System.out.println(val1);
        BigDecimal big1 = new BigDecimal(val1).add(new BigDecimal(val1));
        System.out.println(big1 + "->" + Double.MAX_VALUE);
    }
}