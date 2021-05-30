/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.example.removespace;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bao
 */
public class MainApp {
    public static void main(String[] args) {
        Student stud = new Student();
        stud.setName("bbbbbbbbbbbbbbb     11            ");
        stud.setAddress("    Nguyen thai hoc       ");
        
//        Field[] allFields = stud.getClass().getSuperclass().getDeclaredFields();
//        for (Field fi : allFields) {
//            System.out.println(fi.getName());
//        }
        
        System.out.println(stud.toString());
        FuncClass.removeSpace(stud);
        System.out.println(stud.toString());
        
        
        
//        Class<? extends Student> studClass = stud.getClass();
//        
//        Field[] fields = studClass.getFields();
//        Field[] allFields = studClass.getDeclaredFields();
//        
//        System.out.println(fields.length);
//        System.out.println(allFields.length);
//        System.out.println(stud.getName() +".");
//        for (Field fi : allFields) {
//            System.out.println(fi.getName() + " " + fi.isSynthetic());
//            System.out.println(fi.getType().getCanonicalName());
//            fi.get
//            
//            try {
//                fi.setAccessible(true);
//                Object value = fi.get(stud);
//                if(value instanceof String) {
//                    String str = (String) value;
//                    fi.set(stud, str.trim());
//                }
//            } catch (IllegalArgumentException ex) {
//                Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IllegalAccessException ex) {
//                Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
//            }
//           
//            
//        }
//        
//        System.out.println(stud.getName() +".");
//        
//        
//        System.out.println(studClass);
//        System.out.println(studClass.getCanonicalName());
    }
    
}
