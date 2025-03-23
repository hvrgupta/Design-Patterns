package ChainOfResponsibilityPattern;

public class InfoLogProcessor extends LogProcessor {

    InfoLogProcessor(LogProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    public void log(int logLevel, String msg) {
        if(logLevel == INFO) {
            System.out.println("INFO: " + msg);
        }else {
            super.log(logLevel, msg);
        }
    }
}
