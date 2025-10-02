package tn.romdhani.managementsystem.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tn.romdhani.managementsystem.entity.User;
import tn.romdhani.managementsystem.exceptions.NotFoundException;
import tn.romdhani.managementsystem.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByemail(username)
                .orElseThrow(() -> new NotFoundException("User Email Not Found"));
        return AuthUser.builder()
                .user(user)
                .build();
    }
}
