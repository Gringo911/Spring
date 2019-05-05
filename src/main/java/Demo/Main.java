package Demo;

import java.lang.reflect.Field;

/**
 * Created by ВАСЯ on 04.05.2019.
 */
public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        SomeClass someObject = new SomeClass();
        Class<SomeClass> someClassAsClass = (Class<SomeClass>) someObject.getClass();
        Field someField = someClassAsClass.getField("someField");


        Field fields[] = someClassAsClass.getFields();

        for (Field field : fields) {
            System.out.println(field.getType() + " " + field.getName());


            System.out.println(someField.getType());
        }
    }
}