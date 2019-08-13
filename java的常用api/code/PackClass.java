public class PackClass {
    public static void main(String[] args) {
        // Integer
        {
            Integer int1 = new Integer(7 + 255);
            // byteValue
            System.out.println(int1.byteValue());
            // compareTo
            System.out.println(new Integer(278).compareTo(int1));

            // equals
            System.out.println(new Integer(278).equals(int1));

            // int型返回此Integer对象
            System.out.print(new Integer(255 * 255 * 255).shortValue());
        }

        // Boolean对象
        {
            Boolean bool = new Boolean("false");

            // booleanValue
            System.out.println(bool.booleanValue());
            // equals
            System.out.println(bool.equals(new Boolean("true")));
            // parseBoolean
            System.out.println(bool.parseBoolean("falsedaf"));
            // toString
            System.out.println(bool.toString());
            // valueOf
            System.out.println(Boolean.valueOf("1"));

        }

        // Byte
        {
            Byte by = new Byte("123");
            System.out.println(by);
            System.out.println(Byte.MIN_VALUE);
            System.out.println(Byte.MAX_VALUE);

        }

    }
}