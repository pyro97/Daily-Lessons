package pyroapp.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class tab6 extends Fragment {

    private String lunMateriaS="",lunClasseS="",lunOrarioS="",lun1MateriaS="",lun1ClasseS="",lun1OrarioS="",lun2MateriaS="",lun2ClasseS="",lun2OrarioS=""
            ,lun3MateriaS="",lun3ClasseS="",lun3OrarioS="",lun4MateriaS="",lun4ClasseS="",lun4OrarioS="";
    private  String temp="",temp1="",temp2="";
    private int count=0;
    private String selection;
    private int scelto;
    private CharSequence sequence;



    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        final View myview5=inflater.inflate(R.layout.tab6_frag,container,false);

        //inizializzare le preferenze da salvare
        Context context5 = getActivity();
        final SharedPreferences sharedPreferences5=context5.getSharedPreferences("sharedPreferences5", Context.MODE_PRIVATE);;

        //bottoni
       final FloatingActionButton b15= myview5.findViewById(R.id.fabio5);
        final FloatingActionButton b16= myview5.findViewById(R.id.fab13);
        final FloatingActionButton b17=myview5.findViewById(R.id.fab14);
        final Button sabOrarioV=myview5.findViewById(R.id.sabOrario);
        final Button sab1OrarioV=myview5.findViewById(R.id.sab1Orario);
        final Button sab2OrarioV=myview5.findViewById(R.id.sab2Orario);
        final Button sab3OrarioV=myview5.findViewById(R.id.sab3Orario);
        final Button sab4OrarioV=myview5.findViewById(R.id.sab4Orario);
        //testi
        final TextView sabMateriaV=myview5.findViewById(R.id.sabMateria);
        final TextView sabClasseV=myview5.findViewById(R.id.sabClasse);
        final TextView sab1MateriaV=myview5.findViewById(R.id.sab1Materia);
        final TextView sab1ClasseV=myview5.findViewById(R.id.sab1Classe);
        final TextView sab2MateriaV=myview5.findViewById(R.id.sab2Materia);
        final TextView sab2ClasseV=myview5.findViewById(R.id.sab2Classe);
        final TextView sab3MateriaV=myview5.findViewById(R.id.sab3Materia);
        final TextView sab3ClasseV=myview5.findViewById(R.id.sab3Classe);
        final TextView sab4MateriaV=myview5.findViewById(R.id.sab4Materia);
        final TextView sab4ClasseV=myview5.findViewById(R.id.sab4Classe);





        lunMateriaS=sharedPreferences5.getString("lunMateriaS",lunMateriaS);
        lunClasseS=sharedPreferences5.getString("lunClasseS",lunClasseS);
        lunOrarioS=sharedPreferences5.getString("lunOrarioS",lunOrarioS);

        lun1MateriaS=sharedPreferences5.getString("lun1MateriaS",lun1MateriaS);
        lun1ClasseS=sharedPreferences5.getString("lun1ClasseS",lun1ClasseS);
        lun1OrarioS=sharedPreferences5.getString("lun1OrarioS",lun1OrarioS);

        lun2MateriaS=sharedPreferences5.getString("lun2MateriaS",lun2MateriaS);
        lun2ClasseS=sharedPreferences5.getString("lun2ClasseS",lun2ClasseS);
        lun2OrarioS=sharedPreferences5.getString("lun2OrarioS",lun2OrarioS);

        lun3MateriaS=sharedPreferences5.getString("lun3MateriaS",lun3MateriaS);
        lun3ClasseS=sharedPreferences5.getString("lun3ClasseS",lun3ClasseS);
        lun3OrarioS=sharedPreferences5.getString("lun3OrarioS",lun3OrarioS);

        lun4MateriaS=sharedPreferences5.getString("lun4MateriaS",lun4MateriaS);
        lun4ClasseS=sharedPreferences5.getString("lun4ClasseS",lun4ClasseS);
        lun4OrarioS=sharedPreferences5.getString("lun4OrarioS",lun4OrarioS);



        sabMateriaV.setText(lunMateriaS);
        sabClasseV.setText(lunClasseS);
        sabOrarioV.setText(lunOrarioS);

        sab1MateriaV.setText(lun1MateriaS);
        sab1ClasseV.setText(lun1ClasseS);
        sab1OrarioV.setText(lun1OrarioS);

        sab2MateriaV.setText(lun2MateriaS);
        sab2ClasseV.setText(lun2ClasseS);
        sab2OrarioV.setText(lun2OrarioS);

        sab3MateriaV.setText(lun3MateriaS);
        sab3ClasseV.setText(lun3ClasseS);
        sab3OrarioV.setText(lun3OrarioS);

        sab4MateriaV.setText(lun4MateriaS);
        sab4ClasseV.setText(lun4ClasseS);
        sab4OrarioV.setText(lun4OrarioS);

       if(lunMateriaS.length()==0){

            sabMateriaV.setVisibility(myview5.INVISIBLE);
            sabClasseV.setVisibility(myview5.INVISIBLE);
            sabOrarioV.setVisibility(myview5.INVISIBLE);
        }
        else    count++;
        if(lun1MateriaS.length()==0){

            sab1MateriaV.setVisibility(myview5.INVISIBLE);
            sab1ClasseV.setVisibility(myview5.INVISIBLE);
            sab1OrarioV.setVisibility(myview5.INVISIBLE);
        }
        else count++;

        if(lun2MateriaS.length()==0){

            sab2MateriaV.setVisibility(myview5.INVISIBLE);
            sab2ClasseV.setVisibility(myview5.INVISIBLE);
            sab2OrarioV.setVisibility(myview5.INVISIBLE);
        }
        else    count++;

        if(lun3MateriaS.length()==0){

            sab3MateriaV.setVisibility(myview5.INVISIBLE);
            sab3ClasseV.setVisibility(myview5.INVISIBLE);
            sab3OrarioV.setVisibility(myview5.INVISIBLE);
        }
        else    count++;

        if(lun4MateriaS.length()==0){

            sab4MateriaV.setVisibility(myview5.INVISIBLE);
            sab4ClasseV.setVisibility(myview5.INVISIBLE);
            sab4OrarioV.setVisibility(myview5.INVISIBLE);
        }
        else    count++;




        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder=new AlertDialog.Builder(getContext());
                LinearLayout layout = new LinearLayout(getContext());
                layout.setOrientation(LinearLayout.VERTICAL);
                if(count==5){
                    builder.setTitle("Warning");
                    builder.setMessage("The fields are full");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    builder.show();
                }
                else{
                    builder.setTitle("                  New Lesson");
                    final TextView text =new TextView(getContext());
                    final EditText input =new EditText(getContext());
                    final TextView text1 =new TextView(getContext());
                    final EditText input1=new EditText(getContext());
                    final TextView text2 =new TextView(getContext());
                    final EditText input2 =new EditText(getContext());
                    input2.setInputType(InputType.TYPE_CLASS_DATETIME);
                    text.setTextColor(getResources().getColor(R.color.colorAccent));
                    text.setText("  Subject");
                    text1.setText("  Classroom");
                    text1.setTextColor(getResources().getColor(R.color.colorAccent));
                    text2.setText("  Time");
                    text2.setTextColor(getResources().getColor(R.color.colorAccent));

                    layout.addView(text);
                    layout.addView(input);
                    layout.addView(text1);
                    layout.addView(input1);
                    layout.addView(text2);
                    layout.addView(input2);
                    builder.setView(layout);

                    builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {


                            temp=input.getText().toString();
                            temp1=input1.getText().toString();
                            temp2=input2.getText().toString();

                            if(temp.length()==0){
                                dialog.cancel();
                                AlertDialog.Builder builder1=new AlertDialog.Builder(getContext());
                                builder1.setTitle("Warning");
                                builder1.setMessage("The 'Subject' parameter can't be empty!");
                                builder1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog1, int which) {
                                        dialog1.cancel();
                                    }
                                });
                                builder1.show();
                            }
                            else{
                                count++;
                                if(lunMateriaS.length()==0){
                                    lunMateriaS=temp;
                                    lunClasseS=temp1;
                                    lunOrarioS=temp2;

                                    sabMateriaV.setText(lunMateriaS);
                                    sabClasseV.setText(lunClasseS);
                                    sabOrarioV.setText(lunOrarioS);


                                    SharedPreferences.Editor edit = sharedPreferences5.edit();
                                    edit.putString("lunClasseS",lunClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                    edit1.putString("lunMateriaS",lunMateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                    edit2.putString("lunOrarioS",lunOrarioS);
                                    edit2.commit();




                                    sabMateriaV.setVisibility(View.VISIBLE);
                                    sabClasseV.setVisibility(View.VISIBLE);
                                    sabOrarioV.setVisibility(View.VISIBLE);
                                }
                                else if(lun1MateriaS.length()==0){

                                    lun1MateriaS=temp;
                                    lun1ClasseS=temp1;
                                    lun1OrarioS=temp2;

                                    sab1MateriaV.setText(lun1MateriaS);
                                    sab1ClasseV.setText(lun1ClasseS);
                                    sab1OrarioV.setText(lun1OrarioS);

                                    SharedPreferences.Editor edit = sharedPreferences5.edit();
                                    edit.putString("lun1ClasseS",lun1ClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                    edit1.putString("lun1MateriaS",lun1MateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                    edit2.putString("lun1OrarioS",lun1OrarioS);
                                    edit2.commit();





                                    sab1MateriaV.setVisibility(View.VISIBLE);
                                    sab1ClasseV.setVisibility(View.VISIBLE);
                                    sab1OrarioV.setVisibility(View.VISIBLE);
                                }

                                else if(lun2MateriaS.length()==0){

                                    lun2MateriaS=temp;
                                    lun2ClasseS=temp1;
                                    lun2OrarioS=temp2;

                                    sab2MateriaV.setText(lun2MateriaS);
                                    sab2ClasseV.setText(lun2ClasseS);
                                    sab2OrarioV.setText(lun2OrarioS);

                                    SharedPreferences.Editor edit = sharedPreferences5.edit();
                                    edit.putString("lun2ClasseS",lun2ClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                    edit1.putString("lun2MateriaS",lun2MateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                    edit2.putString("lun2OrarioS",lun2OrarioS);
                                    edit2.commit();





                                    sab2MateriaV.setVisibility(View.VISIBLE);
                                    sab2ClasseV.setVisibility(View.VISIBLE);
                                    sab2OrarioV.setVisibility(View.VISIBLE);
                                }

                                else if(lun3MateriaS.length()==0){
                                    lun3MateriaS=temp;
                                    lun3ClasseS=temp1;
                                    lun3OrarioS=temp2;

                                    sab3MateriaV.setText(lun3MateriaS);
                                    sab3ClasseV.setText(lun3ClasseS);
                                    sab3OrarioV.setText(lun3OrarioS);


                                    SharedPreferences.Editor edit = sharedPreferences5.edit();
                                    edit.putString("lun3ClasseS",lun3ClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                    edit1.putString("lun3MateriaS",lun3MateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                    edit2.putString("lun3OrarioS",lun3OrarioS);
                                    edit2.commit();




                                    sab3MateriaV.setVisibility(View.VISIBLE);
                                    sab3ClasseV.setVisibility(View.VISIBLE);
                                    sab3OrarioV.setVisibility(View.VISIBLE);
                                }

                               else if(lun4MateriaS.length()==0){
                                    lun4MateriaS=temp;
                                    lun4ClasseS=temp1;
                                    lun4OrarioS=temp2;

                                    sab4MateriaV.setText(lun4MateriaS);
                                    sab4ClasseV.setText(lun4ClasseS);
                                    sab4OrarioV.setText(lun4OrarioS);


                                    SharedPreferences.Editor edit = sharedPreferences5.edit();
                                    edit.putString("lun4ClasseS",lun4ClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                    edit1.putString("lun4MateriaS",lun4MateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                    edit2.putString("lun4OrarioS",lun4OrarioS);
                                    edit2.commit();




                                    sab4MateriaV.setVisibility(View.VISIBLE);
                                    sab4ClasseV.setVisibility(View.VISIBLE);
                                    sab4OrarioV.setVisibility(View.VISIBLE);
                                }

                            }






                            dialog.cancel();
                        }
                    });
                    builder.show();
                }

            }
        });


        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final CharSequence[] sequence={"","","","",""};

                if(count==1){
                    sequence[0]=lunMateriaS;
                    sequence[1]="";
                    sequence[2]="";
                    sequence[3]="";
                    sequence[4]="";

                }
                else if(count==2){
                    sequence[0]=lunMateriaS;
                    sequence[1]=lun1MateriaS;
                    sequence[2]="";
                    sequence[3]="";
                    sequence[4]="";

                }
                else if(count==3){
                    sequence[0]=lunMateriaS;
                    sequence[1]=lun1MateriaS;
                    sequence[2]=lun2MateriaS;
                    sequence[3]="";
                    sequence[4]="";

                }
                else if(count==4){
                    sequence[0]=lunMateriaS;
                    sequence[1]=lun1MateriaS;
                    sequence[2]=lun2MateriaS;
                    sequence[3]=lun3MateriaS;
                    sequence[4]="";

                }
                else if(count==5){
                    sequence[0]=lunMateriaS;
                    sequence[1]=lun1MateriaS;
                    sequence[2]=lun2MateriaS;
                    sequence[3]=lun3MateriaS;
                    sequence[4]=lun4MateriaS;

                }

                if(count==0){
                    AlertDialog.Builder builder=new AlertDialog.Builder(getContext());
                    builder.setTitle("No selectable lesson");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    builder.show();
                }
                else{
                    final AlertDialog.Builder builder=new AlertDialog.Builder(getContext());



                    builder.setTitle("Select a lesson to edit it");
                    builder.setSingleChoiceItems(sequence, -1, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which){
                                case 0: selection=(String) sequence[which];
                                scelto=1;
                                    break;
                                case 1: selection=(String) sequence[which];
                                    scelto=2;
                                    break;
                                case 2: selection=(String) sequence[which];
                                    scelto=3;
                                    break;
                                case 3: selection=(String) sequence[which];
                                    scelto=4;
                                    break;
                                case 4: selection=(String) sequence[which];
                                    scelto=5;
                                    break;
                            }
                        }
                    });


                    builder.setPositiveButton("Next", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            if(selection.length()==0){
                                dialog.cancel();
                                AlertDialog.Builder builder2=new AlertDialog.Builder(getContext());
                                builder2.setTitle("Warning");
                                builder2.setMessage("Select an existing lesson");
                                builder2.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog1, int which) {
                                        dialog1.cancel();
                                    }
                                });
                                builder2.show();
                            }
                            else{
                                AlertDialog.Builder builder1=new AlertDialog.Builder(getContext());
                                LinearLayout layout = new LinearLayout(getContext());

                                layout.setOrientation(LinearLayout.VERTICAL);

                                final TextView text =new TextView(getContext());
                                final EditText input =new EditText(getContext());
                                final TextView text1 =new TextView(getContext());
                                final EditText input1=new EditText(getContext());
                                final TextView text2 =new TextView(getContext());
                                final EditText input2 =new EditText(getContext());
                                input2.setInputType(InputType.TYPE_CLASS_DATETIME);
                                text.setTextColor(getResources().getColor(R.color.colorAccent));
                                text.setText("  Subject");
                                text1.setText("  Classroom");
                                text1.setTextColor(getResources().getColor(R.color.colorAccent));
                                text2.setText("  Time");
                                text2.setTextColor(getResources().getColor(R.color.colorAccent));
                                if(scelto==1){
                                    input.setText(lunMateriaS);
                                    input1.setText(lunClasseS);
                                    input2.setText(lunOrarioS);
                                }
                                else if(scelto==2){
                                    input.setText(lun1MateriaS);
                                    input1.setText(lun1ClasseS);
                                    input2.setText(lun1OrarioS);
                                }
                                else if(scelto==3){
                                    input.setText(lun2MateriaS);
                                    input1.setText(lun2ClasseS);
                                    input2.setText(lun2OrarioS);
                                }
                                else if(scelto==4){
                                    input.setText(lun3MateriaS);
                                    input1.setText(lun3ClasseS);
                                    input2.setText(lun3OrarioS);
                                }
                                else if(scelto==5){
                                    input.setText(lun4MateriaS);
                                    input1.setText(lun4ClasseS);
                                    input2.setText(lun4OrarioS);
                                }
                                layout.addView(text);
                                layout.addView(input);
                                layout.addView(text1);
                                layout.addView(input1);
                                layout.addView(text2);
                                layout.addView(input2);
                                builder1.setTitle("               Edit parameters");
                                builder1.setView(layout);
                                builder1.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        if(input.getText().toString().length()==0){
                                            dialog.cancel();
                                            AlertDialog.Builder builder3=new AlertDialog.Builder(getContext());
                                            builder3.setTitle("Warning");
                                            builder3.setMessage("The 'Subject' parameter can't be empty!");
                                            builder3.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog1, int which) {
                                                    dialog1.cancel();
                                                }
                                            });
                                            builder3.show();
                                        }
                                        else{

                                            if(scelto==1){
                                                lunMateriaS=input.getText().toString();
                                                lunClasseS=input1.getText().toString();
                                                lunOrarioS=input2.getText().toString();

                                                sabMateriaV.setText(lunMateriaS);
                                                sabClasseV.setText(lunClasseS);
                                                sabOrarioV.setText(lunOrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences5.edit();
                                                edit.putString("lunClasseS",lunClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                                edit1.putString("lunMateriaS",lunMateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                                edit2.putString("lunOrarioS",lunOrarioS);
                                                edit2.commit();
                                            }
                                            else if(scelto==2){
                                                lun1MateriaS=input.getText().toString();
                                                lun1ClasseS=input1.getText().toString();
                                                lun1OrarioS=input2.getText().toString();

                                                sab1MateriaV.setText(lun1MateriaS);
                                                sab1ClasseV.setText(lun1ClasseS);
                                                sab1OrarioV.setText(lun1OrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences5.edit();
                                                edit.putString("lun1ClasseS",lun1ClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                                edit1.putString("lun1MateriaS",lun1MateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                                edit2.putString("lun1OrarioS",lun1OrarioS);
                                                edit2.commit();
                                            }

                                           else if(scelto==3){
                                                lun2MateriaS=input.getText().toString();
                                                lun2ClasseS=input1.getText().toString();
                                                lun2OrarioS=input2.getText().toString();

                                                sab2MateriaV.setText(lun2MateriaS);
                                                sab2ClasseV.setText(lun2ClasseS);
                                                sab2OrarioV.setText(lun2OrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences5.edit();
                                                edit.putString("lun2ClasseS",lun2ClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                                edit1.putString("lun2MateriaS",lun2MateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                                edit2.putString("lun2OrarioS",lun2OrarioS);
                                                edit2.commit();
                                            }
                                           else if(scelto==4){
                                                lun3MateriaS=input.getText().toString();
                                                lun3ClasseS=input1.getText().toString();
                                                lun3OrarioS=input2.getText().toString();

                                                sab3MateriaV.setText(lun3MateriaS);
                                                sab3ClasseV.setText(lun3ClasseS);
                                                sab3OrarioV.setText(lun3OrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences5.edit();
                                                edit.putString("lun3ClasseS",lun3ClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                                edit1.putString("lun3MateriaS",lun3MateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                                edit2.putString("lun3OrarioS",lun3OrarioS);
                                                edit2.commit();
                                            }
                                            if(scelto==5){
                                                lun4MateriaS=input.getText().toString();
                                                lun4ClasseS=input1.getText().toString();
                                                lun4OrarioS=input2.getText().toString();

                                                sab4MateriaV.setText(lun4MateriaS);
                                                sab4ClasseV.setText(lun4ClasseS);
                                                sab4OrarioV.setText(lun4OrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences5.edit();
                                                edit.putString("lun4ClasseS",lun4ClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                                edit1.putString("lun4MateriaS",lun4MateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                                edit2.putString("lun4OrarioS",lun4OrarioS);
                                                edit2.commit();
                                            }
                                        }



                                        dialog.cancel();
                                    }
                                });
                                builder1.show();
                            }


                        }
                    });
                    builder.show();
                }



            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final CharSequence[] sequence={"","","","",""};

                if(count==1){
                    sequence[0]=lunMateriaS;
                    sequence[1]="";
                    sequence[2]="";
                    sequence[3]="";
                    sequence[4]="";

                }
                else if(count==2){
                    sequence[0]=lunMateriaS;
                    sequence[1]=lun1MateriaS;
                    sequence[2]="";
                    sequence[3]="";
                    sequence[4]="";

                }
                else if(count==3){
                    sequence[0]=lunMateriaS;
                    sequence[1]=lun1MateriaS;
                    sequence[2]=lun2MateriaS;
                    sequence[3]="";
                    sequence[4]="";

                }
                else if(count==4){
                    sequence[0]=lunMateriaS;
                    sequence[1]=lun1MateriaS;
                    sequence[2]=lun2MateriaS;
                    sequence[3]=lun3MateriaS;
                    sequence[4]="";

                }
                else if(count==5){
                    sequence[0]=lunMateriaS;
                    sequence[1]=lun1MateriaS;
                    sequence[2]=lun2MateriaS;
                    sequence[3]=lun3MateriaS;
                    sequence[4]=lun4MateriaS;

                }

                if(count==0){
                    AlertDialog.Builder builder=new AlertDialog.Builder(getContext());
                    builder.setTitle("No selectable lesson");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    builder.show();
                }
                else{
                    final AlertDialog.Builder builder=new AlertDialog.Builder(getContext());



                    builder.setTitle("Select a lesson to delete it");
                    builder.setSingleChoiceItems(sequence, -1, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which){
                                case 0: selection=(String) sequence[which];
                                    scelto=1;
                                    break;
                                case 1: selection=(String) sequence[which];
                                    scelto=2;
                                    break;
                                case 2: selection=(String) sequence[which];
                                    scelto=3;
                                    break;
                                case 3: selection=(String) sequence[which];
                                    scelto=4;
                                    break;
                                case 4: selection=(String) sequence[which];
                                    scelto=5;
                                    break;

                            }
                        }
                    });


                    builder.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            if (selection.length() == 0) {
                                dialog.cancel();
                                AlertDialog.Builder builder2 = new AlertDialog.Builder(getContext());
                                builder2.setTitle("Warning");
                                builder2.setMessage("Select an existing lesson");
                                builder2.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog1, int which) {
                                        dialog1.cancel();
                                    }
                                });
                                builder2.show();
                            } else {

                                dialog.cancel();
                                if(count==1){
                                    count--;

                                    lunMateriaS="";
                                    lunClasseS="";
                                    lunOrarioS="";

                                    sabMateriaV.setText(lunMateriaS);
                                    sabClasseV.setText(lunClasseS);
                                    sabOrarioV.setText(lunOrarioS);

                                    SharedPreferences.Editor edit = sharedPreferences5.edit();
                                    edit.putString("lunClasseS",lunClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                    edit1.putString("lunMateriaS",lunMateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                    edit2.putString("lunOrarioS",lunOrarioS);
                                    edit2.commit();

                                    sabMateriaV.setVisibility(myview5.INVISIBLE);
                                    sabClasseV.setVisibility(myview5.INVISIBLE);
                                    sabOrarioV.setVisibility(myview5.INVISIBLE);

                                }
                                else if (count==2){
                                    count--;
                                    if (scelto == 1) {
                                        lunMateriaS=lun1MateriaS;
                                        lunClasseS=lun1ClasseS;
                                        lunOrarioS=lun1OrarioS;

                                        lun1MateriaS="";
                                        lun1ClasseS="";
                                        lun1OrarioS="";

                                        sabMateriaV.setText(lunMateriaS);
                                        sabClasseV.setText(lunClasseS);
                                        sabOrarioV.setText(lunOrarioS);

                                        sab1MateriaV.setText(lun1MateriaS);
                                        sab1ClasseV.setText(lun1ClasseS);
                                        sab1OrarioV.setText(lun1OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences5.edit();
                                        edit.putString("lunClasseS",lunClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                        edit1.putString("lunMateriaS",lunMateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                        edit2.putString("lunOrarioS",lunOrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences5.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences5.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences5.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        sab1MateriaV.setVisibility(myview5.INVISIBLE);
                                        sab1ClasseV.setVisibility(myview5.INVISIBLE);
                                        sab1OrarioV.setVisibility(myview5.INVISIBLE);
                                    } else if (scelto == 2) {

                                        lun1MateriaS="";
                                        lun1ClasseS="";
                                        lun1OrarioS="";

                                        sab1MateriaV.setText(lun1MateriaS);
                                        sab1ClasseV.setText(lun1ClasseS);
                                        sab1OrarioV.setText(lun1OrarioS);

                                        SharedPreferences.Editor edit3 = sharedPreferences5.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences5.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences5.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        sab1MateriaV.setVisibility(myview5.INVISIBLE);
                                        sab1ClasseV.setVisibility(myview5.INVISIBLE);
                                        sab1OrarioV.setVisibility(myview5.INVISIBLE);
                                    }
                                }
                                else if(count==3){
                                    count--;
                                    if (scelto == 1) {
                                        lunMateriaS=lun1MateriaS;
                                        lunClasseS=lun1ClasseS;
                                        lunOrarioS=lun1OrarioS;

                                        lun1MateriaS=lun2MateriaS;
                                        lun1ClasseS=lun2ClasseS;
                                        lun1OrarioS=lun2OrarioS;

                                        lun2MateriaS="";
                                        lun2ClasseS="";
                                        lun2OrarioS="";

                                        sabMateriaV.setText(lunMateriaS);
                                        sabClasseV.setText(lunClasseS);
                                        sabOrarioV.setText(lunOrarioS);

                                        sab1MateriaV.setText(lun1MateriaS);
                                        sab1ClasseV.setText(lun1ClasseS);
                                        sab1OrarioV.setText(lun1OrarioS);

                                        sab2MateriaV.setText(lun2MateriaS);
                                        sab2ClasseV.setText(lun2ClasseS);
                                        sab2OrarioV.setText(lun2OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences5.edit();
                                        edit.putString("lunClasseS",lunClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                        edit1.putString("lunMateriaS",lunMateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                        edit2.putString("lunOrarioS",lunOrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences5.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences5.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences5.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        SharedPreferences.Editor edit6 = sharedPreferences5.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences5.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences5.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();

                                        sab2MateriaV.setVisibility(myview5.INVISIBLE);
                                        sab2ClasseV.setVisibility(myview5.INVISIBLE);
                                        sab2OrarioV.setVisibility(myview5.INVISIBLE);
                                    } else if (scelto == 2) {
                                        lun1MateriaS=lun2MateriaS;
                                        lun1ClasseS=lun2ClasseS;
                                        lun1OrarioS=lun2OrarioS;

                                        lun2MateriaS="";
                                        lun2ClasseS="";
                                        lun2OrarioS="";

                                        sab1MateriaV.setText(lun1MateriaS);
                                        sab1ClasseV.setText(lun1ClasseS);
                                        sab1OrarioV.setText(lun1OrarioS);

                                        sab2MateriaV.setText(lun2MateriaS);
                                        sab2ClasseV.setText(lun2ClasseS);
                                        sab2OrarioV.setText(lun2OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences5.edit();
                                        edit.putString("lun1ClasseS",lun1ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                        edit1.putString("lun1MateriaS",lun1MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                        edit2.putString("lun1OrarioS",lun1OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit6 = sharedPreferences5.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences5.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences5.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();

                                        sab2MateriaV.setVisibility(myview5.INVISIBLE);
                                        sab2ClasseV.setVisibility(myview5.INVISIBLE);
                                        sab2OrarioV.setVisibility(myview5.INVISIBLE);
                                    }
                                    else if(scelto==3){

                                        lun2MateriaS="";
                                        lun2ClasseS="";
                                        lun2OrarioS="";

                                        sab2MateriaV.setText(lun2MateriaS);
                                        sab2ClasseV.setText(lun2ClasseS);
                                        sab2OrarioV.setText(lun2OrarioS);

                                        SharedPreferences.Editor edit6 = sharedPreferences5.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences5.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences5.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();


                                        sab2MateriaV.setVisibility(myview5.INVISIBLE);
                                        sab2ClasseV.setVisibility(myview5.INVISIBLE);
                                        sab2OrarioV.setVisibility(myview5.INVISIBLE);
                                    }

                                }
                                else if(count==4){
                                    count--;
                                    if(scelto==1){
                                        lunMateriaS=lun1MateriaS;
                                        lunClasseS=lun1ClasseS;
                                        lunOrarioS=lun1OrarioS;

                                        lun1MateriaS=lun2MateriaS;
                                        lun1ClasseS=lun2ClasseS;
                                        lun1OrarioS=lun2OrarioS;

                                        lun2MateriaS=lun3MateriaS;
                                        lun2ClasseS=lun3ClasseS;
                                        lun2OrarioS=lun3OrarioS;

                                        lun3MateriaS="";
                                        lun3ClasseS="";
                                        lun3OrarioS="";

                                        sabMateriaV.setText(lunMateriaS);
                                        sabClasseV.setText(lunClasseS);
                                        sabOrarioV.setText(lunOrarioS);

                                        sab1MateriaV.setText(lun1MateriaS);
                                        sab1ClasseV.setText(lun1ClasseS);
                                        sab1OrarioV.setText(lun1OrarioS);

                                        sab2MateriaV.setText(lun2MateriaS);
                                        sab2ClasseV.setText(lun2ClasseS);
                                        sab2OrarioV.setText(lun2OrarioS);

                                        sab3MateriaV.setText(lun3MateriaS);
                                        sab3ClasseV.setText(lun3ClasseS);
                                        sab3OrarioV.setText(lun3OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences5.edit();
                                        edit.putString("lunClasseS",lunClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                        edit1.putString("lunMateriaS",lunMateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                        edit2.putString("lunOrarioS",lunOrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences5.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences5.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences5.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        SharedPreferences.Editor edit6 = sharedPreferences5.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences5.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences5.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();

                                        SharedPreferences.Editor edit9 = sharedPreferences5.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences5.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences5.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        sab3MateriaV.setVisibility(myview5.INVISIBLE);
                                        sab3ClasseV.setVisibility(myview5.INVISIBLE);
                                        sab3OrarioV.setVisibility(myview5.INVISIBLE);
                                    }
                                    else if(scelto==2){
                                        lun1MateriaS=lun2MateriaS;
                                        lun1ClasseS=lun2ClasseS;
                                        lun1OrarioS=lun2OrarioS;

                                        lun2MateriaS=lun3MateriaS;
                                        lun2ClasseS=lun3ClasseS;
                                        lun2OrarioS=lun3OrarioS;

                                        lun3MateriaS="";
                                        lun3ClasseS="";
                                        lun3OrarioS="";


                                        sab1MateriaV.setText(lun1MateriaS);
                                        sab1ClasseV.setText(lun1ClasseS);
                                        sab1OrarioV.setText(lun1OrarioS);

                                        sab2MateriaV.setText(lun2MateriaS);
                                        sab2ClasseV.setText(lun2ClasseS);
                                        sab2OrarioV.setText(lun2OrarioS);

                                        sab3MateriaV.setText(lun3MateriaS);
                                        sab3ClasseV.setText(lun3ClasseS);
                                        sab3OrarioV.setText(lun3OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences5.edit();
                                        edit.putString("lun1ClasseS",lun1ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                        edit1.putString("lun1MateriaS",lun1MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                        edit2.putString("lun1OrarioS",lun1OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences5.edit();
                                        edit3.putString("lun2ClasseS",lun2ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences5.edit();
                                        edit4.putString("lun2MateriaS",lun2MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences5.edit();
                                        edit5.putString("lun2OrarioS",lun2OrarioS);
                                        edit5.commit();

                                        SharedPreferences.Editor edit9 = sharedPreferences5.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences5.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences5.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        sab3MateriaV.setVisibility(myview5.INVISIBLE);
                                        sab3ClasseV.setVisibility(myview5.INVISIBLE);
                                        sab3OrarioV.setVisibility(myview5.INVISIBLE);
                                    }
                                    else if(scelto==3){
                                        lun2MateriaS=lun3MateriaS;
                                        lun2ClasseS=lun3ClasseS;
                                        lun2OrarioS=lun3OrarioS;

                                        lun3MateriaS="";
                                        lun3ClasseS="";
                                        lun3OrarioS="";

                                        sab2MateriaV.setText(lun2MateriaS);
                                        sab2ClasseV.setText(lun2ClasseS);
                                        sab2OrarioV.setText(lun2OrarioS);

                                        sab3MateriaV.setText(lun3MateriaS);
                                        sab3ClasseV.setText(lun3ClasseS);
                                        sab3OrarioV.setText(lun3OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences5.edit();
                                        edit.putString("lun2ClasseS",lun2ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                        edit1.putString("lun2MateriaS",lun2MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                        edit2.putString("lun2OrarioS",lun2OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit9 = sharedPreferences5.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences5.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences5.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        sab3MateriaV.setVisibility(myview5.INVISIBLE);
                                        sab3ClasseV.setVisibility(myview5.INVISIBLE);
                                        sab3OrarioV.setVisibility(myview5.INVISIBLE);
                                    }
                                    else if(scelto==4){
                                        lun3MateriaS="";
                                        lun3ClasseS="";
                                        lun3OrarioS="";

                                        sab3MateriaV.setText(lun3MateriaS);
                                        sab3ClasseV.setText(lun3ClasseS);
                                        sab3OrarioV.setText(lun3OrarioS);

                                        SharedPreferences.Editor edit9 = sharedPreferences5.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences5.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences5.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();


                                        sab3MateriaV.setVisibility(myview5.INVISIBLE);
                                        sab3ClasseV.setVisibility(myview5.INVISIBLE);
                                        sab3OrarioV.setVisibility(myview5.INVISIBLE);
                                    }


                                }
                                else if(count==5){
                                    count--;
                                    if(scelto==1){
                                        lunMateriaS=lun1MateriaS;
                                        lunClasseS=lun1ClasseS;
                                        lunOrarioS=lun1OrarioS;

                                        lun1MateriaS=lun2MateriaS;
                                        lun1ClasseS=lun2ClasseS;
                                        lun1OrarioS=lun2OrarioS;

                                        lun2MateriaS=lun3MateriaS;
                                        lun2ClasseS=lun3ClasseS;
                                        lun2OrarioS=lun3OrarioS;

                                        lun3MateriaS=lun4MateriaS;
                                        lun3ClasseS=lun4ClasseS;
                                        lun3OrarioS=lun4OrarioS;

                                        lun4MateriaS="";
                                        lun4ClasseS="";
                                        lun4OrarioS="";

                                        sabMateriaV.setText(lunMateriaS);
                                        sabClasseV.setText(lunClasseS);
                                        sabOrarioV.setText(lunOrarioS);

                                        sab1MateriaV.setText(lun1MateriaS);
                                        sab1ClasseV.setText(lun1ClasseS);
                                        sab1OrarioV.setText(lun1OrarioS);

                                        sab2MateriaV.setText(lun2MateriaS);
                                        sab2ClasseV.setText(lun2ClasseS);
                                        sab2OrarioV.setText(lun2OrarioS);

                                        sab3MateriaV.setText(lun3MateriaS);
                                        sab3ClasseV.setText(lun3ClasseS);
                                        sab3OrarioV.setText(lun3OrarioS);

                                        sab4MateriaV.setText(lun4MateriaS);
                                        sab4ClasseV.setText(lun4ClasseS);
                                        sab4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences5.edit();
                                        edit.putString("lunClasseS",lunClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                        edit1.putString("lunMateriaS",lunMateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                        edit2.putString("lunOrarioS",lunOrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences5.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences5.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences5.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        SharedPreferences.Editor edit6 = sharedPreferences5.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences5.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences5.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();

                                        SharedPreferences.Editor edit9 = sharedPreferences5.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences5.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences5.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        SharedPreferences.Editor edit12 = sharedPreferences5.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences5.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences5.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();

                                        sab4MateriaV.setVisibility(myview5.INVISIBLE);
                                        sab4ClasseV.setVisibility(myview5.INVISIBLE);
                                        sab4OrarioV.setVisibility(myview5.INVISIBLE);
                                    }
                                    else if(scelto==2){
                                        lun1MateriaS=lun2MateriaS;
                                        lun1ClasseS=lun2ClasseS;
                                        lun1OrarioS=lun2OrarioS;

                                        lun2MateriaS=lun3MateriaS;
                                        lun2ClasseS=lun3ClasseS;
                                        lun2OrarioS=lun3OrarioS;

                                        lun3MateriaS=lun4MateriaS;
                                        lun3ClasseS=lun4ClasseS;
                                        lun3OrarioS=lun4OrarioS;

                                        lun4MateriaS="";
                                        lun4ClasseS="";
                                        lun4OrarioS="";

                                        sab1MateriaV.setText(lun1MateriaS);
                                        sab1ClasseV.setText(lun1ClasseS);
                                        sab1OrarioV.setText(lun1OrarioS);

                                        sab2MateriaV.setText(lun2MateriaS);
                                        sab2ClasseV.setText(lun2ClasseS);
                                        sab2OrarioV.setText(lun2OrarioS);

                                        sab3MateriaV.setText(lun3MateriaS);
                                        sab3ClasseV.setText(lun3ClasseS);
                                        sab3OrarioV.setText(lun3OrarioS);

                                        sab4MateriaV.setText(lun4MateriaS);
                                        sab4ClasseV.setText(lun4ClasseS);
                                        sab4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences5.edit();
                                        edit.putString("lun1ClasseS",lun1ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                        edit1.putString("lun1MateriaS",lun1MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                        edit2.putString("lun1OrarioS",lun1OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences5.edit();
                                        edit3.putString("lun2ClasseS",lun2ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences5.edit();
                                        edit4.putString("lun2MateriaS",lun2MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences5.edit();
                                        edit5.putString("lun2OrarioS",lun2OrarioS);
                                        edit5.commit();


                                        SharedPreferences.Editor edit9 = sharedPreferences5.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences5.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences5.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        SharedPreferences.Editor edit12 = sharedPreferences5.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences5.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences5.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();

                                        sab4MateriaV.setVisibility(myview5.INVISIBLE);
                                        sab4ClasseV.setVisibility(myview5.INVISIBLE);
                                        sab4OrarioV.setVisibility(myview5.INVISIBLE);
                                    }
                                    else if(scelto==3){

                                        lun2MateriaS=lun3MateriaS;
                                        lun2ClasseS=lun3ClasseS;
                                        lun2OrarioS=lun3OrarioS;
                                        lun3MateriaS=lun4MateriaS;
                                        lun3ClasseS=lun4ClasseS;
                                        lun3OrarioS=lun4OrarioS;
                                        lun4MateriaS="";
                                        lun4ClasseS="";
                                        lun4OrarioS="";


                                        sab2MateriaV.setText(lun2MateriaS);
                                        sab2ClasseV.setText(lun2ClasseS);
                                        sab2OrarioV.setText(lun2OrarioS);
                                        sab3MateriaV.setText(lun3MateriaS);
                                        sab3ClasseV.setText(lun3ClasseS);
                                        sab3OrarioV.setText(lun3OrarioS);

                                        sab4MateriaV.setText(lun4MateriaS);
                                        sab4ClasseV.setText(lun4ClasseS);
                                        sab4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit3 = sharedPreferences5.edit();
                                        edit3.putString("lun2ClasseS",lun2ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences5.edit();
                                        edit4.putString("lun2MateriaS",lun2MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences5.edit();
                                        edit5.putString("lun2OrarioS",lun2OrarioS);
                                        edit5.commit();


                                        SharedPreferences.Editor edit9 = sharedPreferences5.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences5.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences5.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        SharedPreferences.Editor edit12 = sharedPreferences5.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences5.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences5.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();

                                        sab4MateriaV.setVisibility(myview5.INVISIBLE);
                                        sab4ClasseV.setVisibility(myview5.INVISIBLE);
                                        sab4OrarioV.setVisibility(myview5.INVISIBLE);

                                    }

                                    else if(scelto==4){
                                        lun3MateriaS=lun4MateriaS;
                                        lun3ClasseS=lun4ClasseS;
                                        lun3OrarioS=lun4OrarioS;

                                        lun4MateriaS="";
                                        lun4ClasseS="";
                                        lun4OrarioS="";


                                        sab3MateriaV.setText(lun3MateriaS);
                                        sab3ClasseV.setText(lun3ClasseS);
                                        sab3OrarioV.setText(lun3OrarioS);

                                        sab4MateriaV.setText(lun4MateriaS);
                                        sab4ClasseV.setText(lun4ClasseS);
                                        sab4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences5.edit();
                                        edit.putString("lun3ClasseS",lun3ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences5.edit();
                                        edit1.putString("lun3MateriaS",lun3MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences5.edit();
                                        edit2.putString("lun3OrarioS",lun3OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit12 = sharedPreferences5.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences5.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences5.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();

                                        sab4MateriaV.setVisibility(myview5.INVISIBLE);
                                        sab4ClasseV.setVisibility(myview5.INVISIBLE);
                                        sab4OrarioV.setVisibility(myview5.INVISIBLE);
                                    }
                                    else if(scelto==5){
                                        lun4MateriaS="";
                                        lun4ClasseS="";
                                        lun4OrarioS="";

                                        sab4MateriaV.setText(lun4MateriaS);
                                        sab4ClasseV.setText(lun4ClasseS);
                                        sab4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit12 = sharedPreferences5.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences5.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences5.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();


                                        sab4MateriaV.setVisibility(myview5.INVISIBLE);
                                        sab4ClasseV.setVisibility(myview5.INVISIBLE);
                                        sab4OrarioV.setVisibility(myview5.INVISIBLE);
                                    }






                                }

                            }
                        }
                            });

                    builder.show();
                }

            }
        });

        return myview5;
    }
}
