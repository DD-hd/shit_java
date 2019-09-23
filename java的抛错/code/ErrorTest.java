class MyExcetion extends Exception {
    String msg;

    public MyExcetion(String message) {
        msg = message;
    }

    public String getMsg() {
        return msg;
    }
}

class ErrorTest {
    public static void main(String[] args) {
        testFunc();
    }

    public static void testFunc() {
        if (false) {
            throw new MyExcetion("123");
        }
        try {
            throw new Exception("ggg");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}