package infobip.api.model.omni.scenarios;

import infobip.api.model.omni.scenarios.Step;
import java.util.List;
import java.util.ArrayList;

/**
 * This is a generated class and is not intended for modification!
 */
public class Scenario {
    private String key;
    private String name;
    private List<Step> flow = new ArrayList<>();
    private Boolean defaultScenario;

    public Scenario() {
    }

    public String getKey() {
        return this.key;
    }

    public Scenario setKey(String key) {
        this.key = key;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Scenario setName(String name) {
        this.name = name;
        return this;
    }

    public List<Step> getFlow() {
        return this.flow;
    }

    public Scenario setFlow(List<Step> flow) {
        this.flow = flow;
        return this;
    }

    public Boolean getDefaultScenario() {
        return this.defaultScenario;
    }

    public Scenario setDefaultScenario(Boolean defaultScenario) {
        this.defaultScenario = defaultScenario;
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

        Scenario o = (Scenario)obj;
        if (this.key == null) {
            if (o.key != null){
                return false;
            }
        } else if (!this.key.equals(o.key)) {
            return false;
        }
        if (this.name == null) {
            if (o.name != null){
                return false;
            }
        } else if (!this.name.equals(o.name)) {
            return false;
        }
        if (this.flow == null) {
            if (o.flow != null){
                return false;
            }
        } else if (!this.flow.equals(o.flow)) {
            return false;
        }
        if (this.defaultScenario == null) {
            if (o.defaultScenario != null){
                return false;
            }
        } else if (!this.defaultScenario.equals(o.defaultScenario)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Scenario{" +
            "key='" + key + "'" +
            ", name='" + name + "'" +
            ", flow='" + flow + "'" +
            ", defaultScenario='" + defaultScenario + "'" +
            '}';
    }
}