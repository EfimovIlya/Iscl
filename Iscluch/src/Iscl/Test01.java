package Iscl;

public class Test01 {
    static int doTest() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            if (i == 3) {
                throw new Exception();
            }
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("doTest() = " + doTest());
    }
}

