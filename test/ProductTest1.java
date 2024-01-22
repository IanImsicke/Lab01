import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest1 {

    Product p1, p2, p3;

    @BeforeEach
    void setUp() {
        p1 = new Product("000001", "Name", "Description", 10.00);
        p2 = new Product("000002", "Name2", "Description2", 12.00);
        p3 = new Product("000003", "Name3", "Description3", 13.00);

    }

    @Test
    void setName() {

    }

    @Test
    void setDescription() {
    }

    @Test
    void setID() {
        p1.setID("000002");
        assertEquals("000002", p1.getID());
    }

    @Test
    void setCost() {
    }

    @Test
    void toJSONRecord() {
    }

    @Test
    void toXMLRecord() {
    }

    @Test
    void toCSVRecord() {
    }
}