package com.architecture.simplified;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/architecture/simplified/OnBoardingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "pagerPager", "Lcom/architecture/simplified/ViewPagerPager;", "pagerTransFormer", "Lcom/architecture/simplified/PagerTransformer;", "preference", "Lcom/architecture/simplified/SharedPreferenceStorage;", "getPreference", "()Lcom/architecture/simplified/SharedPreferenceStorage;", "setPreference", "(Lcom/architecture/simplified/SharedPreferenceStorage;)V", "viewModel", "Lcom/architecture/simplified/ui/slideshow/OnBoardingViewModel;", "getViewModel", "()Lcom/architecture/simplified/ui/slideshow/OnBoardingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "simplified_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class OnBoardingActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.architecture.simplified.ViewPagerPager pagerPager;
    private com.architecture.simplified.PagerTransformer pagerTransFormer;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.architecture.simplified.SharedPreferenceStorage preference;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.architecture.simplified.SharedPreferenceStorage getPreference() {
        return null;
    }
    
    public final void setPreference(@org.jetbrains.annotations.NotNull()
    com.architecture.simplified.SharedPreferenceStorage p0) {
    }
    
    private final com.architecture.simplified.ui.slideshow.OnBoardingViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public OnBoardingActivity() {
        super();
    }
}