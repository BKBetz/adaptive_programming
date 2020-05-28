package DSP;

import java.util.ArrayList;
import java.util.List;

public class Reis implements Comparable<Node>{

    private Node destination;
    private List<Node> route;

    public Reis(Node dt, List ln) {
        route = ln;
        destination = dt;
    }

    public void createRoute() {
        ArrayList type_list = new ArrayList();
        for(Node r : route) {
            int type = compareTo(r);
            type_list.add(type);
        }

        Object first = type_list.get(0);

        for(int x =0; x < type_list.size(); x++) {
            Object current = type_list.get(x);
            if(current != first) {
                type_list.remove(current);
            }
        }

        if (type_list.size() < route.size()) {
            System.out.println("There is something wrong");
        }
        else {
            System.out.println("Route is good");
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
