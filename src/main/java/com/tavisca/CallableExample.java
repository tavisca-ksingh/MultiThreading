package com.tavisca;

import javax.xml.ws.Service;
import java.lang.invoke.SerializedLambda;
import java.util.concurrent.*;
/*
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
*/

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Double> f = service.submit((new AreaOfCircle(4)));
        Future<Double> f2 = service.submit(new CircumferenceOfCircle(4.5));
        System.out.println("area : " + f.get());
        System.out.println("circumference : " + f2.get());
        service.shutdown();
    }
}

class AreaOfCircle implements  Callable<Double>{
    double rad = 0.0;
    AreaOfCircle(double rad){
        this.rad = rad;
    }


    @Override
    public Double call() throws Exception {
        return Math.PI * rad * rad;
    }
}

class  CircumferenceOfCircle implements Callable<Double> {
    double rad = 0.0;
    CircumferenceOfCircle(double d){
        rad = d;
    }


    @Override
    public Double call() throws Exception  {
        return  2 * Math.PI  * rad;
    }
}
