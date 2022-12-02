package ee.service2school.domain.user;

import ee.service2school.business.login.LoginResponse;
import ee.service2school.business.login.UserRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {


    @Mapping(source = "id", target = "userId")
    LoginResponse toLoginResponse(User user);

    User toEntity(UserRequest request);
}
