package com.architecture.simplified.ui.slideshow;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OnBoardingViewModel_AssistedFactory_Factory implements Factory<OnBoardingViewModel_AssistedFactory> {
  @Override
  public OnBoardingViewModel_AssistedFactory get() {
    return newInstance();
  }

  public static OnBoardingViewModel_AssistedFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OnBoardingViewModel_AssistedFactory newInstance() {
    return new OnBoardingViewModel_AssistedFactory();
  }

  private static final class InstanceHolder {
    private static final OnBoardingViewModel_AssistedFactory_Factory INSTANCE = new OnBoardingViewModel_AssistedFactory_Factory();
  }
}
