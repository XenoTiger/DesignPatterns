public class Driver {

    public static void main(String[] args) {
        // Here we are providing chain of logs, its will check level and return result accordingly.
        LogProcessor loggerObject =
                new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        loggerObject.log(LogProcessor.ERROR, "Error Occurred");
        loggerObject.log(LogProcessor.DEBUG, "Need Debugging");
        loggerObject.log(LogProcessor.INFO, "Some Information");
    }
}
