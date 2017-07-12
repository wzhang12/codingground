package Father;

import javassist.*;
import javassist.expr.ExprEditor;
import javassist.expr.FieldAccess;

/**
 * Created by Administrator on 2017/7/12.
 */
public class Main {
    public static void main(String[] args) throws Exception
    {

        ClassPool pool = ClassPool.getDefault();

        CtClass cc = pool.get("Father.Father");
        cc.defrost();
        CtMethod m = cc.getDeclaredMethod("a_private");
        //override method
        m.setBody(null);
        //override static initializer
        cc.getClassInitializer();
        CtConstructor staticConstructor = cc.getClassInitializer();
        if (staticConstructor != null) {
            if(staticConstructor.getName().equals("<clinit>"))
            {
                staticConstructor.setBody("{}");
            }
        }

        cc.toBytecode();
        cc.toClass();
        // version modifie
        Father father = new Father();
    }
}
