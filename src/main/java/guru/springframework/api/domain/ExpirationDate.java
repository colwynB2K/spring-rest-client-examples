package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class ExpirationDate implements Serializable {

    private String date;
    private int timezoneType;
    private String timezone;
}
