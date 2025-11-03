package com.kidson.app.hello;

import com.kidson.app.BackendApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = BackendApplication.class)
class HelloControllerTest {

    @Autowired
    private HelloController helloController;

    @Test
    void contextLoads() {
        assertThat(helloController).isNotNull();
    }

    @Test
    void sayHello_ReturnsExpected() {
        String response = helloController.sayHello();
        assertThat(response).isEqualTo("Hello, KidsOn!");
    }
}