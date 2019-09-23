class StringClass {
    public static void main(String[] args) {
        {
            // 等价于new String("good")
            char[] a = { 'g', 'o', 'o', 'd' };
            String str1 = new String(a);
        }

        {
            // 字符串拼接
            String str1 = new String("124");
            String str2 = new String("gg");
            System.out.println(str1 + str2);
            System.out.println(str1 + str2 + 12133.012f);
        }

        {
            // 字符串的长度
            String str = "123";
            System.out.println(str.length());
        }

        {
            // 查找字符串 indexOf lastIndexOf
            String str = "1211ada";
            int size = str.indexOf("a");
            int lastSize = str.indexOf("a");

            System.out.println(size);
            System.out.println(lastSize);

        }

        {
            // 获取指定索引的字符
            String str = "adafadagf";
            char mychar = str.charAt(0);
            System.out.println(mychar);
        }

        {
            // 获取字符串子串
            String str = "hello world";
            String temp = str.substring(0, 3);
            System.out.println(temp);

        }

        {
            // 去掉空格
            String str = "hekad   ";
            System.out.println(str.trim());
        }

        {
            // 字符串替换
            String str = "khakhdkafkjfsgggg";
            System.out.println(str.replace("gggg", "####"));
        }

        {
            // 判断是否以某字符开始，或结束
            String str = "ggdahdkajkfjka07767rr";
            System.out.println(str.startsWith("gg"));
            System.out.println(str.endsWith("rr"));
        }

    }
}