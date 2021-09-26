package makhlouf.statecapitals;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StateCapitals {
    public static void main(String[] args) {

        Map<String,String> capitalState = new HashMap<>();
        // insert the map key (state)
        capitalState.put("Alabama", "Montgomery");
        capitalState.put("Alaska", "Juneau");
        capitalState.put("Arizona", "Phoenix");
        capitalState.put("Arkansas", "Little Rock");

        System.out.println(" STATES:");
        System.out.println("=======");

        // display the keys
        Set<String> keys = capitalState.keySet();
        for(String k: keys){
            System.out.println(k);
        }
        System.out.println(".........");
        System.out.println(".........");
        System.out.println();
        System.out.println("CAPITALS:");
        System.out.println("=======");


        // display the value
        Collection<String> coll = capitalState.values();
        for(String c: coll){
            System.out.println(c);
        }
//

        System.out.println(".........");
        System.out.println(".........");
        System.out.println();
        System.out.println("STATE/CAPITAL PAIRS:");
        System.out.println("=======");
        System.out.println();

        for(String s: keys){
            System.out.println(s + " - " + capitalState.get(s));
        }

    }
}
