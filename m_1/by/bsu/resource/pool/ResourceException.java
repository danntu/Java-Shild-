package m_1.by.bsu.resource.pool;

import m_1.by.bsu.threads.ExceptionMainDemo;

public class ResourceException extends Exception{
    public ResourceException() {
        super();
    }

    public ResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceException(String message) {
        super(message);
    }

    public ResourceException(Throwable cause) {
        super(cause);
    }
}
