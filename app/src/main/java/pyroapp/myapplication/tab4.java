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

public class tab4 extends Fragment {

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
        final View myview3=inflater.inflate(R.layout.tab4_frag,container,false);

        //inizializzare le preferenze da salvare
        Context context3 = getActivity();
        final SharedPreferences sharedPreferences3=context3.getSharedPreferences("sharedPreferences3", Context.MODE_PRIVATE);;

        //bottoni
       final FloatingActionButton b9= myview3.findViewById(R.id.fabio3);
        final FloatingActionButton b10= myview3.findViewById(R.id.fab9);
        final FloatingActionButton b11=myview3.findViewById(R.id.fab10);
        final Button gioOrarioV=myview3.findViewById(R.id.gioOrario);
        final Button gio1OrarioV=myview3.findViewById(R.id.gio1Orario);
        final Button gio2OrarioV=myview3.findViewById(R.id.gio2Orario);
        final Button gio3OrarioV=myview3.findViewById(R.id.gio3Orario);
        final Button gio4OrarioV=myview3.findViewById(R.id.gio4Orario);
        //testi
        final TextView gioMateriaV=myview3.findViewById(R.id.gioMateria);
        final TextView gioClasseV=myview3.findViewById(R.id.gioClasse);
        final TextView gio1MateriaV=myview3.findViewById(R.id.gio1Materia);
        final TextView gio1ClasseV=myview3.findViewById(R.id.gio1Classe);
        final TextView gio2MateriaV=myview3.findViewById(R.id.gio2Materia);
        final TextView gio2ClasseV=myview3.findViewById(R.id.gio2Classe);
        final TextView gio3MateriaV=myview3.findViewById(R.id.gio3Materia);
        final TextView gio3ClasseV=myview3.findViewById(R.id.gio3Classe);
        final TextView gio4MateriaV=myview3.findViewById(R.id.gio4Materia);
        final TextView gio4ClasseV=myview3.findViewById(R.id.gio4Classe);





        lunMateriaS=sharedPreferences3.getString("lunMateriaS",lunMateriaS);
        lunClasseS=sharedPreferences3.getString("lunClasseS",lunClasseS);
        lunOrarioS=sharedPreferences3.getString("lunOrarioS",lunOrarioS);

        lun1MateriaS=sharedPreferences3.getString("lun1MateriaS",lun1MateriaS);
        lun1ClasseS=sharedPreferences3.getString("lun1ClasseS",lun1ClasseS);
        lun1OrarioS=sharedPreferences3.getString("lun1OrarioS",lun1OrarioS);

        lun2MateriaS=sharedPreferences3.getString("lun2MateriaS",lun2MateriaS);
        lun2ClasseS=sharedPreferences3.getString("lun2ClasseS",lun2ClasseS);
        lun2OrarioS=sharedPreferences3.getString("lun2OrarioS",lun2OrarioS);

        lun3MateriaS=sharedPreferences3.getString("lun3MateriaS",lun3MateriaS);
        lun3ClasseS=sharedPreferences3.getString("lun3ClasseS",lun3ClasseS);
        lun3OrarioS=sharedPreferences3.getString("lun3OrarioS",lun3OrarioS);

        lun4MateriaS=sharedPreferences3.getString("lun4MateriaS",lun4MateriaS);
        lun4ClasseS=sharedPreferences3.getString("lun4ClasseS",lun4ClasseS);
        lun4OrarioS=sharedPreferences3.getString("lun4OrarioS",lun4OrarioS);



        gioMateriaV.setText(lunMateriaS);
        gioClasseV.setText(lunClasseS);
        gioOrarioV.setText(lunOrarioS);

        gio1MateriaV.setText(lun1MateriaS);
        gio1ClasseV.setText(lun1ClasseS);
        gio1OrarioV.setText(lun1OrarioS);

        gio2MateriaV.setText(lun2MateriaS);
        gio2ClasseV.setText(lun2ClasseS);
        gio2OrarioV.setText(lun2OrarioS);

        gio3MateriaV.setText(lun3MateriaS);
        gio3ClasseV.setText(lun3ClasseS);
        gio3OrarioV.setText(lun3OrarioS);

