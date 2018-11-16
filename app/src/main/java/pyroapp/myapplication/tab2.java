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

public class tab2 extends Fragment {

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
        final View myview1=inflater.inflate(R.layout.tab2_frag,container,false);

        //inizializzare le preferenze da salvare
        Context context1 = getActivity();
        final SharedPreferences sharedPreferences1=context1.getSharedPreferences("sharedPreferences1", Context.MODE_PRIVATE);;

        //bottoni
       final FloatingActionButton b3= myview1.findViewById(R.id.fabio1);
        final FloatingActionButton b4= myview1.findViewById(R.id.fab5);
        final FloatingActionButton b5=myview1.findViewById(R.id.fab6);
        final Button marOrarioV=myview1.findViewById(R.id.marOrario);
        final Button mar1OrarioV=myview1.findViewById(R.id.mar1Orario);
        final Button mar2OrarioV=myview1.findViewById(R.id.mar2Orario);
        final Button mar3OrarioV=myview1.findViewById(R.id.mar3Orario);
        final Button mar4OrarioV=myview1.findViewById(R.id.mar4Orario);
        //testi
        final TextView marMateriaV=myview1.findViewById(R.id.marMateria);
        final TextView marClasseV=myview1.findViewById(R.id.marClasse);
        final TextView mar1MateriaV=myview1.findViewById(R.id.mar1Materia);
        final TextView mar1ClasseV=myview1.findViewById(R.id.mar1Classe);
        final TextView mar2MateriaV=myview1.findViewById(R.id.mar2Materia);
        final TextView mar2ClasseV=myview1.findViewById(R.id.mar2Classe);
        final TextView mar3MateriaV=myview1.findViewById(R.id.mar3Materia);
        final TextView mar3ClasseV=myview1.findViewById(R.id.mar3Classe);
        final TextView mar4MateriaV=myview1.findViewById(R.id.mar4Materia);
        final TextView mar4ClasseV=myview1.findViewById(R.id.mar4Classe);





        lunMateriaS=sharedPreferences1.getString("lunMateriaS",lunMateriaS);
        lunClasseS=sharedPreferences1.getString("lunClasseS",lunClasseS);
        lunOrarioS=sharedPreferences1.getString("lunOrarioS",lunOrarioS);

        lun1MateriaS=sharedPreferences1.getString("lun1MateriaS",lun1MateriaS);
        lun1ClasseS=sharedPreferences1.getString("lun1ClasseS",lun1ClasseS);
        lun1OrarioS=sharedPreferences1.getString("lun1OrarioS",lun1OrarioS);

        lun2MateriaS=sharedPreferences1.getString("lun2MateriaS",lun2MateriaS);
        lun2ClasseS=sharedPreferences1.getString("lun2ClasseS",lun2ClasseS);
        lun2OrarioS=sharedPreferences1.getString("lun2OrarioS",lun2OrarioS);

        lun3MateriaS=sharedPreferences1.getString("lun3MateriaS",lun3MateriaS);
        lun3ClasseS=sharedPreferences1.getString("lun3ClasseS",lun3ClasseS);
        lun3OrarioS=sharedPreferences1.getString("lun3OrarioS",lun3OrarioS);

        lun4MateriaS=sharedPreferences1.getString("lun4MateriaS",lun4MateriaS);
        lun4ClasseS=sharedPreferences1.getString("lun4ClasseS",lun4ClasseS);
        lun4OrarioS=sharedPreferences1.getString("lun4OrarioS",lun4OrarioS);



        marMateriaV.setText(lunMateriaS);
        marClasseV.setText(lunClasseS);
        marOrarioV.setText(lunOrarioS);

        mar1MateriaV.setText(lun1MateriaS);
        mar1ClasseV.setText(lun1ClasseS);
        mar1OrarioV.setText(lun1OrarioS);

        mar2MateriaV.setText(lun2MateriaS);
        mar2ClasseV.setText(lun2ClasseS);
        mar2OrarioV.setText(lun2OrarioS);

        mar3MateriaV.setText(lun3MateriaS);
        mar3ClasseV.setText(lun3ClasseS);
        mar3OrarioV.setText(lun3OrarioS);

