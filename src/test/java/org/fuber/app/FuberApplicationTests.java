package org.fuber.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FuberApplication.class)
@WebIntegrationTest
public class FuberApplicationTests {
    private RestTemplate restTemplate = new RestTemplate();

    @Test
    public void testPing() throws Exception {
        String response = restTemplate.getForObject("http://localhost:8080/ping", String.class);
        assert response.equals("pong");
    }
}
