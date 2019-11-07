import java.io.UnsupportedEncodingException;

public class lianxi {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "fgh";
        byte[] a = s.getBytes("UTF-8");
        byte[] b = "123345".getBytes("UTF-8");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(a);
        System.out.println(b);

    }
}
