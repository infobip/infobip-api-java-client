package infobip.api.model.omni.campaign;

import infobip.api.model.omni.campaign.Destination;
import java.util.List;
import java.util.ArrayList;

/**
 * This is a generated class and is not intended for modification!
 */
public class Destinations {
    private List<Destination> destinations = new ArrayList<>();

    public Destinations() {
    }

    public List<Destination> getDestinations() {
        return this.destinations;
    }

    public Destinations setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Destinations o = (Destinations)obj;
        if (this.destinations == null) {
            if (o.destinations != null){
                return false;
            }
        } else if (!this.destinations.equals(o.destinations)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Destinations{" +
            "destinations='" + destinations + "'" +
            '}';
    }
}