package ca.buthaynatune.app2.services;

import ca.buthaynatune.app2.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
   UserDto createUser(UserDto user);


   UserDto getUser(String email);

   //UserDto getUserByUserId(String userId);
}
