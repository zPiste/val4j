package dev.piste.api.val4j.util;

import dev.piste.api.val4j.util.exceptions.LockfileNotFoundException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class Lockfile {

    private final int port;
    private final String password;

    public Lockfile() throws LockfileNotFoundException {
        String path = System.getenv("LOCALAPPDATA") + "\\Riot Games\\Riot Client\\Config\\lockfile";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String content = reader.readLine();
            String[] contents = content.split(":");
            port = Integer.parseInt(contents[2]);
            password = contents[3];
        } catch (IOException e) {
            throw new LockfileNotFoundException();
        }
    }

    public int getPort() {
        return port;
    }

    public String getPassword() {
        return password;
    }

}