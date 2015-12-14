package Iscl;


public class Test06 {
    public static void main(String[] args) throws Exception {
        try {
            System.exit(0);
        } catch(Exception e) {
            // no exception
        } finally {
            System.out.println("In the finally block");
        }
    }
}