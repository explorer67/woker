//package homework_woker;

public class Woker {
    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    @FunctionalInterface
    public interface OnTaskErrorListener{
        void onError(String error);
    }

    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener errorCallback;

    public Woker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for(int i = 0; i < 100; i++) {
            if( i == 32){
                errorCallback.onError("Task " + i + " is not done");
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}
