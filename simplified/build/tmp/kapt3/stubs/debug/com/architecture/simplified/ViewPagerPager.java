package com.architecture.simplified;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/architecture/simplified/ViewPagerPager;", "", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "viewModel", "Lcom/architecture/simplified/ui/slideshow/OnBoardingViewModel;", "(Landroidx/viewpager2/widget/ViewPager2;Lcom/architecture/simplified/ui/slideshow/OnBoardingViewModel;)V", "fastOutSlowIn", "Landroid/view/animation/Interpolator;", "kotlin.jvm.PlatformType", "imageLearn", "Landroid/widget/ImageView;", "getViewModel", "()Lcom/architecture/simplified/ui/slideshow/OnBoardingViewModel;", "advance", "", "Companion", "simplified_debug"})
public final class ViewPagerPager {
    private android.widget.ImageView imageLearn;
    private final android.view.animation.Interpolator fastOutSlowIn = null;
    private final androidx.viewpager2.widget.ViewPager2 viewPager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.architecture.simplified.ui.slideshow.OnBoardingViewModel viewModel = null;
    private static final long PAGE_CHANGE_DURATION = 800L;
    private static final long MULTI_PAGE_CHANGE_DURATION = 600L;
    public static final com.architecture.simplified.ViewPagerPager.Companion Companion = null;
    
    public final void advance() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.architecture.simplified.ui.slideshow.OnBoardingViewModel getViewModel() {
        return null;
    }
    
    public ViewPagerPager(@org.jetbrains.annotations.NotNull()
    androidx.viewpager2.widget.ViewPager2 viewPager, @org.jetbrains.annotations.NotNull()
    com.architecture.simplified.ui.slideshow.OnBoardingViewModel viewModel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/architecture/simplified/ViewPagerPager$Companion;", "", "()V", "MULTI_PAGE_CHANGE_DURATION", "", "PAGE_CHANGE_DURATION", "simplified_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}