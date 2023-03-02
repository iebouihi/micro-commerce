package com.microcomm.user;


import com.microcomm.user.domaine.User;
import com.microcomm.user.repository.UserRepository;
import com.microcomm.user.service.UserService;
import com.microcomm.user.service.impl.DefaultUserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DefaultUserServiceTest {
    private UserRepository userRepository;

    @BeforeEach
    void setUpTest() {
        userRepository = mock(UserRepository.class);

    }

    @Test
    void testRegisterNewUser() {
        UserService userService = new DefaultUserService();
        User user1 = new User();
        user1.setEmail("user1@email.com");
        when(userRepository.findUserByEmail("user1@email.com")).thenReturn(user1);
        assert (user1.getEmail() == "user1@email.com");

    }

}
