package com.sqlcipherdemo;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;

import org.pgsqlite.SQLitePluginPackage;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "sqlcipherdemo";
  }

  protected List<ReactPackage> getPackages() {
    return Arrays.<ReactPackage>asList(
            new SQLitePluginPackage(this),   // register SQLite Plugin here
            new MainReactPackage());
  }
}
