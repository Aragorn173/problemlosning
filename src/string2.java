import javax.swing.*;

import static java.lang.Character.toUpperCase;

public class string2 {
    public static void main(String[] args) {
       String a = JOptionPane.showInputDialog("Text?");
       String b = camelCase(a);
        System.out.println(b);
    }

    private static String camelCase(String a) {
        String c = "";
        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) == ' ') {
                c = c + toUpperCase(a.charAt(i+1));
                i++;
            } else {
                c = c + a.charAt(i);
            }
        }
            return c;
    }
}
