import org.example.people.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest
{
    @Test
    public void testConstruction()
    {
        
        Person testMe = new Person("Joe", "Smith");

        assertAll ("The constructor does not set all fields correctly",
                () -> assertEquals("Joe", testMe.getFirst()),
                () -> assertEquals("Smith", testMe.getLast()),
                () -> assertNull(testMe.getTitle())
        );
    }
}
