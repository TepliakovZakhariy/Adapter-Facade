package ua.edu.ucu.apps.task1;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        AuthMethod authMethod = AuthMethod.TWITTER;
        User user = null;

        switch (authMethod) {
            case FACEBOOK:
                FacebookUser facebookUser = new FacebookUser("test@email", "Ukraine", LocalDateTime.now().toString());
                user = new FacebookUserAdapter(facebookUser);
                break;
        
            case TWITTER:
                TwitterUser twitterUser = new TwitterUser("test_twitter@email", "USA", LocalDateTime.now().toString());
                user = new TwitterUserAdapter(twitterUser);
                break;

            default:
                break;
        }

        MessageSender messageSender = new MessageSender();
        messageSender.send(user, "Hello!");
    }
}
