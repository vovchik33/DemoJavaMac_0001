package edu.progkiev.lesson1;

/**
 * Created by vladimirkravchenko on 6/10/14.
 */
public class SimpleClass {

    @Test(param1 = "Vladimir", param2 = "Kravchenko")
    public String concate(String firstName, String secondName) {
        StringBuilder builder=new StringBuilder();
        builder.append(firstName).append(secondName);
        return builder.toString();
    }
    @Test(param1 = "Vladimir", param2 = "noname")
    public String getFirstName(String firstName, String secondName) {
        StringBuilder builder=new StringBuilder();
        builder.append(firstName);
        return builder.toString();
    }
}
