package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class PimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello, I'm the primary greeting service";
    }
}
