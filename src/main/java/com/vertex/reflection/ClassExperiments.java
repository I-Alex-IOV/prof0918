package com.vertex.reflection;

import com.vertex.arrays.CastExample;
import lombok.experimental.Accessors;

import java.util.Arrays;

@Accessors
public class ClassExperiments<T, U> {

    public static void main(String[] args) {
        Class<?> class1 = getClassForName("com.vertex.arrays.CastExample");
//        System.out.println(class1);
//
//        CastExample castExample = new CastExample();
//        Class<? extends CastExample> class2 = getClassFromInstance(castExample);
//        System.out.println(class2);
//
//        Class<CastExample> class3 = CastExample.class;
//        System.out.println(class3);
//
//        System.out.println(class1 == class2);
//        System.out.println(class1 == class3);

//
//        Class<?> class4 = getClassForNameWithParams(class1);
//        System.out.println(class4);

//
//        System.out.println(HashMap.Entry.class.getCanonicalName());
//        System.out.println(HashMap.Entry.class.getSimpleName());
//        System.out.println(HashMap.Entry.class.getTypeName());
//        System.out.println(HashMap.Entry.class.getName());
//
//        System.out.println();
//
//        System.out.println((new Serializable(){}).getClass().getCanonicalName());
//        System.out.println((new Serializable(){}).getClass().getSimpleName());
//        System.out.println((new Serializable(){}).getClass().getName());
//        System.out.println((new Serializable(){}).getClass().getTypeName());


//        Class<?>[] classes = class1.getDeclaredClasses();
//        System.out.println(Arrays.toString(classes));

//        Class<? extends Serializable> class5 = (new Serializable() {}).getClass();
//        System.out.println(class5.getEnclosingClass());
//        System.out.println(class5.getDeclaringClass());

//        Class<ImmutableUser> class6 = ImmutableUser.class;
//        System.out.println(Arrays.toString(class6.getGenericInterfaces()));
//        System.out.println(class6.getGenericSuperclass());
//        System.out.println(class6.getProtectionDomain());
//        System.out.println();
//        System.out.println(Arrays.toString(class6.getSigners()));

        Class<ClassExperiments> class7 = ClassExperiments.class;
        System.out.println(Arrays.toString(class7.getTypeParameters()));


    }

    private static Class<?> getClassForNameWithParams(Class<?> class1) {
        Class<?> class4 = null;
        try {
            System.out.println("going to call class.forName");
            class4 = Class.forName("com.vertex.reflection.staticfields.WithStaticFields", false, class1.getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return class4;
    }

    private static Class<? extends CastExample> getClassFromInstance(CastExample instance) {
        return instance.getClass();
    }

    private static Class<?> getClassForName(String className) {
        Class<?> class1 = null;
        try {
            class1 = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return class1;
    }


}
