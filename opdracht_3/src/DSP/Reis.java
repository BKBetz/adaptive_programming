package DSP;

import java.util.ArrayList;
import java.util.List;

public class Reis implements Comparable<Node>{
// This class is used to determin the kind of trip and show the right print statements
    private Node destination;
    private List<Node> route;

    public Reis(Node dt, List ln) {
        route = ln;
        destination = dt;
    }

    public Boolean checkIfRouteIsPossible() {
        // u can't combine trips. So a trip can only be by car, with the airplane or by train. U can't combine them
        ArrayList type_list = new ArrayList();

        for(Node r : route) {
            // use the comparable interface to determine the kind of trip
            int type = compareTo(r);
            type_list.add(type);
        }

        Object first = type_list.get(0);
        // check if all the trips are the same
        for(int x =0; x < type_list.size(); x++) {
            Object current = type_list.get(x);
            if(current != first) {
                type_list.remove(current);
            }
        }

        if (type_list.size() < route.size()) {
            return false;
        }
        else {
            return true;
        }
    }

    // the following 3 functions are basically the same but with slightly different print statements
    public void createFlight() {
        for(Node r: route) {
            System.out.printf("Je bent nu bij %s, de huidige prijs is %s \n", r, r.getValue());
            if(r.getBagage()) {
                System.out.println("Bagage is aanwezig \n");
            }
            else {
                // if baggage is lost set baggage on all trips on false aka lost
                System.out.println("Bagage kwijt\n");
                for(Node x : route) {
                    x.setBagage(false);
                }
            }
        }
    }

    public void createTrainTrip() {
        for(Node r : route) {
            System.out.printf("Je bent nu bij %s, tijd gereisd in minuten is %s \n", r, r.getValue());
            if(r.getBagage()) {
                System.out.println("Bagage is aanwezig \n");
            }
            else {
                System.out.println("Bagage kwijt\n");
                for (Node x : route) {
                    x.setBagage(false);
                }
            }
        }
    }

    public void createTrip() {
        for(Node r : route) {
            System.out.printf("Je bent nu bij %s, het aantal gereden km is %s \n", r, r.getValue());
            if(r.getBagage()) {
                System.out.println("Bagage is aanwezig \n");
            }
            else {
                System.out.println("Bagage kwijt\n");
                for (Node x : route) {
                    x.setBagage(false);
                }
            }
        }
    }

    public void createRoute() {
        if(checkIfRouteIsPossible()) {
            // for some reason the graph only returns the route and doesnt return the destination..so we add it
            route.add(destination);
            System.out.printf("Om van %s naar %s te gaan moet je de volgende route volgen %s \n", route.get(0), destination, route);
            int type = compareTo(route.get(0));
            System.out.printf("Soort reis: %s \n", route.get(0).getType());
            // We splitted this in 3 functions so that this function isn't to big
            if(type == 1) {
                createFlight();
            }

            else if(type == 2) {
                createTrip();
            }

            else {
                createTrainTrip();
            }
        }
    }

    @Override
    public String toString() {
        return "Reis{" +
                "route=" + route +
                '}';
    }

    @Override
    public int compareTo(Node o) {
        // gets the classtype of the node
        String type = o.getType();
        if(type.equals("Vlucht")) {
            return 1;
        }
        else if(type.equals("Rit")) {
            return 2;
        }
        else {
            return 3;
        }
    }
}
