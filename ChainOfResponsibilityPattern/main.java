package ChainOfResponsibilityPattern;

public class main {
    public static void main(String[] args) {
        
        LogProcessor logObj = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        
        logObj.log(LogProcessor.ERROR, "Exception occured");
        logObj.log(LogProcessor.DEBUG, "Debugging...");
        logObj.log(LogProcessor.INFO, "Info msg");
    }
}
