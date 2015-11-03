package infobip.api.model.sms.mt.send.binary;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class BinaryContent {
    private Integer dataCoding;
    private String hex;
    private Integer esmClass;

    public BinaryContent() {
    }


    public Integer getDataCoding() {
        return this.dataCoding;
    }

    public BinaryContent setDataCoding(Integer dataCoding) {
        this.dataCoding = dataCoding;
        return this;
    }


    public String getHex() {
        return this.hex;
    }

    public BinaryContent setHex(String hex) {
        this.hex = hex;
        return this;
    }


    public Integer getEsmClass() {
        return this.esmClass;
    }

    public BinaryContent setEsmClass(Integer esmClass) {
        this.esmClass = esmClass;
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

        BinaryContent o = (BinaryContent)obj;
        if (this.dataCoding == null) {
            if (o.dataCoding != null){
                return false;
            }
        } else if (!this.dataCoding.equals(o.dataCoding)) {
            return false;
        }
        if (this.hex == null) {
            if (o.hex != null){
                return false;
            }
        } else if (!this.hex.equals(o.hex)) {
            return false;
        }
        if (this.esmClass == null) {
            if (o.esmClass != null){
                return false;
            }
        } else if (!this.esmClass.equals(o.esmClass)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "BinaryContent{" +
            "dataCoding='" + dataCoding + "'" +

            ", hex='" + hex + "'" +

            ", esmClass='" + esmClass + "'" +
            '}';
    }
}