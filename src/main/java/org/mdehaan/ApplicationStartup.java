package org.mdehaan;

import org.mdehaan.model.User;
import org.mdehaan.repository.UserRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import static java.util.Objects.requireNonNull;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent>
{
    private final UserRepository userRepository;

    public ApplicationStartup(UserRepository userRepository)
    {
        this.userRepository = requireNonNull(userRepository);
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent)
    {
        if (!userRepository.existsById("repository")) {
            User admin = new User("repository", "test");
            userRepository.save(admin);
        }
    }
}
