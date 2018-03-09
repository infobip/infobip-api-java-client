package infobip.api.model.omni.scenarios;

import infobip.api.model.omni.OmniChannel;

/**
 * This is a generated class and is not intended for modification!
 */
public class Step {
    private String from;
    private OmniChannel channel;

    public Step() {
    }

    public String getFrom() {
        return this.from;
    }

    public Step setFrom(String from) {
        this.from = from;
        return this;
    }

    public OmniChannel getChannel() {
        return this.channel;
    }

    public Step setChannel(OmniChannel channel) {
        this.channel = channel;
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

        Step o = (Step)obj;
        if (this.from == null) {
            if (o.from != null){
                return false;
            }
        } else if (!this.from.equals(o.from)) {
            return false;
        }
        if (this.channel == null) {
            if (o.channel != null){
                return false;
            }
        } else if (!this.channel.equals(o.channel)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Step{" +
            "from='" + from + "'" +
            ", channel='" + channel + "'" +
            '}';
    }
}