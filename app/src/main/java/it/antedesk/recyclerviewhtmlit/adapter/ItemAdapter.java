package it.antedesk.recyclerviewhtmlit.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import it.antedesk.recyclerviewhtmlit.R;
import it.antedesk.recyclerviewhtmlit.utils.ColorUtils;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    /*
     * An on-click handler that we've defined to make it easy for an Activity to interface with
     * our RecyclerView
     */
    final private ItemClickListener mOnClickListener;

    private static int viewHolderCount;
    private int mNumberItems;
    private Context parentContex;

     /**
     * The interface that receives onClick messages.
     */
    public interface ItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }

    public ItemAdapter(int numberOfItems, ItemClickListener listener) {
        mNumberItems = numberOfItems;
        mOnClickListener = listener;
        viewHolderCount = 0;
    }


    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        parentContex = parent.getContext();
        int layoutIdForListItem = R.layout.list_item;
        LayoutInflater inflater = LayoutInflater.from(parentContex);

        View view = inflater.inflate(layoutIdForListItem, parent, false);
        ItemViewHolder holder = new ItemViewHolder(view);
        int backgroundColorForViewHolder = ColorUtils
                .getViewHolderBackgroundColorFromInstance(parentContex, viewHolderCount);
        holder.mVHIndexTV.setText("ViewHolder index: " + viewHolderCount);
        holder.itemView.setBackgroundColor(backgroundColorForViewHolder);
        viewHolderCount++;

        return holder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.bind(position);
        Picasso.get()
                .load(R.drawable.logo_open)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(holder.mIVLogp);
    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }


    class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.tv_item_number)
        TextView mListItemNumberTV;
        @BindView(R.id.tv_view_holder_index)
        TextView mVHIndexTV;
        @BindView(R.id.iv_logo)
        ImageView mIVLogp;

        public ItemViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        void bind(int listIndex) {
            mListItemNumberTV.setText(String.valueOf(listIndex));
        }

        @Override
        public void onClick(View view) {
            int clickedPosition = getAdapterPosition();
            mOnClickListener.onListItemClick(clickedPosition);
        }
    }
}
