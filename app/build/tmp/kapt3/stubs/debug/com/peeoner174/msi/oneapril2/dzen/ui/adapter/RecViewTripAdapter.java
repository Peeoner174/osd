package com.peeoner174.msi.oneapril2.dzen.ui.adapter;

import java.lang.System;

/**
 * * Adapter - \u043f\u0430\u0442\u0442\u0435\u0440\u043d \u043f\u0440\u043e\u0435\u043a\u0442\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f \u0434\u043b\u044f \u0441\u0432\u044f\u0437\u044b\u0432\u0430\u043d\u0438\u044f \u0434\u0430\u043d\u043d\u044b\u0445 \u0441 \u043f\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u043b\u0435\u043d\u0438\u0435\u043c
 * * \u041e\u0431\u044f\u0437\u0430\u043d\u043d\u043e\u0441\u0442\u0438 adapter`\u0430 \u0432 recyclerView:
 * * ********\u0441\u043e\u0437\u0434\u0430\u043d\u0438\u0435 ViewHolder\u2019\u043e\u0432
 * * ********\u0437\u0430\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0435 ViewHolder\u2019\u043e\u0432 \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u0435\u0439
 * * ********\u0443\u0432\u0435\u0434\u043e\u043c\u043b\u0435\u043d\u0438\u0435 RecyclerView \u043e \u0442\u043e\u043c \u043a\u0430\u043a\u0438\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u044b \u0438\u0437\u043c\u0435\u043d\u0438\u043b\u0438\u0441\u044c.
 * * ********\u043e\u0431\u0440\u0430\u0431\u043e\u0442\u043a\u0430 \u043a\u0430\u0441\u0430\u043d\u0438\u0439
 * * ********\u0447\u0430\u0441\u0442\u0438\u0447\u043d\u043e\u0435 \u043e\u0431\u043d\u043e\u0432\u043b\u0435\u043d\u0438\u0435 \u0434\u0430\u043d\u043d\u044b\u0445
 * * ********\u0443\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e\u043c ViewType\u2019\u043e\u0432
 * * ********\u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044f \u043e \u043f\u0435\u0440\u0435\u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0438 ViewHolder\u2019\u0430
 * * [Adapter] \u041f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u0443\u0435\u0442 \u0441\u043f\u0438\u0441\u043e\u043a \u043e\u0431\u044a\u0435\u043a\u0442\u043e\u0432 \u0443\u043a\u0430\u0437\u0430\u043d\u043d\u043e\u0433\u043e \u0442\u0438\u043f\u0430,
 * * \u0432 \u043d\u0430\u0441\u043b\u0435\u0434\u043d\u0438\u043a\u043e\u0432 [View] \u0434\u043b\u044f \u043e\u0442\u0440\u0438\u0441\u043e\u0432\u043a\u0438
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\u0014\u0010\u001a\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/peeoner174/msi/oneapril2/dzen/ui/adapter/RecViewTripAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/peeoner174/msi/oneapril2/dzen/ui/adapter/RecViewTripAdapter$TripViewHolder;", "trips", "Ljava/util/ArrayList;", "Lcom/peeoner174/msi/oneapril2/dzen/data/model/Trip;", "Lkotlin/collections/ArrayList;", "mCtx", "Landroid/content/Context;", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "openGallery", "strUrl", "", "tripId", "openNotes", "strNUrl", "updateData", "", "TripViewHolder", "app_debug"})
public final class RecViewTripAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.peeoner174.msi.oneapril2.dzen.ui.adapter.RecViewTripAdapter.TripViewHolder> {
    private final java.util.ArrayList<com.peeoner174.msi.oneapril2.dzen.data.model.Trip> trips = null;
    private final android.content.Context mCtx = null;
    
    /**
     * * @return \u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432 \u0434\u043b\u044f \u043e\u0442\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u044f
     */
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    /**
     * * \u0421\u043e\u0437\u0434\u0430\u0451\u0442 [RecyclerView.ViewHolder] \u043a\u043e\u0442\u043e\u0440\u044b\u0439 \u0445\u0440\u0430\u043d\u0438\u0442 \u0432 \u0441\u0435\u0431\u0435 [View] \u0434\u043b\u044f \u043f\u0435\u0440\u0435\u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f
     *     * @param parent \u0441\u0441\u044b\u043b\u043a\u0430 \u043d\u0430 \u043a\u043e\u043d\u0442\u0435\u0439\u043d\u0435\u0440 \u0432 \u043a\u043e\u0442\u043e\u0440\u043e\u043c \u0431\u0443\u0434\u0443\u0442 \u0445\u0440\u0430\u043d\u0438\u0442\u0441\u044f [View]
     *     * @param viewType \u0442\u0438\u043f \u0441\u043e\u0437\u0434\u0430\u0432\u0430\u0435\u043c\u043e\u0433\u043e \u043a\u043e\u043d\u0442\u0435\u043d\u0442\u0430, \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u044f\u0435\u0442\u0441\u044f \u0432 \u043c\u0435\u0442\u043e\u0434\u0435 [RecyclerView.Adapter.getItemViewType]
     *     * @return ViewHolder \u0441 View \u0432\u043d\u0443\u0442\u0440\u0438
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.peeoner174.msi.oneapril2.dzen.ui.adapter.RecViewTripAdapter.TripViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    /**
     * * \u0412\u044b\u0441\u0442\u0430\u0432\u043b\u044f\u0435\u043c \u0434\u0430\u043d\u043d\u044b\u0435 \u0432 [View]
     *     * \u043b\u0438\u0431\u043e \u043e\u0431\u043d\u043e\u0432\u043b\u044f\u0435\u043c \u0432 \u0441\u043b\u0443\u0447\u0430\u0435 \u0435\u0441\u043b\u0438 [View] \u0443\u0436\u0435 \u0431\u044b\u043b \u0441\u043e\u0437\u0434\u0430\u043d
     *     * \u044d\u0442\u043e \u043d\u0443\u0436\u043d\u043e \u043e\u0431\u044f\u0437\u0430\u0442\u0435\u043b\u044c\u043d\u043e \u0438\u043c\u0435\u0442\u044c \u0432\u0432\u0438\u0434\u0443 \u0442.\u043a. [RecyclerView.ViewHolder]
     *     * \u0445\u0440\u0430\u043d\u0438\u0442 \u0432 \u0441\u0435\u0431\u0435 [View] \u0432 \u043f\u043e\u0441\u043b\u0435\u0434\u043d\u0435\u043c \u0435\u0451 \u0441\u043e\u0441\u0442\u043e\u044f\u043d\u0438\u0438
     *     * @param holder \u043e\u0431\u044a\u0435\u043a\u0442 \u043a\u043e\u0442\u043e\u0440\u044b\u0439 \u0445\u0440\u0430\u043d\u0438\u0442 \u0432 \u0441\u0435\u0431\u0435 [View]
     *     * @param position \u043f\u043e\u0437\u0438\u0446\u0438\u044f \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430 \u0432 \u0441\u043f\u0438\u0441\u043a\u0435
     */
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.peeoner174.msi.oneapril2.dzen.ui.adapter.RecViewTripAdapter.TripViewHolder holder, int position) {
    }
    
    private final void openNotes(java.lang.String strNUrl) {
    }
    
    private final void openGallery(java.lang.String strUrl, java.lang.String tripId) {
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.peeoner174.msi.oneapril2.dzen.data.model.Trip> trips) {
    }
    
    public RecViewTripAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.peeoner174.msi.oneapril2.dzen.data.model.Trip> trips, @org.jetbrains.annotations.NotNull()
    android.content.Context mCtx) {
        super();
    }
    
    /**
     * * \u041a\u043b\u0430\u0441\u0441 \u0434\u043b\u044f \u0445\u0440\u0430\u043d\u0435\u043d\u0438\u044f \u0441\u0441\u044b\u043b\u043a\u0438 \u043d\u0430 [View]
     *     * \u043d\u0443\u0436\u0435\u043d \u0434\u043b\u044f \u0442\u043e\u0433\u043e \u0447\u0442\u043e-\u0431\u044b [RecyclerView]
     *     * \u043c\u043e\u0433 \u043f\u0435\u0440\u0435\u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0432\u0430\u0442\u044c [View]
     *     * \u0434\u043b\u044f \u044d\u0444\u0435\u043a\u0442\u0438\u0432\u043d\u043e\u0433\u043e \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u044f \u043f\u0430\u043c\u044f\u0442\u0438
     */
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/peeoner174/msi/oneapril2/dzen/ui/adapter/RecViewTripAdapter$TripViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "button", "Landroid/widget/ImageButton;", "getButton", "()Landroid/widget/ImageButton;", "targetImageView", "Landroid/widget/ImageView;", "getTargetImageView", "()Landroid/widget/ImageView;", "userImageView", "getUserImageView", "bind", "", "trip", "Lcom/peeoner174/msi/oneapril2/dzen/data/model/Trip;", "app_debug"})
    public static final class TripViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageButton button = null;
        
        /**
         * [itemView] - \u043f\u043e\u043b\u0435 ViewHolder`\u0430 \u0433\u0434\u0435 \u0445\u0440\u0430\u043d\u0438\u0442\u044c\u0441\u044f View \u0442\u0435\u043a\u0443\u0449\u0435\u0439 \u044f\u0449\u0435\u0439\u043a\u0438
         *         * 
         */
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView targetImageView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView userImageView = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageButton getButton() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getTargetImageView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getUserImageView() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.peeoner174.msi.oneapril2.dzen.data.model.Trip trip) {
        }
        
        public TripViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}