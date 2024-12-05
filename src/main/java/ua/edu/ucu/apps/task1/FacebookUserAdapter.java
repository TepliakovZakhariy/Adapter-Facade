package ua.edu.ucu.apps.task1;

public class FacebookUserAdapter implements User {
    private FacebookUser facebookUser;

    public FacebookUserAdapter(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public String getActiveTime() {
        return facebookUser.getUserActiveTime();
    }
    
    @Override
    public String toString() {
        return "Email: " + getEmail() + "\nCountry: " + getCountry() + "\nLast active time: " + getActiveTime();
    }
}
