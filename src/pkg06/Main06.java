package pkg06;

import static javax.swing.text.html.HTML.Tag.HEAD;

public class Main06 {
    public static void main(String[] args) {
        System.out.println("Hello from branch tb06 1st time");
// tb06.01 begin
        System.out.println("Hello from branch tb06.01 1st time");
        System.out.println("Hello from branch tb06.01 2nd time"); //except incoming change
// tb06.01 end
// tb06 begin
        System.out.println("Hello from branch tb06 2nd time"); //except current change
// tb06 end
    }
}
