package com.architecture.simplified.ui.slideshow;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class OnBoardingViewModel_AssistedFactory implements ViewModelAssistedFactory<OnBoardingViewModel> {
  @Inject
  OnBoardingViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public OnBoardingViewModel create(@NonNull SavedStateHandle arg0) {
    return new OnBoardingViewModel();
  }
}
