package ChainOfResponsibilityPattern;

public class ErrorLogProcessor extends LogProcessor{

        ErrorLogProcessor(LogProcessor nextLoggerProcessor) {
            super(nextLoggerProcessor);
        }
    
        public void log(int logLevel, String msg) {
            if(logLevel == ERROR) {
                System.out.println("ERROR: " + msg);
            }else {
                super.log(logLevel, msg);
            }
        }
}
