package exercise.trains.classes;

import exercise.trains.exception.InvalidExceptions;
import sun.security.krb5.internal.crypto.Des;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<String, Map<String, Integer>> graph;
    private Map<String, List<Destination>> graphDestination;

    public Graph() {}

    public void generateGraph(String[] routes) throws InvalidExceptions{
        graph = new HashMap<String, Map<String, Integer> >();

        for(String route: routes){

            Town townStart = new Town(Character.toString(route.charAt(0)));
            Town townEnd = new Town(Character.toString(route.charAt(1)));

            if(graph.containsKey(townStart.getTownName())){
                if(!graph.get(townStart.getTownName()).containsKey(townEnd.getTownName())){
                    graph.get(townStart.getTownName()).put(townEnd.getTownName(),Character.getNumericValue(route.charAt(2)));
                }
            } else{
                HashMap<String, Integer> destination = new HashMap();
                destination.put(townEnd.getTownName(), Character.getNumericValue(route.charAt(2)));
                graph.put(townStart.getTownName(), destination);
            }
        }
    }


    public Map<String, Map<String, Integer>> getGraph() {
        return graph;
    }

    public void setGraph(Map<String, Map<String, Integer>> graph) {
        this.graph = graph;
    }

    public Map<String, List<Destination>> getGraphDestination() {
        return graphDestination;
    }

    public void setGraphDestination(Map<String, List<Destination>> graphDestination) {
        this.graphDestination = graphDestination;
    }
}
