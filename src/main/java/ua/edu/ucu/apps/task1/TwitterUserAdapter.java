package ua.edu.ucu.apps.task1;

public class TwitterUserAdapter implements User {
    private TwitterUser twitterUser;

    public TwitterUserAdapter(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public String getActiveTime() {
        return twitterUser.getLastActiveTime();
    }

    @Override
    public String toString() {
        return "Email: " + getEmail() + "\nCountry: " + getCountry() + "\nLast active time: " + getActiveTime();
    }
}