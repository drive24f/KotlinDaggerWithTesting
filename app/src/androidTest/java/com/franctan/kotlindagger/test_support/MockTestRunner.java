package com.franctan.kotlindagger.test_support;



import com.franctan.kotlindagger.TestApp;

import android.app.Application;
import android.content.Context;
import android.support.test.runner.AndroidJUnitRunner;

public class MockTestRunner extends AndroidJUnitRunner {

  public MockTestRunner() {
    super();
    System.out.println("MockTestRunner constructor");
  }

  @Override
  public Application newApplication(ClassLoader cl, String className, Context context)
      throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    return super.newApplication(cl, TestApp.class.getName(), context);
  }
}