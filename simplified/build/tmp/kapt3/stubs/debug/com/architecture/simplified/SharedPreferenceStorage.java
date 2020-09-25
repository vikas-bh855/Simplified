package com.architecture.simplified;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/architecture/simplified/SharedPreferenceStorage;", "Lcom/architecture/simplified/PreferenceStorage;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "<set-?>", "", "onboardingCompleted", "getOnboardingCompleted", "()Z", "setOnboardingCompleted", "(Z)V", "onboardingCompleted$delegate", "Lcom/architecture/simplified/BooleanPreference;", "prefs", "Lkotlin/Lazy;", "Landroid/content/SharedPreferences;", "Companion", "simplified_debug"})
public final class SharedPreferenceStorage implements com.architecture.simplified.PreferenceStorage {
    private final kotlin.Lazy<android.content.SharedPreferences> prefs = null;
    @org.jetbrains.annotations.NotNull()
    private final com.architecture.simplified.BooleanPreference onboardingCompleted$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFS_NAME = "simplified";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREF_ONBOARDING = "pref_onboarding";
    public static final com.architecture.simplified.SharedPreferenceStorage.Companion Companion = null;
    
    @java.lang.Override()
    public boolean getOnboardingCompleted() {
        return false;
    }
    
    @java.lang.Override()
    public void setOnboardingCompleted(boolean p0) {
    }
    
    @javax.inject.Inject()
    public SharedPreferenceStorage(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/architecture/simplified/SharedPreferenceStorage$Companion;", "", "()V", "PREFS_NAME", "", "PREF_ONBOARDING", "simplified_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}