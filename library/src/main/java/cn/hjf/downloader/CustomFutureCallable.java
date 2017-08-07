package cn.hjf.downloader;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/**
 * Created by huangjinfu on 2017/8/7.
 */

interface CustomFutureCallable<T> extends Callable<T> {
    RunnableFuture<T> newTaskFor();
}