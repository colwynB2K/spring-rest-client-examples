package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    //private final static long serialVersionUID = 27072759652739664L;

    private String gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private String phone;
    private Job job;
    private Billing billing;
    private String language;
    private String currency;
}
