package exercise.trains;

import exercise.trains.classes.Graph;
import exercise.trains.exception.InvalidExceptions;
import exercise.trains.controller.IRouter;
import exercise.trains.controller.RouterImpl;


public class Main  {


    public static void main(String[] args) throws InvalidExceptions {

        //Graph graph = new Graph();


        IRouter router = new RouterImpl();
        System.out.println("---------********--------");
        router.generateGraph(new String[]{"AB5", "AD5", "AE7", "BC4", "CD8", "CE2", "DC8", "DE6", "EB3"});

        System.out.println("--------distance---------");
        router.calculateDistanceBetweenTowns("A-B-C");


    }
}
