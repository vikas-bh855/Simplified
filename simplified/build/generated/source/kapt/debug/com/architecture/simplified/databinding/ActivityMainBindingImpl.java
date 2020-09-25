package com.architecture.simplified.databinding;
import com.architecture.simplified.R;
import com.architecture.simplified.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.background_home, 1);
        sViewsWithIds.put(R.id.ivHome, 2);
        sViewsWithIds.put(R.id.tvHome, 3);
        sViewsWithIds.put(R.id.background_books, 4);
        sViewsWithIds.put(R.id.ivBooks, 5);
        sViewsWithIds.put(R.id.tvBooks, 6);
        sViewsWithIds.put(R.id.background_music, 7);
        sViewsWithIds.put(R.id.ivMusic, 8);
        sViewsWithIds.put(R.id.tvMusic, 9);
        sViewsWithIds.put(R.id.background_download, 10);
        sViewsWithIds.put(R.id.ivDownload, 11);
        sViewsWithIds.put(R.id.tvDownload, 12);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[4]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[1]
            , (android.view.View) bindings[7]
            , (androidx.constraintlayout.utils.widget.ImageFilterView) bindings[5]
            , (androidx.constraintlayout.utils.widget.ImageFilterView) bindings[11]
            , (androidx.constraintlayout.utils.widget.ImageFilterView) bindings[2]
            , (androidx.constraintlayout.utils.widget.ImageFilterView) bindings[8]
            , (androidx.constraintlayout.motion.widget.MotionLayout) bindings[0]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[9]
            );
        this.motionLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}