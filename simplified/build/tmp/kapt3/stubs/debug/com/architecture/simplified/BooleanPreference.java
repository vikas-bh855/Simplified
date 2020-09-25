package com.architecture.simplified;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0097\u0002\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0002R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/architecture/simplified/BooleanPreference;", "Lkotlin/properties/ReadWriteProperty;", "", "", "preferences", "Lkotlin/Lazy;", "Landroid/content/SharedPreferences;", "name", "", "defaultValue", "(Lkotlin/Lazy;Ljava/lang/String;Z)V", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Boolean;", "setValue", "", "value", "simplified_debug"})
public final class BooleanPreference implements kotlin.properties.ReadWriteProperty<java.lang.Object, java.lang.Boolean> {
    private final kotlin.Lazy<android.content.SharedPreferences> preferences = null;
    private final java.lang.String name = null;
    private final boolean defaultValue = false;
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.WorkerThread()
    @java.lang.Override()
    public java.lang.Boolean getValue(@org.jetbrains.annotations.NotNull()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property) {
        return null;
    }
    
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.NotNull()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property, boolean value) {
    }
    
    public BooleanPreference(@org.jetbrains.annotations.NotNull()
    kotlin.Lazy<? extends android.content.SharedPreferences> preferences, @org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean defaultValue) {
        super();
    }
}