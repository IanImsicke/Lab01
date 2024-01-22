import static org.junit.jupiter.api.Assertions.*;

class PersonTest1 {

    Person p1, p2, p3;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        p1 = new Person("00000A", "Tom", "Wulf", "Mr", 2000);
        p2 = new Person("00000B", "Ian", "Im", "mr", 2005);
        p3 = new Person("000001", "Jeeff", "Im", "Mr", 1990);
    }

    @org.junit.jupiter.api.Test
    void setIDSeed() {
    }

    @org.junit.jupiter.api.Test
    void setID() {
        p1.setID("00000B");
        assertEquals("00000B", p1.getID());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        p1.setFirstName("Tom");
        assertEquals("Tom", p1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        p1.setLastName("Wulf");
        assertEquals("Wulf", p1.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setYOB() {
        p1.setYOB(2000);
        assertEquals(2000, p1.getYOB());
    }

    @org.junit.jupiter.api.Test
    void setTitle() {
    }

    @org.junit.jupiter.api.Test
    void fullName() {
    }

    @org.junit.jupiter.api.Test
    void formalName() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
    }

    @org.junit.jupiter.api.Test
    void toJSONRecord() {
    }

    @org.junit.jupiter.api.Test
    void toXMLRecord() {
    }

    @org.junit.jupiter.api.Test
    void toCSVRecord() {
    }
}