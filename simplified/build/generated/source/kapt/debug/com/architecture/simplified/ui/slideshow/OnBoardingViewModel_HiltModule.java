package com.architecture.simplified.ui.slideshow;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = OnBoardingViewModel.class
)
public interface OnBoardingViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.architecture.simplified.ui.slideshow.OnBoardingViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(OnBoardingViewModel_AssistedFactory factory);
}
