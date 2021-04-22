package guru.springframework.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Login implements Serializable {

    //private final static long serialVersionUID = 1041720428871730372L;

    private String userName;
    private String password;
    private String md5;
    private String sha1;
    private String sha256;
}
