package ru.ave.javacore.oop;

public class SOLIDLesson {

    public static void main(String[] args) {

    }

}

class UserService {

    UserReader userReader;
    Logger logger;

    UserService (UserReader userReader, Logger logger) {
        this.userReader = userReader;
        this.logger = logger;
    }

    public void saveUser(String user) {
        System.out.println("Save user to...");
        logger.log();

    }

    public void loadUser() {
        userReader.loadUser();
        logger.log();
    }
}

interface UserReader {

    void loadUser();

}

class FileUserReader implements UserReader {

    Logger logger;

    FileUserReader(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void loadUser() {
        System.out.println("load user from file");
        logger.log();
    }


}

interface Logger {
    void log();
}

class LoggerToFile implements Logger {

    public void log() {
        System.out.println("log to file");
    }

}
