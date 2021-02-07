package dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HttpBinDto implements JsonDto {

    private String url;
    @JsonProperty(value = "origin")
    private String origem;

    public String getUrl() {
        return url;
    }

    public String getOrigem() {
        return origem;
    }
}
