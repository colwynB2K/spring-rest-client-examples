package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Card implements Serializable {

    private String type;
    private String number;
    private ExpirationDate expirationDate;
}
