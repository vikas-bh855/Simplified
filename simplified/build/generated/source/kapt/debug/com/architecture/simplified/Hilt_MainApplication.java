package com.architecture.simplified;

import android.app.Application;
import androidx.annotation.CallSuper;
import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.Object;
import java.lang.Override;
import javax.annotation.Generated;

/**
 * A generated base class to be extended by the @dagger.hilt.android.HiltAndroidApp annotated class. If using the Gradle plugin, this is swapped as the base class via bytecode transformation.
 */
@Generated("dagger.hilt.android.processor.internal.androidentrypoint.ApplicationGenerator")
public abstract class Hilt_MainApplication extends Application implements GeneratedComponentManager<Object> {
  private final ApplicationComponentManager componentManager = new ApplicationComponentManager(new ComponentSupplier() {
    @Override
    public Object get() {
      return DaggerMainApplication_HiltComponents_ApplicationC.builder()
          .applicationContextModule(new ApplicationContextModule(Hilt_MainApplication.this))
          .build();
    }
  });

  protected final ApplicationComponentManager componentManager() {
    return componentManager;
  }

  @Override
  public final Object generatedComponent() {
    return componentManager().generatedComponent();
  }

  @CallSuper
  @Override
  public void onCreate() {
    // This is a known unsafe cast, but is safe in the only correct use case:
    // MainApplication extends Hilt_MainApplication
    ((MainApplication_GeneratedInjector) generatedComponent()).injectMainApplication(UnsafeCasts.<MainApplication>unsafeCast(this));
    super.onCreate();
  }
}
