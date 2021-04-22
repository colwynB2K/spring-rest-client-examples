package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Job implements Serializable {

    private String title;
    private String company;
}
