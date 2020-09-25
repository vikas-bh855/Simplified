package com.architecture.simplified.ui.slideshow;

import com.architecture.simplified.SharedPreferenceStorage;
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
public final class LaunchViewModel_AssistedFactory_Factory implements Factory<LaunchViewModel_AssistedFactory> {
  private final Provider<SharedPreferenceStorage> sharedPreferenceStorageProvider;

  public LaunchViewModel_AssistedFactory_Factory(
      Provider<SharedPreferenceStorage> sharedPreferenceStorageProvider) {
    this.sharedPreferenceStorageProvider = sharedPreferenceStorageProvider;
  }

  @Override
  public LaunchViewModel_AssistedFactory get() {
    return newInstance(sharedPreferenceStorageProvider);
  }

  public static LaunchViewModel_AssistedFactory_Factory create(
      Provider<SharedPreferenceStorage> sharedPreferenceStorageProvider) {
    return new LaunchViewModel_AssistedFactory_Factory(sharedPreferenceStorageProvider);
  }

  public static LaunchViewModel_AssistedFactory newInstance(
      Provider<SharedPreferenceStorage> sharedPreferenceStorage) {
    return new LaunchViewModel_AssistedFactory(sharedPreferenceStorage);
  }
}
