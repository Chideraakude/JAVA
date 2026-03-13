public class User {
    private String username;
    private String password;
    private Wallet wallet;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.wallet = new Wallet();
    }

    public boolean login(String username, String password) {
        return username.equals(username) && password.equals(password);
    }

    public Wallet getWallet() {
        return wallet;
    }

    public String getUsername() {
        return username;
    }
}
