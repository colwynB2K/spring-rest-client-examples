package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getUsers() {

        List<User> actualUsers = apiService.getUsers(3);

        assertEquals(4, actualUsers.size());
    }
}