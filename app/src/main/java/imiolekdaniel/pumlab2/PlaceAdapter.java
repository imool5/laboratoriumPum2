package imiolekdaniel.pumlab2;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by Daniel on 20.12.2017.
 */

public class PlaceAdapter {

    public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder>{

        @Override
        public AnimalAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(AnimalAdapter.ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

       public class ViewHolder extends RecyclerView.ViewHolder {
        }
    }
}
