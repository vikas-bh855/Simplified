package com.architecture.simplified.ui.slideshow;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/architecture/simplified/ui/slideshow/OnBoardingViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_buttonText", "Landroidx/lifecycle/MutableLiveData;", "", "_startButton", "", "buttonText", "Landroidx/lifecycle/LiveData;", "getButtonText", "()Landroidx/lifecycle/LiveData;", "startButton", "getStartButton", "advance", "", "value", "simplified_debug"})
public final class OnBoardingViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<java.lang.Object> _startButton;
    private androidx.lifecycle.MutableLiveData<java.lang.String> _buttonText;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Object> startButton = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> buttonText = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Object> getStartButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getButtonText() {
        return null;
    }
    
    public final void advance() {
    }
    
    public final void buttonText(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public OnBoardingViewModel() {
        super();
    }
}