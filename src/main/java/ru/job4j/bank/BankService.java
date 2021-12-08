package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Банковский сервис
 *
 * @author ALEX MRV
 * @version 1.0
 */
public class BankService {
    /**
     * Содержит всех пользователей системы с привязанными к ним счетам.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя, при условии что такого пользователя нет
     *
     * @param user пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет новый счет к пользователю, если такой счет отсутствует
     * Пользователя ищет по пасспорту
     *
     * @param passport пасспорт пользователя
     * @param account  новый счет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод находит пользователя по пасспорту
     *
     * @param passport пасспорт пользователя
     * @return объект User or null - если объект не найден
     */
    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод ищет счет клиента
     *
     * @param passport  пользователя
     * @param requisite реквезит счета
     * @return объект Account or null - если объект не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> acc = users.get(user);
            for (Account search : acc) {
                if (search.getRequisite().equals(requisite)) {
                    account = search;
                    break;
                }
            }
        }
        return account;
    }

    /**
     * Метод переводит деньги с одного счета на другой
     *
     * @param srcPassport   паспорт пользователя с которого переводят
     * @param srcRequisite  счет пользователя с которого переводят
     * @param destPassport  паспорт пользователя куда переводят
     * @param destRequisite счет пользователя куда переводят
     * @param amount        сумма перевода
     * @return True - если перевод выполнен успешно, False - если баланс меньше сумме перевода,
     * либо счета не найдены.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null && src.getBalance() >= amount) {
            src.setBalance(src.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
