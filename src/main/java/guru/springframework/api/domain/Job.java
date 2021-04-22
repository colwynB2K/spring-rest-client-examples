package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Job implements Serializable {

    //private final static long serialVersionUID = -4985150429002262656L;

    private String title;
    private String company;
}
