package coreJava.reflectionExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionExample {

    public static void main(String[] args) {
        
        String name;
        if(args.length>0) name=args[0];
        else{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter class name");
            name=sc.next();
        }
        
        try {
            Class cl=Class.forName(name);
            Class supercl=cl.getSuperclass();
            String modifiers=Modifier.toString(cl.getModifiers());
            if(modifiers.length()>0) System.out.println(modifiers+" ");
            System.out.println("class "+name);
            if(supercl!=null && supercl!=Object.class) 
            System.out.println("extends"+supercl.getName());
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");

            } catch (ClassNotFoundException e) {
            // TODO: handle exception
             e.printStackTrace();
         }
         System.exit(0);

    }

    public static void printConstructors(Class cl){
        Constructor[] constructors=cl.getDeclaredConstructors();

        for (Constructor c : constructors) {
            String name=c.getName();
            System.out.println(" ");
            String modifiers=Modifier.toString(c.getModifiers());
            if(modifiers.length()>0)System.out.println(modifiers+" ");
            System.out.println(name+"(");

            Class[] paramTypes=c.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if(i>0) System.out.println(",");
                System.out.println(paramTypes[i].getName());
            }
        }
    }

    public static void printMethods(Class cl){
        Method[] methods=cl.getDeclaredMethods();
        for (Method m : methods) {
            Class retType=m.getReturnType();
            String name=m.getName();
            System.out.println(" ");
            //print return type,modifiers,method name
            String modifiers=Modifier.toString(m.getModifiers());
            if(modifiers.length()>0)System.out.println(modifiers+"");
            System.out.println(retType.getName()+" "+name+"(");

            //print parameter types 
            Class[] paramTypes=m.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if(i>0)System.out.print(",");
                 System.out.println(paramTypes[i].getName());
            }
        }
    }
    
    public static void printFields(Class cl){
        Field[] fields=cl.getDeclaredFields();
        for (Field f : fields) {
            Class type=f.getType();
            String name=f.getName();
            String modifiers=Modifier.toString(f.getModifiers());
            if(modifiers.length()>0)System.out.println(modifiers+" ");
            System.out.println(type.getName()+" "+name+";");
        }
    }


}
