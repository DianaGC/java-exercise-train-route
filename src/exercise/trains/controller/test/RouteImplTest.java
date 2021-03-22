package exercise.trains.controller.test;

import exercise.trains.classes.Graph;
import exercise.trains.controller.IRouter;
import exercise.trains.controller.RouterImpl;
import exercise.trains.exception.InvalidExceptions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RouteImplTest {

    String towns = "A-B-C";

    String router = new RouterImpl().calculateDistanceBetweenTowns(towns);

    @Test
    public void testPrintMessage() {
        System.out.println("test calculateDistanceBetweenTowns, give A-B-C it should return distance 9");
        assertEquals(router, 9);
    }

    public RouteImplTest() throws InvalidExceptions {
    }
}
