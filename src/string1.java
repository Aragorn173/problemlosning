import javax.swing.*;

public class string1 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("TEXT?");
        String b = reverse(a);
        System.out.println(b);
    }

    public static String reverse(String a) {
        String c = "";
        int x = 0;
        for (int i = a.length(); i > 0; i--) {

            c = c + a.charAt(i-1);

        }
        return c;
    }
}
