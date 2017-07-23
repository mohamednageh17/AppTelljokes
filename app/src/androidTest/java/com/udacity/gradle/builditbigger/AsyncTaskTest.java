package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest implements NetworkOperations {

    @Test
   public void testAsyncTask()throws Exception{

        try {
            EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
            endpointsAsyncTask.setNetworkOperations(this);
            endpointsAsyncTask.execute();
            String result = endpointsAsyncTask.get(10, TimeUnit.SECONDS);

            assertNotNull(result);

        }catch (Exception e){}

    }


    @Override
    public void OnReceiveData(String JsonData) {

    }
}
