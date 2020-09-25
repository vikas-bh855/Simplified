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
    topLevelClass = LaunchViewModel.class
)
public interface LaunchViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.architecture.simplified.ui.slideshow.LaunchViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(LaunchViewModel_AssistedFactory factory);
}
