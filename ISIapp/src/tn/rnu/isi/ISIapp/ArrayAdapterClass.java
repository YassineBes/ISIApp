package tn.rnu.isi.ISIapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ArrayAdapterClass extends ArrayAdapter<String> {
	private final Activity context;
	  private final String[] names;
	
	  static class ViewHolder {
		    public TextView text;
		    public ImageView image;
		  }
	
	  public ArrayAdapterClass(Activity context, String[] names) {
		    super(context, R.layout.rowitem, names);
		    this.context = context;
		    this.names = names;
		  }
	  
	  
	  
	  public View getView(int position, View convertView, ViewGroup parent) {
		    View rowView = convertView;
		    // reuse views
		    if (rowView == null) {
		      LayoutInflater inflater = context.getLayoutInflater();
		      rowView = inflater.inflate(R.layout.rowitem, null);
		      // configure view holder
		      ViewHolder viewHolder = new ViewHolder();
		      viewHolder.text = (TextView) rowView.findViewById(R.id.textView1);
		      viewHolder.image = (ImageView) rowView
		          .findViewById(R.id.imageView1);
		      rowView.setTag(viewHolder);
		    }
		    
		    ViewHolder holder = (ViewHolder) rowView.getTag();
		    String s = names[position];
		    holder.text.setText(s);
		    
		    if(s.startsWith("Emploi")){
		    	holder.image.setImageResource(R.drawable.emploi);
		    }
		    if(s.startsWith("Evenements")){
		    	holder.image.setImageResource(R.drawable.evenement);
		    }
		    if(s.startsWith("Favorie")){
		    	holder.image.setImageResource(R.drawable.favorie);
		    }
		    if(s.startsWith("Note")){
		    	holder.image.setImageResource(R.drawable.note);
		    }
		    if(s.startsWith("News")){
		    	holder.image.setImageResource(R.drawable.news);
		    }
		    
		    
		    if (s.startsWith("Windows7") || s.startsWith("iPhone")
		        || s.startsWith("Solaris")) {
		     // holder.image.setImageResource(R.drawable.no);
		    } else {
		     // holder.image.setImageResource(R.drawable.ok);
		    }

		    return rowView;
		  }

}
