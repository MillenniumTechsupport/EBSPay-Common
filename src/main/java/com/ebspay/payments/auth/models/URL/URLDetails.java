package com.ebspay.payments.auth.models.URL;

import com.ebspay.payments.auth.dto.URL.URLDetailsDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ebspay_url")
public class URLDetails {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int urlId;

    @Column(name = "url_value")
    private String urlValue;

    @Column(name = "url_key")
    private String urlKey;

    @Column(name = "url_secret")
    private String urlSecret;

    @Column(name = "url_type")
    private String urlType;

    @Column(name = "party_id")
    private int partyId;
//    @ManyToOne
//    @JoinColumn(name = "party_id", referencedColumnName = "party_id")
//    private Party party;

    @Column(name = "url_vendor")
    private String urlVendor;

    @Column(name = "country")
    private String country;

    @Column(name = "url_description")
    private String urlDescription;

    public URLDetails(URLDetailsDto urlDetailsDto) {
        this.urlId = urlDetailsDto.getUrlId();
        this.urlValue = urlDetailsDto.getUrlValue();
        this.urlKey = urlDetailsDto.getUrlKey();
        this.urlSecret = urlDetailsDto.getUrlSecret();
        this.urlType = urlDetailsDto.getUrlType();
        this.partyId = urlDetailsDto.getPartyId();
        this.urlVendor = urlDetailsDto.getUrlVendor();
        this.country = urlDetailsDto.getCountry();
        this.urlDescription = urlDetailsDto.getUrlDescription();
    }
}
