package dev.piste.api.val4j.util.exceptions;

import java.io.FileNotFoundException;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class LockfileNotFoundException extends FileNotFoundException {

    public LockfileNotFoundException() {
        super("Lockfile not found. Please make sure the Riot Client or VALORANT is started.");
    }

}