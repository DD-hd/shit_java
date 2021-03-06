import java.util.HashSet;
import java.util.Iterator;

class R {
    int count;

    public R(int count) {
        this.count = count;
    }

    public String toString() {
        return "R(count属性:" + count + ")";
    }

    public boolean equals(Object obj) {
        if (obj instanceof R) {
            R r = (R) obj;
            if (r.count == this.count) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.count;
    }
}

public class TestHashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new R(5));
        hs.add(new R(-3));
        hs.add(new R(9));
        hs.add(new R(-2));

        System.out.println(hs);

        Iterator it = hs.iterator();
        R first = (R) it.next();
        first.count = -3;
        System.out.println(hs);

        hs.remove(new R(-3));

        System.out.println(hs);

        System.out.println("hs是否包含count为-3的R对象?" + hs.contains(new R(-3)));
        System.out.println("hs是否包含count为5的R对象?" + hs.contains((new R(5))));
    }
}