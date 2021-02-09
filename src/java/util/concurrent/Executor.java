package java.util.concurrent;

/**
 *将任务提交和任务执行进行解耦
 */
public interface Executor {
    void execute(Runnable command);
}
