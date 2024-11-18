package org.example;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> arrayUtilsClass = Class.forName("ArrayUtils");
            Method[] methods = arrayUtilsClass.getDeclaredMethods();

            for (Method method : methods) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                Author author = method.getAnnotation(Author.class);

                System.out.println("--------------------");
                System.out.println("Назва методу: " + methodInfo.name());
                System.out.println("Тип поверненого значення: " + methodInfo.returnType());
                System.out.println("Опис: " + methodInfo.description());
                System.out.println("Автор: " + author.name());
                System.out.println("--------------------");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Клас ArrayUtils не знайдено: " + e.getMessage());
        }
    }
}