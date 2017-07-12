package Father;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/11.
 */
public class Father extends  AbstractF{

    static {
        System.out.println("static");
    }
    public Father(){
        add("1");
        one();
        four();
        System.out.println(a_private());
    }

    public void one() {
        System.out.println("one");
    }
    public void four(){
        System.out.println("four");
    }

    private int a_private(){
        System.out.println("i am a private");
        return 1;
    }

}