        gio4MateriaV.setText(lun4MateriaS);
        gio4ClasseV.setText(lun4ClasseS);
        gio4OrarioV.setText(lun4OrarioS);

       if(lunMateriaS.length()==0){

            gioMateriaV.setVisibility(myview3.INVISIBLE);
            gioClasseV.setVisibility(myview3.INVISIBLE);
            gioOrarioV.setVisibility(myview3.INVISIBLE);
        }
        else    count++;
        if(lun1MateriaS.length()==0){

            gio1MateriaV.setVisibility(myview3.INVISIBLE);
            gio1ClasseV.setVisibility(myview3.INVISIBLE);
            gio1OrarioV.setVisibility(myview3.INVISIBLE);
        }
        else count++;

        if(lun2MateriaS.length()==0){

            gio2MateriaV.setVisibility(myview3.INVISIBLE);
            gio2ClasseV.setVisibility(myview3.INVISIBLE);
            gio2OrarioV.setVisibility(myview3.INVISIBLE);
        }
        else    count++;

        if(lun3MateriaS.length()==0){

            gio3MateriaV.setVisibility(myview3.INVISIBLE);
            gio3ClasseV.setVisibility(myview3.INVISIBLE);
            gio3OrarioV.setVisibility(myview3.INVISIBLE);
        }
        else    count++;

        if(lun4MateriaS.length()==0){

            gio4MateriaV.setVisibility(myview3.INVISIBLE);
            gio4ClasseV.setVisibility(myview3.INVISIBLE);
            gio4OrarioV.setVisibility(myview3.INVISIBLE);
        }
        else    count++;




