package ua.edu.ucu.apps.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Tests {

    @Test
    public void testFacebookUserAdapter() {
        
        FacebookUser facebookUser = new FacebookUser("test_facebook@email.com", "Ukraine", "2024-12-05T10:00:00");
        FacebookUserAdapter facebookUserAdapter = new FacebookUserAdapter(facebookUser);

        
        assertEquals("test_facebook@email.com", facebookUserAdapter.getEmail());
        assertEquals("Ukraine", facebookUserAdapter.getCountry());
        assertEquals("2024-12-05T10:00:00", facebookUserAdapter.getActiveTime());
    }

    @Test
    public void testTwitterUserAdapter() {
        
        TwitterUser twitterUser = new TwitterUser("test_twitter@email.com", "USA", "2024-12-05T12:00:00");
        TwitterUserAdapter twitterUserAdapter = new TwitterUserAdapter(twitterUser);

        
        assertEquals("test_twitter@email.com", twitterUserAdapter.getEmail());
        assertEquals("USA", twitterUserAdapter.getCountry());
        assertEquals("2024-12-05T12:00:00", twitterUserAdapter.getActiveTime());
    }
}
