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
public class FuncClass1 {
    public static void removeSpace(Object obj) {
        Objects.requireNonNull(obj);
        Field[] allFields = obj.getClass().getDeclaredFields();
        Field[] declaredFields = obj.getClass().getDeclaredFields();
//        new Field(obj);
//        Field createdField = new Field()
        
    }
    
    
}
