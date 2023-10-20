package edu.hw2;

public class Task3 {

    public interface Connection extends AutoCloseable {
        void execute(String command);
    }

    public interface ConnectionManager {
        Connection getConnection();
    }

    public class ConnectionException extends RuntimeException {}

    public final class PopularCommandExecutor {
        private final ConnectionManager manager;
        private final int maxAttempts;

        public void updatePackages() {
            tryExecute("apt update && apt upgrade -y");
        }

        void tryExecute(String command) { ... }
    }

}

