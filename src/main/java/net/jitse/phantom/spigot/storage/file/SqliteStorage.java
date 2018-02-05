package net.jitse.phantom.spigot.storage.file;

import net.jitse.api.account.Account;
import net.jitse.api.storage.AccountField;
import net.jitse.api.storage.AccountStorage;
import net.jitse.api.storage.AuthStorage;

import java.util.UUID;

public class SqliteStorage implements AccountStorage, AuthStorage {

    @Override
    public boolean createStorage() {
        return false;
    }

    @Override
    public boolean testStorage() {
        return false;
    }

    @Override
    public Account getAccount(UUID uuid) {
        return null;
    }

    @Override
    public boolean storeAccount(Account account) {
        return false;
    }

    @Override
    public boolean isOperational() {
        return false;
    }

    @Override
    public void update(UUID uuid, AccountField field, Object value) {

    }

    @Override
    public String getHashedAuthenticator(UUID uuid) {
        return null;
    }

    @Override
    public boolean storeHash(UUID uuid, String hash) {
        return false;
    }
}
