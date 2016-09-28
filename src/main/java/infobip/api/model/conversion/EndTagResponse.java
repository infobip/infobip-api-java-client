package infobip.api.model.conversion;

/**
 * This is a generated class and is not intended for modification!
 */
public class EndTagResponse {
    private String processKey;

    public EndTagResponse() {
    }

    public String getProcessKey() {
        return this.processKey;
    }

    public EndTagResponse setProcessKey(String processKey) {
        this.processKey = processKey;
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

        EndTagResponse o = (EndTagResponse)obj;
        if (this.processKey == null) {
            if (o.processKey != null){
                return false;
            }
        } else if (!this.processKey.equals(o.processKey)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "EndTagResponse{" +
            "processKey='" + processKey + "'" +
            '}';
    }
}