package infobip.api.model.omni.send;

import infobip.api.model.omni.send.LineDataType;
import java.util.concurrent.TimeUnit;

/**
 * This is a generated class and is not intended for modification!
 */
public class LineData {
    private LineDataType type;
    private String url;
    private String thumbnailUrl;
    private String duration;
    private String packageId;
    private String stickerId;
    private String text;
    private Long validityPeriod;
    private TimeUnit validityPeriodTimeUnit;

    public LineData() {
    }

    public LineDataType getType() {
        return this.type;
    }

    public LineData setType(LineDataType type) {
        this.type = type;
        return this;
    }

    public String getUrl() {
        return this.url;
    }

    public LineData setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public LineData setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    public String getDuration() {
        return this.duration;
    }

    public LineData setDuration(String duration) {
        this.duration = duration;
        return this;
    }

    public String getPackageId() {
        return this.packageId;
    }

    public LineData setPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public LineData setStickerId(String stickerId) {
        this.stickerId = stickerId;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public LineData setText(String text) {
        this.text = text;
        return this;
    }

    public Long getValidityPeriod() {
        return this.validityPeriod;
    }

    public LineData setValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    public TimeUnit getValidityPeriodTimeUnit() {
        return this.validityPeriodTimeUnit;
    }

    public LineData setValidityPeriodTimeUnit(TimeUnit validityPeriodTimeUnit) {
        this.validityPeriodTimeUnit = validityPeriodTimeUnit;
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

        LineData o = (LineData)obj;
        if (this.type == null) {
            if (o.type != null){
                return false;
            }
        } else if (!this.type.equals(o.type)) {
            return false;
        }
        if (this.url == null) {
            if (o.url != null){
                return false;
            }
        } else if (!this.url.equals(o.url)) {
            return false;
        }
        if (this.thumbnailUrl == null) {
            if (o.thumbnailUrl != null){
                return false;
            }
        } else if (!this.thumbnailUrl.equals(o.thumbnailUrl)) {
            return false;
        }
        if (this.duration == null) {
            if (o.duration != null){
                return false;
            }
        } else if (!this.duration.equals(o.duration)) {
            return false;
        }
        if (this.packageId == null) {
            if (o.packageId != null){
                return false;
            }
        } else if (!this.packageId.equals(o.packageId)) {
            return false;
        }
        if (this.stickerId == null) {
            if (o.stickerId != null){
                return false;
            }
        } else if (!this.stickerId.equals(o.stickerId)) {
            return false;
        }
        if (this.text == null) {
            if (o.text != null){
                return false;
            }
        } else if (!this.text.equals(o.text)) {
            return false;
        }
        if (this.validityPeriod == null) {
            if (o.validityPeriod != null){
                return false;
            }
        } else if (!this.validityPeriod.equals(o.validityPeriod)) {
            return false;
        }
        if (this.validityPeriodTimeUnit == null) {
            if (o.validityPeriodTimeUnit != null){
                return false;
            }
        } else if (!this.validityPeriodTimeUnit.equals(o.validityPeriodTimeUnit)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "LineData{" +
            "type='" + type + "'" +
            ", url='" + url + "'" +
            ", thumbnailUrl='" + thumbnailUrl + "'" +
            ", duration='" + duration + "'" +
            ", packageId='" + packageId + "'" +
            ", stickerId='" + stickerId + "'" +
            ", text='" + text + "'" +
            ", validityPeriod='" + validityPeriod + "'" +
            ", validityPeriodTimeUnit='" + validityPeriodTimeUnit + "'" +
            '}';
    }
}