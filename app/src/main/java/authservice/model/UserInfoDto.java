package authservice.model;

import authservice.entities.UserInfo;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class) // are use to mapping firstName to first_name
public class UserInfoDto extends UserInfo {

    private String firstName; // first_name

    private String lastName; //last_name

    private Long phoneNumber;

    private String email; // email

}
