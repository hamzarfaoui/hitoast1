package hamza.arfaoui.com.hitoast;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
public class HiToast {


    public void hi (String text,Context context,int lenght) {
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.hitoast, null);
        TextView tv = (TextView) view.findViewById(R.id.txtvw);
        tv.setText(text);
        customtypeface(tv,context);
        toast.setView(view);
        toast.show();
    }

    public void danger (String text,Context context,int lenght) {
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.dangerlayout, null);
        TextView tv = (TextView) view.findViewById(R.id.txtdanger);
        tv.setText(text);
        customtypeface(tv,context);
        toast.setView(view);
        toast.show();
    }

    public void angry (String text,Context context,int lenght) {
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.angrylayout, null);
        TextView tv = (TextView) view.findViewById(R.id.txtangry);
        tv.setText(text);
        customtypeface(tv,context);
        toast.setView(view);
        toast.show();
    }

    public void love (String text,Context context,int lenght) {
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.lovelayout, null);
        TextView tv = (TextView) view.findViewById(R.id.txtlove);
        tv.setText(text);
        customtypeface(tv,context);
        toast.setView(view);
        toast.show();
    }


    public void success (String text,Context context,int lenght) {
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.successlayout, null);
        TextView tv = (TextView) view.findViewById(R.id.txtsuccess);
        tv.setText(text);
        customtypeface(tv,context);
        toast.setView(view);
        toast.show();
    }

    public void primary (String text,Context context,int lenght) {
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.primarylayout, null);
        TextView tv = (TextView) view.findViewById(R.id.txtprimary);
        tv.setText(text);
        customtypeface(tv,context);
        toast.setView(view);
        toast.show();
    }

    public void info (String text,Context context,int lenght) {
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.infolayout, null);
        TextView tv = (TextView) view.findViewById(R.id.txtinfo);
        tv.setText(text);
        customtypeface(tv,context);
        toast.setView(view);
        toast.show();
    }

    public void customtypeface(TextView tv,Context context)
    {
        Typeface custom_font = Typeface.createFromAsset(context.getAssets(), "fonts/dbplus.otf");
        tv.setTypeface(custom_font);
    }
}
