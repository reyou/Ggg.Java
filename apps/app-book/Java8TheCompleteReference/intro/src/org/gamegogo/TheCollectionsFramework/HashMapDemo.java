package org.gamegogo.TheCollectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HashMapDemo {
    public static void main(String args[]) {
// Create a hash map.
/*Hash table based implementation of the Map interface.
This implementation provides all of the optional map operations, and permits null
values and the null key. (The HashMap class is roughly equivalent to Hashtable,
except that it is unsynchronized and permits nulls.)
This class makes no guarantees as to the order of the map; in particular,
it does not guarantee that the order will remain constant over time.*/
        HashMap<String, Double> hm = new HashMap<>();
// Put elements to the map
/*Associates the specified value with the specified key in this map.
If the map previously contained a mapping for the key, the old value
is replaced.*/
        hm.put("John Doe", new Double(3434.34));
        hm.put("Tom Smith", new Double(123.22));
        hm.put("Jane Baker", new Double(1378.00));
        hm.put("Tod Hall", new Double(99.22));
        hm.put("Ralph Smith", new Double(-19.08));
// Get a set of the entries.
/*A collection that contains no duplicate elements. More formally, sets
contain no pair of elements e1 and e2 such that e1.equals(e2), and at
most one null element. As implied by its name, this interface models the
mathematical set abstraction.*/
/*entrySet(): Returns a Set view of the mappings contained in this map.*/
        Set<Map.Entry<String, Double>> set = hm.entrySet();
// Display the set.
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
// Deposit 1000 into John Doe's account.
        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);
        System.out.println("John Doe's new balance: " + hm.get("John Doe"));
    }
}