        mar4MateriaV.setText(lun4MateriaS);
        mar4ClasseV.setText(lun4ClasseS);
        mar4OrarioV.setText(lun4OrarioS);

       if(lunMateriaS.length()==0){

            marMateriaV.setVisibility(myview1.INVISIBLE);
            marClasseV.setVisibility(myview1.INVISIBLE);
            marOrarioV.setVisibility(myview1.INVISIBLE);
        }
        else    count++;
        if(lun1MateriaS.length()==0){

            mar1MateriaV.setVisibility(myview1.INVISIBLE);
            mar1ClasseV.setVisibility(myview1.INVISIBLE);
            mar1OrarioV.setVisibility(myview1.INVISIBLE);
        }
        else count++;

        if(lun2MateriaS.length()==0){

            mar2MateriaV.setVisibility(myview1.INVISIBLE);
            mar2ClasseV.setVisibility(myview1.INVISIBLE);
            mar2OrarioV.setVisibility(myview1.INVISIBLE);
        }
        else    count++;

        if(lun3MateriaS.length()==0){

            mar3MateriaV.setVisibility(myview1.INVISIBLE);
            mar3ClasseV.setVisibility(myview1.INVISIBLE);
            mar3OrarioV.setVisibility(myview1.INVISIBLE);
        }
        else    count++;

        if(lun4MateriaS.length()==0){

            mar4MateriaV.setVisibility(myview1.INVISIBLE);
            mar4ClasseV.setVisibility(myview1.INVISIBLE);
            mar4OrarioV.setVisibility(myview1.INVISIBLE);
        }
        else    count++;




