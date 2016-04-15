package ocajp9;

import java.util.ArrayList;

public class OCAJP9 {

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("javachamp");
        StringBuffer sb2 = new StringBuffer("javachamp");
        boolean stmt1 = sb1.equals(sb2);
        boolean stmt2 = sb1 == sb2;

        String s1 = new String("javachamp");
        String s2 = new String("javachamp");
        boolean stmt3 = s1.equals(s2);
        boolean stmt4 = s1 == s2;

        String stmt = null;
        System.out.print(null + stmt);
        System.out.println(stmt + null);

        StringBuffer buffer1 = new StringBuffer("javachamp");
        StringBuffer buffer2 = new StringBuffer(buffer1);
        if (buffer1.equals(buffer2)) {
            System.out.println("true");
        } else {
            System.out.println("false");

            String sone = null;
            String stwo = null;
            if (sone == stwo) {
                System.out.println("A");
            }

            String a = "javachamp";
            String b = "javachamp";
            String c = new String("javachamp");

            System.out.println(a == b);
            System.out.println(a == c);
            System.out.println(b.equals(c));
            System.out.println(b.equals(a));

        }
    }

}
