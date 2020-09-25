package com.architecture.simplified.ui.slideshow;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/architecture/simplified/ui/slideshow/LaunchViewModel;", "Landroidx/lifecycle/ViewModel;", "sharedPreferenceStorage", "Lcom/architecture/simplified/SharedPreferenceStorage;", "(Lcom/architecture/simplified/SharedPreferenceStorage;)V", "launchDestination", "Landroidx/lifecycle/LiveData;", "Lcom/architecture/simplified/ui/slideshow/LaunchDestination;", "getLaunchDestination", "()Landroidx/lifecycle/LiveData;", "simplified_debug"})
public final class LaunchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.architecture.simplified.ui.slideshow.LaunchDestination> launchDestination = null;
    private final com.architecture.simplified.SharedPreferenceStorage sharedPreferenceStorage = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.architecture.simplified.ui.slideshow.LaunchDestination> getLaunchDestination() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public LaunchViewModel(@org.jetbrains.annotations.NotNull()
    com.architecture.simplified.SharedPreferenceStorage sharedPreferenceStorage) {
        super();
    }
}