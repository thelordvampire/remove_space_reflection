/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.example.removespace;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;

/**
 *
 * @author bao
 */
public class FuncClass {
    public static void removeSpace(Object obj) {
        Objects.requireNonNull(obj);
        Field[] allFields = obj.getClass().getDeclaredFields();
        for (Field fi : allFields) {
            removeSpaceField(fi, obj);
        }
    }
    
    private static void removeSpaceField(Field fi, Object obj) {
        Objects.requireNonNull(fi);
        if(checkPrivate(fi) == false) return; 
        try {
            fi.setAccessible(true);
            Object value = fi.get(obj);
            if(value != null && value instanceof String) {
                fi.set(obj, ((String) value).trim());
            }
        } catch (IllegalArgumentException | IllegalAccessException ex) {
//            throw ex;
        }
    }
    
    private static boolean checkPrivate(Field fi) {
        return Modifier.isPrivate(fi.getModifiers());
    }
}
