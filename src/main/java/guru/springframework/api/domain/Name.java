package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Name implements Serializable {

    private String title;
    private String first;
    private String last;
}
