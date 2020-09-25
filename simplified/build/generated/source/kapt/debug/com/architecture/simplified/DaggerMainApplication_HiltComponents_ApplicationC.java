package com.architecture.simplified;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.architecture.simplified.ui.slideshow.LaunchViewModel_AssistedFactory;
import com.architecture.simplified.ui.slideshow.LaunchViewModel_AssistedFactory_Factory;
import com.architecture.simplified.ui.slideshow.OnBoardingViewModel_AssistedFactory;
import com.architecture.simplified.ui.slideshow.OnBoardingViewModel_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerMainApplication_HiltComponents_ApplicationC extends MainApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private DaggerMainApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public void injectMainApplication(MainApplication mainApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public MainApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMainApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MainApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MainApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MainApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements MainApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MainApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MainApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<SharedPreferenceStorage> sharedPreferenceStorageProvider;

      private volatile Provider<LaunchViewModel_AssistedFactory> launchViewModel_AssistedFactoryProvider;

      private volatile Provider<OnBoardingViewModel_AssistedFactory> onBoardingViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private SharedPreferenceStorage getSharedPreferenceStorage() {
        return new SharedPreferenceStorage(ApplicationContextModule_ProvideContextFactory.provideContext(DaggerMainApplication_HiltComponents_ApplicationC.this.applicationContextModule));
      }

      private Provider<SharedPreferenceStorage> getSharedPreferenceStorageProvider() {
        Object local = sharedPreferenceStorageProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          sharedPreferenceStorageProvider = (Provider<SharedPreferenceStorage>) local;
        }
        return (Provider<SharedPreferenceStorage>) local;
      }

      private LaunchViewModel_AssistedFactory getLaunchViewModel_AssistedFactory() {
        return LaunchViewModel_AssistedFactory_Factory.newInstance(getSharedPreferenceStorageProvider());
      }

      private Provider<LaunchViewModel_AssistedFactory> getLaunchViewModel_AssistedFactoryProvider(
          ) {
        Object local = launchViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          launchViewModel_AssistedFactoryProvider = (Provider<LaunchViewModel_AssistedFactory>) local;
        }
        return (Provider<LaunchViewModel_AssistedFactory>) local;
      }

      private Provider<OnBoardingViewModel_AssistedFactory> getOnBoardingViewModel_AssistedFactoryProvider(
          ) {
        Object local = onBoardingViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          onBoardingViewModel_AssistedFactoryProvider = (Provider<OnBoardingViewModel_AssistedFactory>) local;
        }
        return (Provider<OnBoardingViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(2).put("com.architecture.simplified.ui.slideshow.LaunchViewModel", (Provider) getLaunchViewModel_AssistedFactoryProvider()).put("com.architecture.simplified.ui.slideshow.OnBoardingViewModel", (Provider) getOnBoardingViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectLauncherActivity(LauncherActivity launcherActivity) {
      }

      @Override
      public void injectOnBoardingActivity(OnBoardingActivity onBoardingActivity) {
        injectOnBoardingActivity2(onBoardingActivity);
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private OnBoardingActivity injectOnBoardingActivity2(OnBoardingActivity instance) {
        OnBoardingActivity_MembersInjector.injectPreference(instance, getSharedPreferenceStorage());
        return instance;
      }

      private final class FragmentCBuilder implements MainApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MainApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectBuildHabitFragment(BuildHabitFragment buildHabitFragment) {
        }

        @Override
        public void injectGetAwardsFragment(GetAwardsFragment getAwardsFragment) {
        }

        @Override
        public void injectLearnLanguagesFragment(LearnLanguagesFragment learnLanguagesFragment) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements MainApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MainApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MainApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MainApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MainApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.architecture.simplified.ui.slideshow.LaunchViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getLaunchViewModel_AssistedFactory();

            case 1: // com.architecture.simplified.SharedPreferenceStorage 
            return (T) ActivityCImpl.this.getSharedPreferenceStorage();

            case 2: // com.architecture.simplified.ui.slideshow.OnBoardingViewModel_AssistedFactory 
            return (T) OnBoardingViewModel_AssistedFactory_Factory.newInstance();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MainApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MainApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
