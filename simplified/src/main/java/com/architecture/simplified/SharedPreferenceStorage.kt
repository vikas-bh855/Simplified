package com.architecture.simplified;

import android.content.Context
import android.content.SharedPreferences
import androidx.annotation.WorkerThread
import androidx.core.content.edit
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


interface PreferenceStorage {
    var onboardingCompleted: Boolean
}


@ActivityRetainedScoped
class SharedPreferenceStorage @Inject constructor(@ApplicationContext context: Context):PreferenceStorage {
    private val prefs: Lazy<SharedPreferences> = lazy {
        // Lazy to prevent IO access to main thread.
        context.applicationContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }
    override var onboardingCompleted by BooleanPreference(prefs, PREF_ONBOARDING, true)

    companion object {
        const val PREFS_NAME = "simplified"
        const val PREF_ONBOARDING = "pref_onboarding"
    }
}


class BooleanPreference(
    private val preferences: Lazy<SharedPreferences>,
    private val name: String,
    private val defaultValue: Boolean
) : ReadWriteProperty<Any, Boolean> {

    @WorkerThread
    override fun getValue(thisRef: Any, property: KProperty<*>): Boolean {
        return preferences.value.getBoolean(name, defaultValue)
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Boolean) {
        preferences.value.edit { putBoolean(name, value) }
    }


}
