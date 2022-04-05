import javax.swing.*;

public class String3 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Text?");

        String b = string1.reverse(a);

        if (a.equals(b)) {
            System.out.println("ordet " + a + " är en palindrom");
        } else {
            System.out.println("ordet " + a + " är inte en palindrom");
        }

    }
}
