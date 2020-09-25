package com.architecture.simplified;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class OnBoardingActivity_MembersInjector implements MembersInjector<OnBoardingActivity> {
  private final Provider<SharedPreferenceStorage> preferenceProvider;

  public OnBoardingActivity_MembersInjector(Provider<SharedPreferenceStorage> preferenceProvider) {
    this.preferenceProvider = preferenceProvider;
  }

  public static MembersInjector<OnBoardingActivity> create(
      Provider<SharedPreferenceStorage> preferenceProvider) {
    return new OnBoardingActivity_MembersInjector(preferenceProvider);
  }

  @Override
  public void injectMembers(OnBoardingActivity instance) {
    injectPreference(instance, preferenceProvider.get());
  }

  @InjectedFieldSignature("com.architecture.simplified.OnBoardingActivity.preference")
  public static void injectPreference(OnBoardingActivity instance,
      SharedPreferenceStorage preference) {
    instance.preference = preference;
  }
}
