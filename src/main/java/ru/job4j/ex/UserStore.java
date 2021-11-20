package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                rsl = users[index];
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("Пользователь с именем: " + login + " не найден");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = true;
        int length = user.getUsername().length();
        if (!user.isValid() || length < 3) {
            throw new UserInvalidException("User: " + user.getUsername() + " Invalid");
        }
        return rsl;
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
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e2) {
            e2.printStackTrace();
        }
    }
}
