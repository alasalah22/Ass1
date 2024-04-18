package android.alaa.birzeit.app1;


import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String [] shapeList;
    int [] imageSolid;
    LayoutInflater inflater;
    public CustomAdapter(Context cnt , String [] shapes){
        this.context=cnt;
        this.shapeList=shapes;
        this.imageSolid=images;
        inflater= LayoutInflater.from(cnt);
    }
    @Override
    public int getCount() {
        return shapeList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}