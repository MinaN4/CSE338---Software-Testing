import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerOrdersTest {

    @Test
    void testTeaNoSugar() {
        CustomerOrders order = new CustomerOrders("T::", 40);
        String actualMessage = order.drinkMakerMessage();
        String expectedMessage = "Drink maker makes 1 tea with no sugar - and therefore no stick";
        assertEquals(expectedMessage, actualMessage);
    }



    @Test
    void testTeaOneSugar() {
        CustomerOrders order = new CustomerOrders("T:1:0", 100);
        String actualMessage = order.drinkMakerMessage();
        String expectedMessage = "Drink maker makes 1 tea with 1 sugar and a stick";
        assertEquals(expectedMessage, actualMessage);
    }


    @Test
    void testTeaTwoSugar() {
        CustomerOrders order = new CustomerOrders("T:2:0", 120);
        String actualMessage = order.drinkMakerMessage();
        String expectedMessage = "Drink maker makes 1 tea with 2 sugars and a stick";
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testTeaTwoSugarNotEnoughMoney() {
        CustomerOrders order = new CustomerOrders("T:2:0", 30);
        String actualMessage = order.drinkMakerMessage();
        String expectedMessage = "Missing 10 cents";
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testOrangeJuice() {
        CustomerOrders order = new CustomerOrders("O::", 60);
        String actualMessage = order.drinkMakerMessage();
        String expectedMessage = "Drink maker makes 1 orange juice";
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testExtraHotCoffeeNoSugar() {
        CustomerOrders order = new CustomerOrders("Ch::", 60);
        String actualMessage = order.drinkMakerMessage();
        String expectedMessage = "Drink maker makes 1 extra hot coffee with no sugar - and therefore no stick";
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testExtraHotChocolateOneSugar() {
        CustomerOrders order = new CustomerOrders("Hh:1:0", 50);
        String actualMessage = order.drinkMakerMessage();
        String expectedMessage = "Drink maker makes 1 extra hot chocolate with 1 sugar and a stick";
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testExtraHotTeaTwoSugar() {
        CustomerOrders order = new CustomerOrders("Th:2:0", 40);
        String actualMessage = order.drinkMakerMessage();
        String expectedMessage = "Drink maker makes 1 extra hot tea with 2 sugars and a stick";
        assertEquals(expectedMessage, actualMessage);
    }




    @Test
    void testOrangeJuiceNotEnoughMoney() {
        CustomerOrders order = new CustomerOrders("O::", 30);
        String actualMessage = order.drinkMakerMessage();
        String expectedMessage = "Missing 30 cents";
        assertEquals(expectedMessage, actualMessage);
    }



}
