package com.architecture.simplified.ui.slideshow;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.architecture.simplified.SharedPreferenceStorage;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class LaunchViewModel_AssistedFactory implements ViewModelAssistedFactory<LaunchViewModel> {
  private final Provider<SharedPreferenceStorage> sharedPreferenceStorage;

  @Inject
  LaunchViewModel_AssistedFactory(Provider<SharedPreferenceStorage> sharedPreferenceStorage) {
    this.sharedPreferenceStorage = sharedPreferenceStorage;
  }

  @Override
  @NonNull
  public LaunchViewModel create(@NonNull SavedStateHandle arg0) {
    return new LaunchViewModel(sharedPreferenceStorage.get());
  }
}
