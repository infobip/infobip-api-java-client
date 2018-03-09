package infobip.api.model.omni.scenarios;

import infobip.api.model.omni.scenarios.Scenario;
import java.util.List;
import java.util.ArrayList;

/**
 * This is a generated class and is not intended for modification!
 */
public class ScenariosResponse {
    private List<Scenario> scenarios = new ArrayList<>();

    public ScenariosResponse() {
    }

    public List<Scenario> getScenarios() {
        return this.scenarios;
    }

    public ScenariosResponse setScenarios(List<Scenario> scenarios) {
        this.scenarios = scenarios;
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

        ScenariosResponse o = (ScenariosResponse)obj;
        if (this.scenarios == null) {
            if (o.scenarios != null){
                return false;
            }
        } else if (!this.scenarios.equals(o.scenarios)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "ScenariosResponse{" +
            "scenarios='" + scenarios + "'" +
            '}';
    }
}