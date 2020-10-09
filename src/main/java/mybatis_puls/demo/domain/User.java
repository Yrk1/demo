package mybatis_puls.demo.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
public class User {
    private Integer id;
    private String name;
    private String pass;
}
