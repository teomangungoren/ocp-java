
package coreJava.reflectionExample;

import java.lang.reflect.Field;

/**
 * Person
 */
public class User {

    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public static void main(String[] args) throws Exception {
        User user = new User("Teoman", 22);
        
        Class userClass = User.class;
        Field nameField = userClass.getDeclaredField("name");
        Field ageField = userClass.getDeclaredField("age");

        String name = (String) nameField.get(user);
        int age = (int) ageField.get(user);

        System.out.println(name);
        System.out.println(age);

       User user2=new User("uğur", 20);
       Class user2Class=user2.getClass();
       Field nameField2=user2Class.getDeclaredField("name");
       Object o=nameField2.get(user2);
       System.out.println(o);

    }

}