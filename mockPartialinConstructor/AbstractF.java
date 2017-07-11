package Father;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * Created by Administrator on 2017/7/11.
 */
public abstract class AbstractF {
    public abstract void one();
    final Set<String> sets = Sets.newHashSet();
    public void add(String a){
        sets.add(a);
    }
    public void two()
    {
        System.out.println("two");
    }
    public void three()
    {
        System.out.println("three");
    }
    public void get(){
        for (String set : sets) {
            System.out.println(set);
        }
    }
}
