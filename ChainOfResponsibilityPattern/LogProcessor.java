package ChainOfResponsibilityPattern;

public abstract class LogProcessor {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor loggerProcessor) {
        this.nextLogProcessor = loggerProcessor;
    }

    public void log(int logLevel, String msg) {
        if (nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, msg);
        }
    }
}
