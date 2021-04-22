package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Billing implements Serializable {

    private Card card;
    private String iban;
    private String swift;
}
