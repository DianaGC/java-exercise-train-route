/**
 * Router Service file Implementation
 */
package exercise.trains.controller;

import exercise.trains.classes.Graph;
import exercise.trains.exception.InvalidExceptions;
import exercise.trains.infraestructure.DistanceMessage;
import exercise.trains.service.Read;

public class RouterImpl implements IRouter {
    private Graph graph;

    public RouterImpl(){
        this.graph = new Graph();
    }

    public void generateGraph(String[] routs) throws IllegalArgumentException, InvalidExceptions {
        graph.generateGraph(routs);
    }

    public String calculateDistanceBetweenTowns(String towns) throws IllegalArgumentException, InvalidExceptions {
        String[] townsList = Read.validateRoute(towns);
        int distance = 0;
        for(int i = 0; i< townsList.length-1; i++){
            if(_containsTown(townsList[i]) && _containsDestinationTown(townsList[i], townsList[i+1])){
                distance += graph.getGraph().get(townsList[i]).get(townsList[i+1]);
            }else{
                distance = -1;
                break;
            }

        }
        if(distance < 0 ){
            return DistanceMessage.NOT_FOUND_ROUTE;
        } else{
            return String.valueOf(distance);
        }
    }

    private boolean _containsTown(String town){
        return graph.getGraph().containsKey(town);
    }

    private boolean _containsDestinationTown(String town, String townDestination){
        return graph.getGraph().get(town).containsKey(townDestination);
    }



}
