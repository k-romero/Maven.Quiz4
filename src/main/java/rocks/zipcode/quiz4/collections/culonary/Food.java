package rocks.zipcode.quiz4.collections.culonary;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    List<Spice> spices;

    public Food() {
        this.spices = new LinkedList<>();
    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> spicemap = new HashMap();
        for (Spice s: spices) {
            SpiceType currentSpice = (SpiceType)s.getClass();
            if(spicemap.containsKey(currentSpice)){
                spicemap.replace(currentSpice,spicemap.get(currentSpice),spicemap.get(currentSpice) +1);
            }else {
                spicemap.put(currentSpice,1);
            }
        }
        return spicemap;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