        b3.setOnClickListener(new View.OnClickListener() {
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

                                    marMateriaV.setText(lunMateriaS);
                                    marClasseV.setText(lunClasseS);
                                    marOrarioV.setText(lunOrarioS);


                                    SharedPreferences.Editor edit = sharedPreferences1.edit();
                                    edit.putString("lunClasseS",lunClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                    edit1.putString("lunMateriaS",lunMateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                    edit2.putString("lunOrarioS",lunOrarioS);
                                    edit2.commit();




                                    marMateriaV.setVisibility(View.VISIBLE);
                                    marClasseV.setVisibility(View.VISIBLE);
                                    marOrarioV.setVisibility(View.VISIBLE);
                                }
                                else if(lun1MateriaS.length()==0){

                                    lun1MateriaS=temp;
                                    lun1ClasseS=temp1;
                                    lun1OrarioS=temp2;

                                    mar1MateriaV.setText(lun1MateriaS);
                                    mar1ClasseV.setText(lun1ClasseS);
                                    mar1OrarioV.setText(lun1OrarioS);

                                    SharedPreferences.Editor edit = sharedPreferences1.edit();
                                    edit.putString("lun1ClasseS",lun1ClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                    edit1.putString("lun1MateriaS",lun1MateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                    edit2.putString("lun1OrarioS",lun1OrarioS);
                                    edit2.commit();





                                    mar1MateriaV.setVisibility(View.VISIBLE);
                                    mar1ClasseV.setVisibility(View.VISIBLE);
                                    mar1OrarioV.setVisibility(View.VISIBLE);
                                }

                                else if(lun2MateriaS.length()==0){

                                    lun2MateriaS=temp;
                                    lun2ClasseS=temp1;
                                    lun2OrarioS=temp2;

                                    mar2MateriaV.setText(lun2MateriaS);
                                    mar2ClasseV.setText(lun2ClasseS);
                                    mar2OrarioV.setText(lun2OrarioS);

                                    SharedPreferences.Editor edit = sharedPreferences1.edit();
                                    edit.putString("lun2ClasseS",lun2ClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                    edit1.putString("lun2MateriaS",lun2MateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                    edit2.putString("lun2OrarioS",lun2OrarioS);
                                    edit2.commit();





                                    mar2MateriaV.setVisibility(View.VISIBLE);
                                    mar2ClasseV.setVisibility(View.VISIBLE);
                                    mar2OrarioV.setVisibility(View.VISIBLE);
                                }

                                else if(lun3MateriaS.length()==0){
                                    lun3MateriaS=temp;
                                    lun3ClasseS=temp1;
                                    lun3OrarioS=temp2;

                                    mar3MateriaV.setText(lun3MateriaS);
                                    mar3ClasseV.setText(lun3ClasseS);
                                    mar3OrarioV.setText(lun3OrarioS);


                                    SharedPreferences.Editor edit = sharedPreferences1.edit();
                                    edit.putString("lun3ClasseS",lun3ClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                    edit1.putString("lun3MateriaS",lun3MateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                    edit2.putString("lun3OrarioS",lun3OrarioS);
                                    edit2.commit();




                                    mar3MateriaV.setVisibility(View.VISIBLE);
                                    mar3ClasseV.setVisibility(View.VISIBLE);
                                    mar3OrarioV.setVisibility(View.VISIBLE);
                                }

                               else if(lun4MateriaS.length()==0){
                                    lun4MateriaS=temp;
                                    lun4ClasseS=temp1;
                                    lun4OrarioS=temp2;

                                    mar4MateriaV.setText(lun4MateriaS);
                                    mar4ClasseV.setText(lun4ClasseS);
                                    mar4OrarioV.setText(lun4OrarioS);


                                    SharedPreferences.Editor edit = sharedPreferences1.edit();
                                    edit.putString("lun4ClasseS",lun4ClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                    edit1.putString("lun4MateriaS",lun4MateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                    edit2.putString("lun4OrarioS",lun4OrarioS);
                                    edit2.commit();




                                    mar4MateriaV.setVisibility(View.VISIBLE);
                                    mar4ClasseV.setVisibility(View.VISIBLE);
                                    mar4OrarioV.setVisibility(View.VISIBLE);
                                }

                            }






                            dialog.cancel();
                        }
                    });
                    builder.show();
                }

            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
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

                                                marMateriaV.setText(lunMateriaS);
                                                marClasseV.setText(lunClasseS);
                                                marOrarioV.setText(lunOrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences1.edit();
                                                edit.putString("lunClasseS",lunClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                                edit1.putString("lunMateriaS",lunMateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                                edit2.putString("lunOrarioS",lunOrarioS);
                                                edit2.commit();
                                            }
                                            else if(scelto==2){
                                                lun1MateriaS=input.getText().toString();
                                                lun1ClasseS=input1.getText().toString();
                                                lun1OrarioS=input2.getText().toString();

                                                mar1MateriaV.setText(lun1MateriaS);
                                                mar1ClasseV.setText(lun1ClasseS);
                                                mar1OrarioV.setText(lun1OrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences1.edit();
                                                edit.putString("lun1ClasseS",lun1ClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                                edit1.putString("lun1MateriaS",lun1MateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                                edit2.putString("lun1OrarioS",lun1OrarioS);
                                                edit2.commit();
                                            }

                                           else if(scelto==3){
                                                lun2MateriaS=input.getText().toString();
                                                lun2ClasseS=input1.getText().toString();
                                                lun2OrarioS=input2.getText().toString();

                                                mar2MateriaV.setText(lun2MateriaS);
                                                mar2ClasseV.setText(lun2ClasseS);
                                                mar2OrarioV.setText(lun2OrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences1.edit();
                                                edit.putString("lun2ClasseS",lun2ClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                                edit1.putString("lun2MateriaS",lun2MateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                                edit2.putString("lun2OrarioS",lun2OrarioS);
                                                edit2.commit();
                                            }
                                           else if(scelto==4){
                                                lun3MateriaS=input.getText().toString();
                                                lun3ClasseS=input1.getText().toString();
                                                lun3OrarioS=input2.getText().toString();

                                                mar3MateriaV.setText(lun3MateriaS);
                                                mar3ClasseV.setText(lun3ClasseS);
                                                mar3OrarioV.setText(lun3OrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences1.edit();
                                                edit.putString("lun3ClasseS",lun3ClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                                edit1.putString("lun3MateriaS",lun3MateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                                edit2.putString("lun3OrarioS",lun3OrarioS);
                                                edit2.commit();
                                            }
                                            if(scelto==5){
                                                lun4MateriaS=input.getText().toString();
                                                lun4ClasseS=input1.getText().toString();
                                                lun4OrarioS=input2.getText().toString();

                                                mar4MateriaV.setText(lun4MateriaS);
                                                mar4ClasseV.setText(lun4ClasseS);
                                                mar4OrarioV.setText(lun4OrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences1.edit();
                                                edit.putString("lun4ClasseS",lun4ClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                                edit1.putString("lun4MateriaS",lun4MateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences1.edit();
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

        b5.setOnClickListener(new View.OnClickListener() {
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

                                    marMateriaV.setText(lunMateriaS);
                                    marClasseV.setText(lunClasseS);
                                    marOrarioV.setText(lunOrarioS);

                                    SharedPreferences.Editor edit = sharedPreferences1.edit();
                                    edit.putString("lunClasseS",lunClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                    edit1.putString("lunMateriaS",lunMateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                    edit2.putString("lunOrarioS",lunOrarioS);
                                    edit2.commit();

                                    marMateriaV.setVisibility(myview1.INVISIBLE);
                                    marClasseV.setVisibility(myview1.INVISIBLE);
                                    marOrarioV.setVisibility(myview1.INVISIBLE);

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

                                        marMateriaV.setText(lunMateriaS);
                                        marClasseV.setText(lunClasseS);
                                        marOrarioV.setText(lunOrarioS);

                                        mar1MateriaV.setText(lun1MateriaS);
                                        mar1ClasseV.setText(lun1ClasseS);
                                        mar1OrarioV.setText(lun1OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences1.edit();
                                        edit.putString("lunClasseS",lunClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                        edit1.putString("lunMateriaS",lunMateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                        edit2.putString("lunOrarioS",lunOrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences1.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences1.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences1.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        mar1MateriaV.setVisibility(myview1.INVISIBLE);
                                        mar1ClasseV.setVisibility(myview1.INVISIBLE);
                                        mar1OrarioV.setVisibility(myview1.INVISIBLE);
                                    } else if (scelto == 2) {

                                        lun1MateriaS="";
                                        lun1ClasseS="";
                                        lun1OrarioS="";

                                        mar1MateriaV.setText(lun1MateriaS);
                                        mar1ClasseV.setText(lun1ClasseS);
                                        mar1OrarioV.setText(lun1OrarioS);

                                        SharedPreferences.Editor edit3 = sharedPreferences1.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences1.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences1.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        mar1MateriaV.setVisibility(myview1.INVISIBLE);
                                        mar1ClasseV.setVisibility(myview1.INVISIBLE);
                                        mar1OrarioV.setVisibility(myview1.INVISIBLE);
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

                                        marMateriaV.setText(lunMateriaS);
                                        marClasseV.setText(lunClasseS);
                                        marOrarioV.setText(lunOrarioS);

                                        mar1MateriaV.setText(lun1MateriaS);
                                        mar1ClasseV.setText(lun1ClasseS);
                                        mar1OrarioV.setText(lun1OrarioS);

                                        mar2MateriaV.setText(lun2MateriaS);
                                        mar2ClasseV.setText(lun2ClasseS);
                                        mar2OrarioV.setText(lun2OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences1.edit();
                                        edit.putString("lunClasseS",lunClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                        edit1.putString("lunMateriaS",lunMateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                        edit2.putString("lunOrarioS",lunOrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences1.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences1.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences1.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        SharedPreferences.Editor edit6 = sharedPreferences1.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences1.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences1.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();

                                        mar2MateriaV.setVisibility(myview1.INVISIBLE);
                                        mar2ClasseV.setVisibility(myview1.INVISIBLE);
                                        mar2OrarioV.setVisibility(myview1.INVISIBLE);
                                    } else if (scelto == 2) {
                                        lun1MateriaS=lun2MateriaS;
                                        lun1ClasseS=lun2ClasseS;
                                        lun1OrarioS=lun2OrarioS;

                                        lun2MateriaS="";
                                        lun2ClasseS="";
                                        lun2OrarioS="";

                                        mar1MateriaV.setText(lun1MateriaS);
                                        mar1ClasseV.setText(lun1ClasseS);
                                        mar1OrarioV.setText(lun1OrarioS);

                                        mar2MateriaV.setText(lun2MateriaS);
                                        mar2ClasseV.setText(lun2ClasseS);
                                        mar2OrarioV.setText(lun2OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences1.edit();
                                        edit.putString("lun1ClasseS",lun1ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                        edit1.putString("lun1MateriaS",lun1MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                        edit2.putString("lun1OrarioS",lun1OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit6 = sharedPreferences1.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences1.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences1.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();

                                        mar2MateriaV.setVisibility(myview1.INVISIBLE);
                                        mar2ClasseV.setVisibility(myview1.INVISIBLE);
                                        mar2OrarioV.setVisibility(myview1.INVISIBLE);
                                    }
                                    else if(scelto==3){

                                        lun2MateriaS="";
                                        lun2ClasseS="";
                                        lun2OrarioS="";

                                        mar2MateriaV.setText(lun2MateriaS);
                                        mar2ClasseV.setText(lun2ClasseS);
                                        mar2OrarioV.setText(lun2OrarioS);

                                        SharedPreferences.Editor edit6 = sharedPreferences1.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences1.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences1.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();


                                        mar2MateriaV.setVisibility(myview1.INVISIBLE);
                                        mar2ClasseV.setVisibility(myview1.INVISIBLE);
                                        mar2OrarioV.setVisibility(myview1.INVISIBLE);
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

                                        marMateriaV.setText(lunMateriaS);
                                        marClasseV.setText(lunClasseS);
                                        marOrarioV.setText(lunOrarioS);

                                        mar1MateriaV.setText(lun1MateriaS);
                                        mar1ClasseV.setText(lun1ClasseS);
                                        mar1OrarioV.setText(lun1OrarioS);

                                        mar2MateriaV.setText(lun2MateriaS);
                                        mar2ClasseV.setText(lun2ClasseS);
                                        mar2OrarioV.setText(lun2OrarioS);

                                        mar3MateriaV.setText(lun3MateriaS);
                                        mar3ClasseV.setText(lun3ClasseS);
                                        mar3OrarioV.setText(lun3OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences1.edit();
                                        edit.putString("lunClasseS",lunClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                        edit1.putString("lunMateriaS",lunMateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                        edit2.putString("lunOrarioS",lunOrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences1.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences1.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences1.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        SharedPreferences.Editor edit6 = sharedPreferences1.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences1.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences1.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();

                                        SharedPreferences.Editor edit9 = sharedPreferences1.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences1.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences1.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        mar3MateriaV.setVisibility(myview1.INVISIBLE);
                                        mar3ClasseV.setVisibility(myview1.INVISIBLE);
                                        mar3OrarioV.setVisibility(myview1.INVISIBLE);
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


                                        mar1MateriaV.setText(lun1MateriaS);
                                        mar1ClasseV.setText(lun1ClasseS);
                                        mar1OrarioV.setText(lun1OrarioS);

                                        mar2MateriaV.setText(lun2MateriaS);
                                        mar2ClasseV.setText(lun2ClasseS);
                                        mar2OrarioV.setText(lun2OrarioS);

                                        mar3MateriaV.setText(lun3MateriaS);
                                        mar3ClasseV.setText(lun3ClasseS);
                                        mar3OrarioV.setText(lun3OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences1.edit();
                                        edit.putString("lun1ClasseS",lun1ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                        edit1.putString("lun1MateriaS",lun1MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                        edit2.putString("lun1OrarioS",lun1OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences1.edit();
                                        edit3.putString("lun2ClasseS",lun2ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences1.edit();
                                        edit4.putString("lun2MateriaS",lun2MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences1.edit();
                                        edit5.putString("lun2OrarioS",lun2OrarioS);
                                        edit5.commit();

                                        SharedPreferences.Editor edit9 = sharedPreferences1.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences1.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences1.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        mar3MateriaV.setVisibility(myview1.INVISIBLE);
                                        mar3ClasseV.setVisibility(myview1.INVISIBLE);
                                        mar3OrarioV.setVisibility(myview1.INVISIBLE);
                                    }
                                    else if(scelto==3){
                                        lun2MateriaS=lun3MateriaS;
                                        lun2ClasseS=lun3ClasseS;
                                        lun2OrarioS=lun3OrarioS;

                                        lun3MateriaS="";
                                        lun3ClasseS="";
                                        lun3OrarioS="";

                                        mar2MateriaV.setText(lun2MateriaS);
                                        mar2ClasseV.setText(lun2ClasseS);
                                        mar2OrarioV.setText(lun2OrarioS);

                                        mar3MateriaV.setText(lun3MateriaS);
                                        mar3ClasseV.setText(lun3ClasseS);
                                        mar3OrarioV.setText(lun3OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences1.edit();
                                        edit.putString("lun2ClasseS",lun2ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                        edit1.putString("lun2MateriaS",lun2MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                        edit2.putString("lun2OrarioS",lun2OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit9 = sharedPreferences1.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences1.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences1.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        mar3MateriaV.setVisibility(myview1.INVISIBLE);
                                        mar3ClasseV.setVisibility(myview1.INVISIBLE);
                                        mar3OrarioV.setVisibility(myview1.INVISIBLE);
                                    }
                                    else if(scelto==4){
                                        lun3MateriaS="";
                                        lun3ClasseS="";
                                        lun3OrarioS="";

                                        mar3MateriaV.setText(lun3MateriaS);
                                        mar3ClasseV.setText(lun3ClasseS);
                                        mar3OrarioV.setText(lun3OrarioS);

                                        SharedPreferences.Editor edit9 = sharedPreferences1.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences1.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences1.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();


                                        mar3MateriaV.setVisibility(myview1.INVISIBLE);
                                        mar3ClasseV.setVisibility(myview1.INVISIBLE);
                                        mar3OrarioV.setVisibility(myview1.INVISIBLE);
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

                                        marMateriaV.setText(lunMateriaS);
                                        marClasseV.setText(lunClasseS);
                                        marOrarioV.setText(lunOrarioS);

                                        mar1MateriaV.setText(lun1MateriaS);
                                        mar1ClasseV.setText(lun1ClasseS);
                                        mar1OrarioV.setText(lun1OrarioS);

                                        mar2MateriaV.setText(lun2MateriaS);
                                        mar2ClasseV.setText(lun2ClasseS);
                                        mar2OrarioV.setText(lun2OrarioS);

                                        mar3MateriaV.setText(lun3MateriaS);
                                        mar3ClasseV.setText(lun3ClasseS);
                                        mar3OrarioV.setText(lun3OrarioS);

                                        mar4MateriaV.setText(lun4MateriaS);
                                        mar4ClasseV.setText(lun4ClasseS);
                                        mar4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences1.edit();
                                        edit.putString("lunClasseS",lunClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                        edit1.putString("lunMateriaS",lunMateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                        edit2.putString("lunOrarioS",lunOrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences1.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences1.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences1.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        SharedPreferences.Editor edit6 = sharedPreferences1.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences1.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences1.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();

                                        SharedPreferences.Editor edit9 = sharedPreferences1.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences1.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences1.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        SharedPreferences.Editor edit12 = sharedPreferences1.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences1.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences1.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();

                                        mar4MateriaV.setVisibility(myview1.INVISIBLE);
                                        mar4ClasseV.setVisibility(myview1.INVISIBLE);
                                        mar4OrarioV.setVisibility(myview1.INVISIBLE);
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

                                        mar1MateriaV.setText(lun1MateriaS);
                                        mar1ClasseV.setText(lun1ClasseS);
                                        mar1OrarioV.setText(lun1OrarioS);

                                        mar2MateriaV.setText(lun2MateriaS);
                                        mar2ClasseV.setText(lun2ClasseS);
                                        mar2OrarioV.setText(lun2OrarioS);

                                        mar3MateriaV.setText(lun3MateriaS);
                                        mar3ClasseV.setText(lun3ClasseS);
                                        mar3OrarioV.setText(lun3OrarioS);

                                        mar4MateriaV.setText(lun4MateriaS);
                                        mar4ClasseV.setText(lun4ClasseS);
                                        mar4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences1.edit();
                                        edit.putString("lun1ClasseS",lun1ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                        edit1.putString("lun1MateriaS",lun1MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                        edit2.putString("lun1OrarioS",lun1OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences1.edit();
                                        edit3.putString("lun2ClasseS",lun2ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences1.edit();
                                        edit4.putString("lun2MateriaS",lun2MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences1.edit();
                                        edit5.putString("lun2OrarioS",lun2OrarioS);
                                        edit5.commit();


                                        SharedPreferences.Editor edit9 = sharedPreferences1.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences1.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences1.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        SharedPreferences.Editor edit12 = sharedPreferences1.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences1.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences1.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();

                                        mar4MateriaV.setVisibility(myview1.INVISIBLE);
                                        mar4ClasseV.setVisibility(myview1.INVISIBLE);
                                        mar4OrarioV.setVisibility(myview1.INVISIBLE);
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


                                        mar2MateriaV.setText(lun2MateriaS);
                                        mar2ClasseV.setText(lun2ClasseS);
                                        mar2OrarioV.setText(lun2OrarioS);
                                        mar3MateriaV.setText(lun3MateriaS);
                                        mar3ClasseV.setText(lun3ClasseS);
                                        mar3OrarioV.setText(lun3OrarioS);

                                        mar4MateriaV.setText(lun4MateriaS);
                                        mar4ClasseV.setText(lun4ClasseS);
                                        mar4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit3 = sharedPreferences1.edit();
                                        edit3.putString("lun2ClasseS",lun2ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences1.edit();
                                        edit4.putString("lun2MateriaS",lun2MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences1.edit();
                                        edit5.putString("lun2OrarioS",lun2OrarioS);
                                        edit5.commit();


                                        SharedPreferences.Editor edit9 = sharedPreferences1.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences1.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences1.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        SharedPreferences.Editor edit12 = sharedPreferences1.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences1.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences1.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();

                                        mar4MateriaV.setVisibility(myview1.INVISIBLE);
                                        mar4ClasseV.setVisibility(myview1.INVISIBLE);
                                        mar4OrarioV.setVisibility(myview1.INVISIBLE);

                                    }

                                    else if(scelto==4){
                                        lun3MateriaS=lun4MateriaS;
                                        lun3ClasseS=lun4ClasseS;
                                        lun3OrarioS=lun4OrarioS;

                                        lun4MateriaS="";
                                        lun4ClasseS="";
                                        lun4OrarioS="";


                                        mar3MateriaV.setText(lun3MateriaS);
                                        mar3ClasseV.setText(lun3ClasseS);
                                        mar3OrarioV.setText(lun3OrarioS);

                                        mar4MateriaV.setText(lun4MateriaS);
                                        mar4ClasseV.setText(lun4ClasseS);
                                        mar4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences1.edit();
                                        edit.putString("lun3ClasseS",lun3ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences1.edit();
                                        edit1.putString("lun3MateriaS",lun3MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences1.edit();
                                        edit2.putString("lun3OrarioS",lun3OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit12 = sharedPreferences1.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences1.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences1.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();

                                        mar4MateriaV.setVisibility(myview1.INVISIBLE);
                                        mar4ClasseV.setVisibility(myview1.INVISIBLE);
                                        mar4OrarioV.setVisibility(myview1.INVISIBLE);
                                    }
                                    else if(scelto==5){
                                        lun4MateriaS="";
                                        lun4ClasseS="";
                                        lun4OrarioS="";

                                        mar4MateriaV.setText(lun4MateriaS);
                                        mar4ClasseV.setText(lun4ClasseS);
                                        mar4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit12 = sharedPreferences1.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences1.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences1.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();


                                        mar4MateriaV.setVisibility(myview1.INVISIBLE);
                                        mar4ClasseV.setVisibility(myview1.INVISIBLE);
                                        mar4OrarioV.setVisibility(myview1.INVISIBLE);
                                    }






                                }

                            }
                        }
                            });

                    builder.show();
                }

            }
        });

        return myview1;
    }
}
