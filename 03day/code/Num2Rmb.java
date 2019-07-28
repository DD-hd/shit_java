public class Num2Rmb {
    public static void main(String[] args) {
        String[] chars = { "零", "一", "二", "三", "四", "五", "六", "七", "八", "九" };
        String[] danwei = { "元", "万", "亿" };
        String[] shu = { "十", "百", "千" };
        double money = 12122132442.13244;
        String rmb = "";
        int zhengshu = (int) money;
        double lingtou = (int) ((money - zhengshu) * 100);

        int index = 0;
        do {
            int num = zhengshu % 10;
            int lun = index % 4;
            if (lun == 0) {
                rmb = chars[num] + danwei[index / 4] + rmb;
            } else {
                rmb = chars[num] + shu[(lun - 1) % 3] + rmb;
            }
            index++;
            zhengshu = (int) zhengshu / 10;
        } while (zhengshu > 0);
        System.out.println((int) money);
        System.out.println(money);
        System.out.println(rmb);

    }
}