        b9.setOnClickListener(new View.OnClickListener() {
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

                                    gioMateriaV.setText(lunMateriaS);
                                    gioClasseV.setText(lunClasseS);
                                    gioOrarioV.setText(lunOrarioS);


                                    SharedPreferences.Editor edit = sharedPreferences3.edit();
                                    edit.putString("lunClasseS",lunClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                    edit1.putString("lunMateriaS",lunMateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                    edit2.putString("lunOrarioS",lunOrarioS);
                                    edit2.commit();




                                    gioMateriaV.setVisibility(View.VISIBLE);
                                    gioClasseV.setVisibility(View.VISIBLE);
                                    gioOrarioV.setVisibility(View.VISIBLE);
                                }
                                else if(lun1MateriaS.length()==0){

                                    lun1MateriaS=temp;
                                    lun1ClasseS=temp1;
                                    lun1OrarioS=temp2;

                                    gio1MateriaV.setText(lun1MateriaS);
                                    gio1ClasseV.setText(lun1ClasseS);
                                    gio1OrarioV.setText(lun1OrarioS);

                                    SharedPreferences.Editor edit = sharedPreferences3.edit();
                                    edit.putString("lun1ClasseS",lun1ClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                    edit1.putString("lun1MateriaS",lun1MateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                    edit2.putString("lun1OrarioS",lun1OrarioS);
                                    edit2.commit();





                                    gio1MateriaV.setVisibility(View.VISIBLE);
                                    gio1ClasseV.setVisibility(View.VISIBLE);
                                    gio1OrarioV.setVisibility(View.VISIBLE);
                                }

                                else if(lun2MateriaS.length()==0){

                                    lun2MateriaS=temp;
                                    lun2ClasseS=temp1;
                                    lun2OrarioS=temp2;

                                    gio2MateriaV.setText(lun2MateriaS);
                                    gio2ClasseV.setText(lun2ClasseS);
                                    gio2OrarioV.setText(lun2OrarioS);

                                    SharedPreferences.Editor edit = sharedPreferences3.edit();
                                    edit.putString("lun2ClasseS",lun2ClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                    edit1.putString("lun2MateriaS",lun2MateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                    edit2.putString("lun2OrarioS",lun2OrarioS);
                                    edit2.commit();





                                    gio2MateriaV.setVisibility(View.VISIBLE);
                                    gio2ClasseV.setVisibility(View.VISIBLE);
                                    gio2OrarioV.setVisibility(View.VISIBLE);
                                }

                                else if(lun3MateriaS.length()==0){
                                    lun3MateriaS=temp;
                                    lun3ClasseS=temp1;
                                    lun3OrarioS=temp2;

                                    gio3MateriaV.setText(lun3MateriaS);
                                    gio3ClasseV.setText(lun3ClasseS);
                                    gio3OrarioV.setText(lun3OrarioS);


                                    SharedPreferences.Editor edit = sharedPreferences3.edit();
                                    edit.putString("lun3ClasseS",lun3ClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                    edit1.putString("lun3MateriaS",lun3MateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                    edit2.putString("lun3OrarioS",lun3OrarioS);
                                    edit2.commit();




                                    gio3MateriaV.setVisibility(View.VISIBLE);
                                    gio3ClasseV.setVisibility(View.VISIBLE);
                                    gio3OrarioV.setVisibility(View.VISIBLE);
                                }

                               else if(lun4MateriaS.length()==0){
                                    lun4MateriaS=temp;
                                    lun4ClasseS=temp1;
                                    lun4OrarioS=temp2;

                                    gio4MateriaV.setText(lun4MateriaS);
                                    gio4ClasseV.setText(lun4ClasseS);
                                    gio4OrarioV.setText(lun4OrarioS);


                                    SharedPreferences.Editor edit = sharedPreferences3.edit();
                                    edit.putString("lun4ClasseS",lun4ClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                    edit1.putString("lun4MateriaS",lun4MateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                    edit2.putString("lun4OrarioS",lun4OrarioS);
                                    edit2.commit();




                                    gio4MateriaV.setVisibility(View.VISIBLE);
                                    gio4ClasseV.setVisibility(View.VISIBLE);
                                    gio4OrarioV.setVisibility(View.VISIBLE);
                                }

                            }






                            dialog.cancel();
                        }
                    });
                    builder.show();
                }

            }
        });


        b10.setOnClickListener(new View.OnClickListener() {
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

                                                gioMateriaV.setText(lunMateriaS);
                                                gioClasseV.setText(lunClasseS);
                                                gioOrarioV.setText(lunOrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences3.edit();
                                                edit.putString("lunClasseS",lunClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                                edit1.putString("lunMateriaS",lunMateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                                edit2.putString("lunOrarioS",lunOrarioS);
                                                edit2.commit();
                                            }
                                            else if(scelto==2){
                                                lun1MateriaS=input.getText().toString();
                                                lun1ClasseS=input1.getText().toString();
                                                lun1OrarioS=input2.getText().toString();

                                                gio1MateriaV.setText(lun1MateriaS);
                                                gio1ClasseV.setText(lun1ClasseS);
                                                gio1OrarioV.setText(lun1OrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences3.edit();
                                                edit.putString("lun1ClasseS",lun1ClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                                edit1.putString("lun1MateriaS",lun1MateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                                edit2.putString("lun1OrarioS",lun1OrarioS);
                                                edit2.commit();
                                            }

                                           else if(scelto==3){
                                                lun2MateriaS=input.getText().toString();
                                                lun2ClasseS=input1.getText().toString();
                                                lun2OrarioS=input2.getText().toString();

                                                gio2MateriaV.setText(lun2MateriaS);
                                                gio2ClasseV.setText(lun2ClasseS);
                                                gio2OrarioV.setText(lun2OrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences3.edit();
                                                edit.putString("lun2ClasseS",lun2ClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                                edit1.putString("lun2MateriaS",lun2MateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                                edit2.putString("lun2OrarioS",lun2OrarioS);
                                                edit2.commit();
                                            }
                                           else if(scelto==4){
                                                lun3MateriaS=input.getText().toString();
                                                lun3ClasseS=input1.getText().toString();
                                                lun3OrarioS=input2.getText().toString();

                                                gio3MateriaV.setText(lun3MateriaS);
                                                gio3ClasseV.setText(lun3ClasseS);
                                                gio3OrarioV.setText(lun3OrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences3.edit();
                                                edit.putString("lun3ClasseS",lun3ClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                                edit1.putString("lun3MateriaS",lun3MateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                                edit2.putString("lun3OrarioS",lun3OrarioS);
                                                edit2.commit();
                                            }
                                            if(scelto==5){
                                                lun4MateriaS=input.getText().toString();
                                                lun4ClasseS=input1.getText().toString();
                                                lun4OrarioS=input2.getText().toString();

                                                gio4MateriaV.setText(lun4MateriaS);
                                                gio4ClasseV.setText(lun4ClasseS);
                                                gio4OrarioV.setText(lun4OrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences3.edit();
                                                edit.putString("lun4ClasseS",lun4ClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                                edit1.putString("lun4MateriaS",lun4MateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences3.edit();
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

        b11.setOnClickListener(new View.OnClickListener() {
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

                                    gioMateriaV.setText(lunMateriaS);
                                    gioClasseV.setText(lunClasseS);
                                    gioOrarioV.setText(lunOrarioS);

                                    SharedPreferences.Editor edit = sharedPreferences3.edit();
                                    edit.putString("lunClasseS",lunClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                    edit1.putString("lunMateriaS",lunMateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                    edit2.putString("lunOrarioS",lunOrarioS);
                                    edit2.commit();

                                    gioMateriaV.setVisibility(myview3.INVISIBLE);
                                    gioClasseV.setVisibility(myview3.INVISIBLE);
                                    gioOrarioV.setVisibility(myview3.INVISIBLE);

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

                                        gioMateriaV.setText(lunMateriaS);
                                        gioClasseV.setText(lunClasseS);
                                        gioOrarioV.setText(lunOrarioS);

                                        gio1MateriaV.setText(lun1MateriaS);
                                        gio1ClasseV.setText(lun1ClasseS);
                                        gio1OrarioV.setText(lun1OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences3.edit();
                                        edit.putString("lunClasseS",lunClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                        edit1.putString("lunMateriaS",lunMateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                        edit2.putString("lunOrarioS",lunOrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences3.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences3.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        gio1MateriaV.setVisibility(myview3.INVISIBLE);
                                        gio1ClasseV.setVisibility(myview3.INVISIBLE);
                                        gio1OrarioV.setVisibility(myview3.INVISIBLE);
                                    } else if (scelto == 2) {

                                        lun1MateriaS="";
                                        lun1ClasseS="";
                                        lun1OrarioS="";

                                        gio1MateriaV.setText(lun1MateriaS);
                                        gio1ClasseV.setText(lun1ClasseS);
                                        gio1OrarioV.setText(lun1OrarioS);

                                        SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences3.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences3.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        gio1MateriaV.setVisibility(myview3.INVISIBLE);
                                        gio1ClasseV.setVisibility(myview3.INVISIBLE);
                                        gio1OrarioV.setVisibility(myview3.INVISIBLE);
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

                                        gioMateriaV.setText(lunMateriaS);
                                        gioClasseV.setText(lunClasseS);
                                        gioOrarioV.setText(lunOrarioS);

                                        gio1MateriaV.setText(lun1MateriaS);
                                        gio1ClasseV.setText(lun1ClasseS);
                                        gio1OrarioV.setText(lun1OrarioS);

                                        gio2MateriaV.setText(lun2MateriaS);
                                        gio2ClasseV.setText(lun2ClasseS);
                                        gio2OrarioV.setText(lun2OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences3.edit();
                                        edit.putString("lunClasseS",lunClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                        edit1.putString("lunMateriaS",lunMateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                        edit2.putString("lunOrarioS",lunOrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences3.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences3.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        SharedPreferences.Editor edit6 = sharedPreferences3.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences3.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences3.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();

                                        gio2MateriaV.setVisibility(myview3.INVISIBLE);
                                        gio2ClasseV.setVisibility(myview3.INVISIBLE);
                                        gio2OrarioV.setVisibility(myview3.INVISIBLE);
                                    } else if (scelto == 2) {
                                        lun1MateriaS=lun2MateriaS;
                                        lun1ClasseS=lun2ClasseS;
                                        lun1OrarioS=lun2OrarioS;

                                        lun2MateriaS="";
                                        lun2ClasseS="";
                                        lun2OrarioS="";

                                        gio1MateriaV.setText(lun1MateriaS);
                                        gio1ClasseV.setText(lun1ClasseS);
                                        gio1OrarioV.setText(lun1OrarioS);

                                        gio2MateriaV.setText(lun2MateriaS);
                                        gio2ClasseV.setText(lun2ClasseS);
                                        gio2OrarioV.setText(lun2OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences3.edit();
                                        edit.putString("lun1ClasseS",lun1ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                        edit1.putString("lun1MateriaS",lun1MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                        edit2.putString("lun1OrarioS",lun1OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit6 = sharedPreferences3.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences3.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences3.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();

                                        gio2MateriaV.setVisibility(myview3.INVISIBLE);
                                        gio2ClasseV.setVisibility(myview3.INVISIBLE);
                                        gio2OrarioV.setVisibility(myview3.INVISIBLE);
                                    }
                                    else if(scelto==3){

                                        lun2MateriaS="";
                                        lun2ClasseS="";
                                        lun2OrarioS="";

                                        gio2MateriaV.setText(lun2MateriaS);
                                        gio2ClasseV.setText(lun2ClasseS);
                                        gio2OrarioV.setText(lun2OrarioS);

                                        SharedPreferences.Editor edit6 = sharedPreferences3.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences3.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences3.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();


                                        gio2MateriaV.setVisibility(myview3.INVISIBLE);
                                        gio2ClasseV.setVisibility(myview3.INVISIBLE);
                                        gio2OrarioV.setVisibility(myview3.INVISIBLE);
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

                                        gioMateriaV.setText(lunMateriaS);
                                        gioClasseV.setText(lunClasseS);
                                        gioOrarioV.setText(lunOrarioS);

                                        gio1MateriaV.setText(lun1MateriaS);
                                        gio1ClasseV.setText(lun1ClasseS);
                                        gio1OrarioV.setText(lun1OrarioS);

                                        gio2MateriaV.setText(lun2MateriaS);
                                        gio2ClasseV.setText(lun2ClasseS);
                                        gio2OrarioV.setText(lun2OrarioS);

                                        gio3MateriaV.setText(lun3MateriaS);
                                        gio3ClasseV.setText(lun3ClasseS);
                                        gio3OrarioV.setText(lun3OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences3.edit();
                                        edit.putString("lunClasseS",lunClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                        edit1.putString("lunMateriaS",lunMateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                        edit2.putString("lunOrarioS",lunOrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences3.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences3.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        SharedPreferences.Editor edit6 = sharedPreferences3.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences3.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences3.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();

                                        SharedPreferences.Editor edit9 = sharedPreferences3.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences3.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences3.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        gio3MateriaV.setVisibility(myview3.INVISIBLE);
                                        gio3ClasseV.setVisibility(myview3.INVISIBLE);
                                        gio3OrarioV.setVisibility(myview3.INVISIBLE);
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


                                        gio1MateriaV.setText(lun1MateriaS);
                                        gio1ClasseV.setText(lun1ClasseS);
                                        gio1OrarioV.setText(lun1OrarioS);

                                        gio2MateriaV.setText(lun2MateriaS);
                                        gio2ClasseV.setText(lun2ClasseS);
                                        gio2OrarioV.setText(lun2OrarioS);

                                        gio3MateriaV.setText(lun3MateriaS);
                                        gio3ClasseV.setText(lun3ClasseS);
                                        gio3OrarioV.setText(lun3OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences3.edit();
                                        edit.putString("lun1ClasseS",lun1ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                        edit1.putString("lun1MateriaS",lun1MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                        edit2.putString("lun1OrarioS",lun1OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                                        edit3.putString("lun2ClasseS",lun2ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences3.edit();
                                        edit4.putString("lun2MateriaS",lun2MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences3.edit();
                                        edit5.putString("lun2OrarioS",lun2OrarioS);
                                        edit5.commit();

                                        SharedPreferences.Editor edit9 = sharedPreferences3.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences3.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences3.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        gio3MateriaV.setVisibility(myview3.INVISIBLE);
                                        gio3ClasseV.setVisibility(myview3.INVISIBLE);
                                        gio3OrarioV.setVisibility(myview3.INVISIBLE);
                                    }
                                    else if(scelto==3){
                                        lun2MateriaS=lun3MateriaS;
                                        lun2ClasseS=lun3ClasseS;
                                        lun2OrarioS=lun3OrarioS;

                                        lun3MateriaS="";
                                        lun3ClasseS="";
                                        lun3OrarioS="";

                                        gio2MateriaV.setText(lun2MateriaS);
                                        gio2ClasseV.setText(lun2ClasseS);
                                        gio2OrarioV.setText(lun2OrarioS);

                                        gio3MateriaV.setText(lun3MateriaS);
                                        gio3ClasseV.setText(lun3ClasseS);
                                        gio3OrarioV.setText(lun3OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences3.edit();
                                        edit.putString("lun2ClasseS",lun2ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                        edit1.putString("lun2MateriaS",lun2MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                        edit2.putString("lun2OrarioS",lun2OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit9 = sharedPreferences3.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences3.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences3.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        gio3MateriaV.setVisibility(myview3.INVISIBLE);
                                        gio3ClasseV.setVisibility(myview3.INVISIBLE);
                                        gio3OrarioV.setVisibility(myview3.INVISIBLE);
                                    }
                                    else if(scelto==4){
                                        lun3MateriaS="";
                                        lun3ClasseS="";
                                        lun3OrarioS="";

                                        gio3MateriaV.setText(lun3MateriaS);
                                        gio3ClasseV.setText(lun3ClasseS);
                                        gio3OrarioV.setText(lun3OrarioS);

                                        SharedPreferences.Editor edit9 = sharedPreferences3.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences3.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences3.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();


                                        gio3MateriaV.setVisibility(myview3.INVISIBLE);
                                        gio3ClasseV.setVisibility(myview3.INVISIBLE);
                                        gio3OrarioV.setVisibility(myview3.INVISIBLE);
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

                                        gioMateriaV.setText(lunMateriaS);
                                        gioClasseV.setText(lunClasseS);
                                        gioOrarioV.setText(lunOrarioS);

                                        gio1MateriaV.setText(lun1MateriaS);
                                        gio1ClasseV.setText(lun1ClasseS);
                                        gio1OrarioV.setText(lun1OrarioS);

                                        gio2MateriaV.setText(lun2MateriaS);
                                        gio2ClasseV.setText(lun2ClasseS);
                                        gio2OrarioV.setText(lun2OrarioS);

                                        gio3MateriaV.setText(lun3MateriaS);
                                        gio3ClasseV.setText(lun3ClasseS);
                                        gio3OrarioV.setText(lun3OrarioS);

                                        gio4MateriaV.setText(lun4MateriaS);
                                        gio4ClasseV.setText(lun4ClasseS);
                                        gio4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences3.edit();
                                        edit.putString("lunClasseS",lunClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                        edit1.putString("lunMateriaS",lunMateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                        edit2.putString("lunOrarioS",lunOrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences3.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences3.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        SharedPreferences.Editor edit6 = sharedPreferences3.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences3.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences3.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();

                                        SharedPreferences.Editor edit9 = sharedPreferences3.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences3.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences3.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        SharedPreferences.Editor edit12 = sharedPreferences3.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences3.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences3.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();

                                        gio4MateriaV.setVisibility(myview3.INVISIBLE);
                                        gio4ClasseV.setVisibility(myview3.INVISIBLE);
                                        gio4OrarioV.setVisibility(myview3.INVISIBLE);
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

                                        gio1MateriaV.setText(lun1MateriaS);
                                        gio1ClasseV.setText(lun1ClasseS);
                                        gio1OrarioV.setText(lun1OrarioS);

                                        gio2MateriaV.setText(lun2MateriaS);
                                        gio2ClasseV.setText(lun2ClasseS);
                                        gio2OrarioV.setText(lun2OrarioS);

                                        gio3MateriaV.setText(lun3MateriaS);
                                        gio3ClasseV.setText(lun3ClasseS);
                                        gio3OrarioV.setText(lun3OrarioS);

                                        gio4MateriaV.setText(lun4MateriaS);
                                        gio4ClasseV.setText(lun4ClasseS);
                                        gio4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences3.edit();
                                        edit.putString("lun1ClasseS",lun1ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                        edit1.putString("lun1MateriaS",lun1MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                        edit2.putString("lun1OrarioS",lun1OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                                        edit3.putString("lun2ClasseS",lun2ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences3.edit();
                                        edit4.putString("lun2MateriaS",lun2MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences3.edit();
                                        edit5.putString("lun2OrarioS",lun2OrarioS);
                                        edit5.commit();


                                        SharedPreferences.Editor edit9 = sharedPreferences3.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences3.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences3.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        SharedPreferences.Editor edit12 = sharedPreferences3.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences3.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences3.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();

                                        gio4MateriaV.setVisibility(myview3.INVISIBLE);
                                        gio4ClasseV.setVisibility(myview3.INVISIBLE);
                                        gio4OrarioV.setVisibility(myview3.INVISIBLE);
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


                                        gio2MateriaV.setText(lun2MateriaS);
                                        gio2ClasseV.setText(lun2ClasseS);
                                        gio2OrarioV.setText(lun2OrarioS);
                                        gio3MateriaV.setText(lun3MateriaS);
                                        gio3ClasseV.setText(lun3ClasseS);
                                        gio3OrarioV.setText(lun3OrarioS);

                                        gio4MateriaV.setText(lun4MateriaS);
                                        gio4ClasseV.setText(lun4ClasseS);
                                        gio4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                                        edit3.putString("lun2ClasseS",lun2ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences3.edit();
                                        edit4.putString("lun2MateriaS",lun2MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences3.edit();
                                        edit5.putString("lun2OrarioS",lun2OrarioS);
                                        edit5.commit();


                                        SharedPreferences.Editor edit9 = sharedPreferences3.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences3.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences3.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        SharedPreferences.Editor edit12 = sharedPreferences3.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences3.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences3.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();

                                        gio4MateriaV.setVisibility(myview3.INVISIBLE);
                                        gio4ClasseV.setVisibility(myview3.INVISIBLE);
                                        gio4OrarioV.setVisibility(myview3.INVISIBLE);

                                    }

                                    else if(scelto==4){
                                        lun3MateriaS=lun4MateriaS;
                                        lun3ClasseS=lun4ClasseS;
                                        lun3OrarioS=lun4OrarioS;

                                        lun4MateriaS="";
                                        lun4ClasseS="";
                                        lun4OrarioS="";


                                        gio3MateriaV.setText(lun3MateriaS);
                                        gio3ClasseV.setText(lun3ClasseS);
                                        gio3OrarioV.setText(lun3OrarioS);

                                        gio4MateriaV.setText(lun4MateriaS);
                                        gio4ClasseV.setText(lun4ClasseS);
                                        gio4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences3.edit();
                                        edit.putString("lun3ClasseS",lun3ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences3.edit();
                                        edit1.putString("lun3MateriaS",lun3MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences3.edit();
                                        edit2.putString("lun3OrarioS",lun3OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit12 = sharedPreferences3.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences3.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences3.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();

                                        gio4MateriaV.setVisibility(myview3.INVISIBLE);
                                        gio4ClasseV.setVisibility(myview3.INVISIBLE);
                                        gio4OrarioV.setVisibility(myview3.INVISIBLE);
                                    }
                                    else if(scelto==5){
                                        lun4MateriaS="";
                                        lun4ClasseS="";
                                        lun4OrarioS="";

                                        gio4MateriaV.setText(lun4MateriaS);
                                        gio4ClasseV.setText(lun4ClasseS);
                                        gio4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit12 = sharedPreferences3.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences3.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences3.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();


                                        gio4MateriaV.setVisibility(myview3.INVISIBLE);
                                        gio4ClasseV.setVisibility(myview3.INVISIBLE);
                                        gio4OrarioV.setVisibility(myview3.INVISIBLE);
                                    }






                                }

                            }
                        }
                            });

                    builder.show();
                }

            }
        });

        return myview3;
    }
}
