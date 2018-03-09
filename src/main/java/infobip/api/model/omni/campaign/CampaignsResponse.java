package infobip.api.model.omni.campaign;

import infobip.api.model.omni.campaign.Campaign;
import java.util.List;
import java.util.ArrayList;

/**
 * This is a generated class and is not intended for modification!
 */
public class CampaignsResponse {
    private List<Campaign> campaigns = new ArrayList<>();
    private Long campaignCount;

    public CampaignsResponse() {
    }

    public List<Campaign> getCampaigns() {
        return this.campaigns;
    }

    public CampaignsResponse setCampaigns(List<Campaign> campaigns) {
        this.campaigns = campaigns;
        return this;
    }

    public Long getCampaignCount() {
        return this.campaignCount;
    }

    public CampaignsResponse setCampaignCount(Long campaignCount) {
        this.campaignCount = campaignCount;
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

        CampaignsResponse o = (CampaignsResponse)obj;
        if (this.campaigns == null) {
            if (o.campaigns != null){
                return false;
            }
        } else if (!this.campaigns.equals(o.campaigns)) {
            return false;
        }
        if (this.campaignCount == null) {
            if (o.campaignCount != null){
                return false;
            }
        } else if (!this.campaignCount.equals(o.campaignCount)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "CampaignsResponse{" +
            "campaigns='" + campaigns + "'" +
            ", campaignCount='" + campaignCount + "'" +
            '}';
    }
}