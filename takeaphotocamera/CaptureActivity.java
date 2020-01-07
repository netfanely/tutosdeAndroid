/*
youtube: https://www.youtube.com/watch?v=l2vBKhhk10s
latincoder - Programacion Android - Tomar foto de la camara y visualizar en imageview
*/

@Override
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_capture);
    init();
}

private void init(){
    this.capBtn = (Button)findViewById(R.id.btnCaptura);
    this.capBtn.setOnClickListener(this);
    
    this.tempImg = (ImageView)findViewById(R.id.captureImg);
    return true;
}

@Override
public void onClick(View v){

    int source = v.getId();
    switch(source)
    {
    case R.id.btnCaptura:
      i = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
      startActivityforResult(i, cameraData);
      break:
     }
   }
   
 @Override
 protected void onActivityResult(int requestCode, int resultCode, Intent data)
 {
    super.onActivityResult(requestCode, resultCode, data);
    if(resultCode == Activity.RESULT_OK)
    {
        Bundle ext = data.getExtra();
 /*   }
 }*/
