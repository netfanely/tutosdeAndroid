import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener{
   LinearLayout ln;
   SensorManager sm;
   Sensor sensor;
   TextView tv;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
        ln = (LinearLayout) findViewById(R.id.linear);
        tv = (TextView) findViewById(R.id.texto);
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
        sensor = sm.getDefaultSensor(Sensor.TYPE_PROXIMITY);
      //sm.registerListener(this,sensor,SensorManager.SENSOR_DELAY_NORMAL);
      //sm.registerListener(this,sensor,SensorManager.SENSOR_DELAY_UI);
   }
   
   @Override
   public boolean onCreateOptionsMenu(Menu Menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
   }
   
   @Override
   public boolean onOptionItemSelected(MenuItem item){
        int id = item.getItemId();
        
        if(id == R.id.action_settings) {
           return true;
        }
        return super.onOptionsItemSelected(item);
   }
   
   @Override
   public void onSensorChanged(SensorEvent event){
      String texto = String.valueOf(event.values[0]);
      tv.setText(texto);
       
      float valor = Float.parseFloat(texto);
      
      if (valor == 0) {
         ln.setBackgroundColor(Color.BLUE);
      }else{
         ln.setBackgroundColor(Color.YELLOW);
      }
   }   
   
   @Override 
   public void onAccuracyChanged(Sensor sensor, int accuracy){
   
   }
}
