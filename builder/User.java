public class User {

    private final String userId;
    private final String username;
    private final String emailId;

    private User(UserBuilder builder) {
        this.userId = builder.userId;
        this.username = builder.username;
        this.emailId = builder.emailId;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return this.username + ":" + this.userId + ":" + this.emailId;
    }

    // ✅ Correct inner class
    public static class UserBuilder {
        private String userId;
        private String username;
        private String emailId;

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
