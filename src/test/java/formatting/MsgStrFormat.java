package formatting;

import java.text.MessageFormat;

public class MsgStrFormat {

    public static void main(String[] args) {

        String name = "my name is {0} and lastname is {1} -- {0}:{1}";
        String msg = MessageFormat.format(name, "aaaa", "vvvvvv");
        System.out.println(msg);

        String name1 = "my name is %s and lastname is %s -- %s:%s";
        String msg1 = String.format(name1,"aaaa", "vvvvvv","aaaa", "vvvvvv");
        System.out.println(msg1);

    }
}
