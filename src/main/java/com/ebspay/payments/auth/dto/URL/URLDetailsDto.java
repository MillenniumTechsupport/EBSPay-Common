package com.ebspay.payments.auth.dto.URL;

import com.ebspay.payments.auth.models.URL.URLDetails;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class URLDetailsDto {

    private int urlId;

    private String urlValue;

    private String urlKey;

    private String urlSecret;

    private String urlType;

    private int partyId;

    private String urlVendor;

    private String country;

    private String urlDescription;

    public URLDetailsDto(URLDetails urlDetails) {
        this.urlId = urlDetails.getUrlId();
        this.urlValue = urlDetails.getUrlValue();
        this.urlKey = urlDetails.getUrlKey();
        this.urlSecret = urlDetails.getUrlSecret();
        this.urlType = urlDetails.getUrlType();
        this.partyId = urlDetails.getPartyId();
        this.urlVendor = urlDetails.getUrlVendor();
        this.country = urlDetails.getCountry();
        this.urlDescription = urlDetails.getUrlDescription();
    }
}
