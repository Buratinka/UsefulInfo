package main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection
{
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.io.InputStream");
        String nameC = c.getName();

        System.out.println("name : " + nameC);

        Constructor[] constructors = c.getConstructors();
        Class [] interfaces = c.getInterfaces();

        for(Constructor constr : constructors)
        {
            System.out.println("constructor : " + constr);
        }

        for(Class interf : interfaces)
        {
            System.out.println("interface : " + interf);
        }

        StringBuilder sb = new StringBuilder();

        int modifier = c.getModifiers();

        sb.append("modifier : ");

        if(Modifier.isPublic(modifier)){System.out.println(sb.append("public"));}
        if(Modifier.isProtected(modifier)){System.out.println(sb.append("protected"));}
        if(Modifier.isPrivate(modifier)){System.out.println(sb.append("private"));}
        if(Modifier.isStatic(modifier)){System.out.println(sb.append("static"));}
        if(Modifier.isFinal(modifier)){System.out.println(sb.append("final"));}

        Method []methods = c.getMethods();

        for(Method m : methods)
        {
            System.out.println(m);
        }

        Field []fields = c.getFields();

        for(Field f : fields)
        {
            System.out.println(f);
        }

    }
}
