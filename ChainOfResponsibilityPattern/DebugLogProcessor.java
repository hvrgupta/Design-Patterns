package ChainOfResponsibilityPattern;

public class DebugLogProcessor extends LogProcessor {

    DebugLogProcessor(LogProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    public void log(int logLevel, String msg) {
        if (logLevel == DEBUG) {
            System.out.println("DEBUG: " + msg);
        } else {
            super.log(logLevel, msg);
        }
    }
}