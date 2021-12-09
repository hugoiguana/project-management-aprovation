package com.hugo.mota.projectmanagementaprovation.service;

import com.hugo.mota.projectmanagementaprovation.config.secutiry.JWTUtil;
import com.hugo.mota.projectmanagementaprovation.config.secutiry.UserSecurity;
import com.hugo.mota.projectmanagementaprovation.domain.ProfileEnum;
import com.hugo.mota.projectmanagementaprovation.domain.UserSystemEntity;
import com.hugo.mota.projectmanagementaprovation.repository.UserSystemEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserSystemEntityRepository employeeRepository;

    @Autowired
    private JWTUtil jwtUtil;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<UserSystemEntity> employeeOptional = employeeRepository.findByEmail(email);
        UserSystemEntity employee = employeeOptional.orElseThrow(() -> new UsernameNotFoundException(email));
        return new UserSecurity(employee.getId(), employee.getEmail(), employee.getPassword(), Arrays.asList(ProfileEnum.toEnum(employee.getProfile())));
    }

    public UserSecurity authenticated() {
        try {
            return (UserSecurity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        } catch (Exception e) {
            return null;
        }
    }

    public UsernamePasswordAuthenticationToken getAuthentication(String token) {
        if (jwtUtil.tokenValido(token)) {
            String userName = jwtUtil.getUserName(token);
            UserDetails user = loadUserByUsername(userName);
            return new UsernamePasswordAuthenticationToken(user, user.getAuthorities(), user.getAuthorities());
        }
        return null;
    }
}
