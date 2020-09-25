package com.architecture.simplified.databinding;
import com.architecture.simplified.R;
import com.architecture.simplified.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class OnboardingActivityBindingImpl extends OnboardingActivityBinding implements com.architecture.simplified.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guide_actions, 3);
        sViewsWithIds.put(R.id.pager, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public OnboardingActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private OnboardingActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            , (androidx.viewpager2.widget.ViewPager2) bindings[4]
            , (com.architecture.simplified.ui.slideshow.InkPageIndicator) bindings[1]
            );
        this.getStarted.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.wormDotsIndicator.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.architecture.simplified.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.buttonText == variableId) {
            setButtonText((com.architecture.simplified.ButtonText) variable);
        }
        else if (BR.viewmodel == variableId) {
            setViewmodel((com.architecture.simplified.ui.slideshow.OnBoardingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setButtonText(@Nullable com.architecture.simplified.ButtonText ButtonText) {
        this.mButtonText = ButtonText;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.buttonText);
        super.requestRebind();
    }
    public void setViewmodel(@Nullable com.architecture.simplified.ui.slideshow.OnBoardingViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String buttonTextButtonText = null;
        com.architecture.simplified.ButtonText buttonText = mButtonText;
        com.architecture.simplified.ui.slideshow.OnBoardingViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x5L) != 0) {



                if (buttonText != null) {
                    // read buttonText.buttonText
                    buttonTextButtonText = buttonText.getButtonText();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.getStarted.setOnClickListener(mCallback1);
            this.wormDotsIndicator.setViewPager(pager);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.getStarted, buttonTextButtonText);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        com.architecture.simplified.ui.slideshow.OnBoardingViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.advance();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): buttonText
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}