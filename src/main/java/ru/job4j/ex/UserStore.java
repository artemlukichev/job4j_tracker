package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rls = null;
        for (int i = 0; i < users.length; i++) {
            User user = users[i];
            if (login.equals(user.getUsername())) {
                rls = user;
                break;
            }
        }
        if (rls == null) {
            new UserNotFoundException("User not found");
        }
        return rls;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            new UserInvalidException("User invalid");
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
