package example;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class MyModule extends AbstractModule {

  @Override
  protected void configure() {
    // other binds
  }

  @Provides
  public Hello provideHello() {
    // create a complex instance
    return new Hello(100, 200, 300);
  }

}
