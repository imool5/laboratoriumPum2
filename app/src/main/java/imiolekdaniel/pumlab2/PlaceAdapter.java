package imiolekdaniel.pumlab2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by Daniel on 20.12.2017.
 */



    public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder>{

    private ArrayList<Place> places = new ArrayList<>();
    private Context context;

    public PlaceAdapter(ArrayList<Place> places) {
        this.places = places;
    }

    @Override
        public PlaceAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(PlaceAdapter.ViewHolder holder, int position) {
            holder.setPlaceName(places.get(position).getPlaceName());
        }

        @Override
        public int getItemCount() {
            return 0;
        }

       public class ViewHolder extends RecyclerView.ViewHolder {

           @BindView(R.id.)
           TextView placeName;

           public void setPlaceName(String placeName) {
               this.placeName.setText(placeName);
           }
       }
    }

