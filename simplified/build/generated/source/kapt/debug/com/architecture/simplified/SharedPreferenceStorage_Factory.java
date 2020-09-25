package com.architecture.simplified;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SharedPreferenceStorage_Factory implements Factory<SharedPreferenceStorage> {
  private final Provider<Context> contextProvider;

  public SharedPreferenceStorage_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferenceStorage get() {
    return newInstance(contextProvider.get());
  }

  public static SharedPreferenceStorage_Factory create(Provider<Context> contextProvider) {
    return new SharedPreferenceStorage_Factory(contextProvider);
  }

  public static SharedPreferenceStorage newInstance(Context context) {
    return new SharedPreferenceStorage(context);
  }
}
