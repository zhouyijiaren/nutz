package org.nutz.repo.org.objectweb.asm;

import junit.framework.TestCase;

import java.lang.reflect.Constructor;

/**
 * @author xiang.zhou
 * @description
 * @date 2021/1/12
 */
public class TypeTest extends TestCase {

    public void testGetConstructorDescriptor() {
        for (Constructor<?> constructor : String.class.getConstructors()) {
            String s = Type.getConstructorDescriptor(constructor);
            System.out.println(s);
        }
    }
}