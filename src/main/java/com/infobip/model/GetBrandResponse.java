package com.infobip.model;

import java.util.List;

public class GetBrandResponse {
    private List<BrandResponse> results;
    private Paging paging;

    // Getters and setters
    public List<BrandResponse> getResults() {
        return results;
    }

    public void setResults(List<BrandResponse> results) {
        this.results = results;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }
}
