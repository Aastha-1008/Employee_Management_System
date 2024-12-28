package employee_management.webapp.Service;

import employee_management.webapp.DTO.UserRegistrationDto;
import employee_management.webapp.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
