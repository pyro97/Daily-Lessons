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

public class tab3 extends Fragment {

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
        final View myview2=inflater.inflate(R.layout.tab3_frag,container,false);

        //inizializzare le preferenze da salvare
        Context context2 = getActivity();
        final SharedPreferences sharedPreferences2=context2.getSharedPreferences("sharedPreferences2", Context.MODE_PRIVATE);;

        //bottoni
       final FloatingActionButton b6= myview2.findViewById(R.id.fabio2);
        final FloatingActionButton b7= myview2.findViewById(R.id.fab7);
        final FloatingActionButton b8=myview2.findViewById(R.id.fab8);
        final Button merOrarioV=myview2.findViewById(R.id.merOrario);
        final Button mer1OrarioV=myview2.findViewById(R.id.mer1Orario);
        final Button mer2OrarioV=myview2.findViewById(R.id.mer2Orario);
        final Button mer3OrarioV=myview2.findViewById(R.id.mer3Orario);
        final Button mer4OrarioV=myview2.findViewById(R.id.mer4Orario);
        //testi
        final TextView merMateriaV=myview2.findViewById(R.id.merMateria);
        final TextView merClasseV=myview2.findViewById(R.id.merClasse);
        final TextView mer1MateriaV=myview2.findViewById(R.id.mer1Materia);
        final TextView mer1ClasseV=myview2.findViewById(R.id.mer1Classe);
        final TextView mer2MateriaV=myview2.findViewById(R.id.mer2Materia);
        final TextView mer2ClasseV=myview2.findViewById(R.id.mer2Classe);
        final TextView mer3MateriaV=myview2.findViewById(R.id.mer3Materia);
        final TextView mer3ClasseV=myview2.findViewById(R.id.mer3Classe);
        final TextView mer4MateriaV=myview2.findViewById(R.id.mer4Materia);
        final TextView mer4ClasseV=myview2.findViewById(R.id.mer4Classe);





        lunMateriaS=sharedPreferences2.getString("lunMateriaS",lunMateriaS);
        lunClasseS=sharedPreferences2.getString("lunClasseS",lunClasseS);
        lunOrarioS=sharedPreferences2.getString("lunOrarioS",lunOrarioS);

        lun1MateriaS=sharedPreferences2.getString("lun1MateriaS",lun1MateriaS);
        lun1ClasseS=sharedPreferences2.getString("lun1ClasseS",lun1ClasseS);
        lun1OrarioS=sharedPreferences2.getString("lun1OrarioS",lun1OrarioS);

        lun2MateriaS=sharedPreferences2.getString("lun2MateriaS",lun2MateriaS);
        lun2ClasseS=sharedPreferences2.getString("lun2ClasseS",lun2ClasseS);
        lun2OrarioS=sharedPreferences2.getString("lun2OrarioS",lun2OrarioS);

        lun3MateriaS=sharedPreferences2.getString("lun3MateriaS",lun3MateriaS);
        lun3ClasseS=sharedPreferences2.getString("lun3ClasseS",lun3ClasseS);
        lun3OrarioS=sharedPreferences2.getString("lun3OrarioS",lun3OrarioS);

        lun4MateriaS=sharedPreferences2.getString("lun4MateriaS",lun4MateriaS);
        lun4ClasseS=sharedPreferences2.getString("lun4ClasseS",lun4ClasseS);
        lun4OrarioS=sharedPreferences2.getString("lun4OrarioS",lun4OrarioS);



        merMateriaV.setText(lunMateriaS);
        merClasseV.setText(lunClasseS);
        merOrarioV.setText(lunOrarioS);

        mer1MateriaV.setText(lun1MateriaS);
        mer1ClasseV.setText(lun1ClasseS);
        mer1OrarioV.setText(lun1OrarioS);

        mer2MateriaV.setText(lun2MateriaS);
        mer2ClasseV.setText(lun2ClasseS);
        mer2OrarioV.setText(lun2OrarioS);

        mer3MateriaV.setText(lun3MateriaS);
        mer3ClasseV.setText(lun3ClasseS);
        mer3OrarioV.setText(lun3OrarioS);

        mer4MateriaV.setText(lun4MateriaS);
        mer4ClasseV.setText(lun4ClasseS);
        mer4OrarioV.setText(lun4OrarioS);

       if(lunMateriaS.length()==0){

            merMateriaV.setVisibility(myview2.INVISIBLE);
            merClasseV.setVisibility(myview2.INVISIBLE);
            merOrarioV.setVisibility(myview2.INVISIBLE);
        }
        else    count++;
        if(lun1MateriaS.length()==0){

            mer1MateriaV.setVisibility(myview2.INVISIBLE);
            mer1ClasseV.setVisibility(myview2.INVISIBLE);
            mer1OrarioV.setVisibility(myview2.INVISIBLE);
        }
        else count++;

        if(lun2MateriaS.length()==0){

            mer2MateriaV.setVisibility(myview2.INVISIBLE);
            mer2ClasseV.setVisibility(myview2.INVISIBLE);
            mer2OrarioV.setVisibility(myview2.INVISIBLE);
        }
        else    count++;

        if(lun3MateriaS.length()==0){

            mer3MateriaV.setVisibility(myview2.INVISIBLE);
            mer3ClasseV.setVisibility(myview2.INVISIBLE);
            mer3OrarioV.setVisibility(myview2.INVISIBLE);
        }
        else    count++;

        if(lun4MateriaS.length()==0){

            mer4MateriaV.setVisibility(myview2.INVISIBLE);
            mer4ClasseV.setVisibility(myview2.INVISIBLE);
            mer4OrarioV.setVisibility(myview2.INVISIBLE);
        }
        else    count++;




        b6.setOnClickListener(new View.OnClickListener() {
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

                                    merMateriaV.setText(lunMateriaS);
                                    merClasseV.setText(lunClasseS);
                                    merOrarioV.setText(lunOrarioS);


                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    edit.putString("lunClasseS",lunClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                    edit1.putString("lunMateriaS",lunMateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    edit2.putString("lunOrarioS",lunOrarioS);
                                    edit2.commit();




                                    merMateriaV.setVisibility(View.VISIBLE);
                                    merClasseV.setVisibility(View.VISIBLE);
                                    merOrarioV.setVisibility(View.VISIBLE);
                                }
                                else if(lun1MateriaS.length()==0){

                                    lun1MateriaS=temp;
                                    lun1ClasseS=temp1;
                                    lun1OrarioS=temp2;

                                    mer1MateriaV.setText(lun1MateriaS);
                                    mer1ClasseV.setText(lun1ClasseS);
                                    mer1OrarioV.setText(lun1OrarioS);

                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    edit.putString("lun1ClasseS",lun1ClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                    edit1.putString("lun1MateriaS",lun1MateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    edit2.putString("lun1OrarioS",lun1OrarioS);
                                    edit2.commit();





                                    mer1MateriaV.setVisibility(View.VISIBLE);
                                    mer1ClasseV.setVisibility(View.VISIBLE);
                                    mer1OrarioV.setVisibility(View.VISIBLE);
                                }

                                else if(lun2MateriaS.length()==0){

                                    lun2MateriaS=temp;
                                    lun2ClasseS=temp1;
                                    lun2OrarioS=temp2;

                                    mer2MateriaV.setText(lun2MateriaS);
                                    mer2ClasseV.setText(lun2ClasseS);
                                    mer2OrarioV.setText(lun2OrarioS);

                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    edit.putString("lun2ClasseS",lun2ClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                    edit1.putString("lun2MateriaS",lun2MateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    edit2.putString("lun2OrarioS",lun2OrarioS);
                                    edit2.commit();





                                    mer2MateriaV.setVisibility(View.VISIBLE);
                                    mer2ClasseV.setVisibility(View.VISIBLE);
                                    mer2OrarioV.setVisibility(View.VISIBLE);
                                }

                                else if(lun3MateriaS.length()==0){
                                    lun3MateriaS=temp;
                                    lun3ClasseS=temp1;
                                    lun3OrarioS=temp2;

                                    mer3MateriaV.setText(lun3MateriaS);
                                    mer3ClasseV.setText(lun3ClasseS);
                                    mer3OrarioV.setText(lun3OrarioS);


                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    edit.putString("lun3ClasseS",lun3ClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                    edit1.putString("lun3MateriaS",lun3MateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    edit2.putString("lun3OrarioS",lun3OrarioS);
                                    edit2.commit();




                                    mer3MateriaV.setVisibility(View.VISIBLE);
                                    mer3ClasseV.setVisibility(View.VISIBLE);
                                    mer3OrarioV.setVisibility(View.VISIBLE);
                                }

                               else if(lun4MateriaS.length()==0){
                                    lun4MateriaS=temp;
                                    lun4ClasseS=temp1;
                                    lun4OrarioS=temp2;

                                    mer4MateriaV.setText(lun4MateriaS);
                                    mer4ClasseV.setText(lun4ClasseS);
                                    mer4OrarioV.setText(lun4OrarioS);


                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    edit.putString("lun4ClasseS",lun4ClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                    edit1.putString("lun4MateriaS",lun4MateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    edit2.putString("lun4OrarioS",lun4OrarioS);
                                    edit2.commit();




                                    mer4MateriaV.setVisibility(View.VISIBLE);
                                    mer4ClasseV.setVisibility(View.VISIBLE);
                                    mer4OrarioV.setVisibility(View.VISIBLE);
                                }

                            }






                            dialog.cancel();
                        }
                    });
                    builder.show();
                }

            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
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
                                builder1.setTitle("               Edi parameters");
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

                                                merMateriaV.setText(lunMateriaS);
                                                merClasseV.setText(lunClasseS);
                                                merOrarioV.setText(lunOrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences2.edit();
                                                edit.putString("lunClasseS",lunClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                                edit1.putString("lunMateriaS",lunMateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                                edit2.putString("lunOrarioS",lunOrarioS);
                                                edit2.commit();
                                            }
                                            else if(scelto==2){
                                                lun1MateriaS=input.getText().toString();
                                                lun1ClasseS=input1.getText().toString();
                                                lun1OrarioS=input2.getText().toString();

                                                mer1MateriaV.setText(lun1MateriaS);
                                                mer1ClasseV.setText(lun1ClasseS);
                                                mer1OrarioV.setText(lun1OrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences2.edit();
                                                edit.putString("lun1ClasseS",lun1ClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                                edit1.putString("lun1MateriaS",lun1MateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                                edit2.putString("lun1OrarioS",lun1OrarioS);
                                                edit2.commit();
                                            }

                                           else if(scelto==3){
                                                lun2MateriaS=input.getText().toString();
                                                lun2ClasseS=input1.getText().toString();
                                                lun2OrarioS=input2.getText().toString();

                                                mer2MateriaV.setText(lun2MateriaS);
                                                mer2ClasseV.setText(lun2ClasseS);
                                                mer2OrarioV.setText(lun2OrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences2.edit();
                                                edit.putString("lun2ClasseS",lun2ClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                                edit1.putString("lun2MateriaS",lun2MateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                                edit2.putString("lun2OrarioS",lun2OrarioS);
                                                edit2.commit();
                                            }
                                           else if(scelto==4){
                                                lun3MateriaS=input.getText().toString();
                                                lun3ClasseS=input1.getText().toString();
                                                lun3OrarioS=input2.getText().toString();

                                                mer3MateriaV.setText(lun3MateriaS);
                                                mer3ClasseV.setText(lun3ClasseS);
                                                mer3OrarioV.setText(lun3OrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences2.edit();
                                                edit.putString("lun3ClasseS",lun3ClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                                edit1.putString("lun3MateriaS",lun3MateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                                edit2.putString("lun3OrarioS",lun3OrarioS);
                                                edit2.commit();
                                            }
                                            if(scelto==5){
                                                lun4MateriaS=input.getText().toString();
                                                lun4ClasseS=input1.getText().toString();
                                                lun4OrarioS=input2.getText().toString();

                                                mer4MateriaV.setText(lun4MateriaS);
                                                mer4ClasseV.setText(lun4ClasseS);
                                                mer4OrarioV.setText(lun4OrarioS);

                                                SharedPreferences.Editor edit = sharedPreferences2.edit();
                                                edit.putString("lun4ClasseS",lun4ClasseS);
                                                edit.commit();

                                                SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                                edit1.putString("lun4MateriaS",lun4MateriaS);
                                                edit1.commit();

                                                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
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

        b8.setOnClickListener(new View.OnClickListener() {
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

                                    merMateriaV.setText(lunMateriaS);
                                    merClasseV.setText(lunClasseS);
                                    merOrarioV.setText(lunOrarioS);

                                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                                    edit.putString("lunClasseS",lunClasseS);
                                    edit.commit();

                                    SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                    edit1.putString("lunMateriaS",lunMateriaS);
                                    edit1.commit();

                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    edit2.putString("lunOrarioS",lunOrarioS);
                                    edit2.commit();

                                    merMateriaV.setVisibility(myview2.INVISIBLE);
                                    merClasseV.setVisibility(myview2.INVISIBLE);
                                    merOrarioV.setVisibility(myview2.INVISIBLE);

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

                                        merMateriaV.setText(lunMateriaS);
                                        merClasseV.setText(lunClasseS);
                                        merOrarioV.setText(lunOrarioS);

                                        mer1MateriaV.setText(lun1MateriaS);
                                        mer1ClasseV.setText(lun1ClasseS);
                                        mer1OrarioV.setText(lun1OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences2.edit();
                                        edit.putString("lunClasseS",lunClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                        edit1.putString("lunMateriaS",lunMateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                        edit2.putString("lunOrarioS",lunOrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences2.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences2.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences2.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        mer1MateriaV.setVisibility(myview2.INVISIBLE);
                                        mer1ClasseV.setVisibility(myview2.INVISIBLE);
                                        mer1OrarioV.setVisibility(myview2.INVISIBLE);
                                    } else if (scelto == 2) {

                                        lun1MateriaS="";
                                        lun1ClasseS="";
                                        lun1OrarioS="";

                                        mer1MateriaV.setText(lun1MateriaS);
                                        mer1ClasseV.setText(lun1ClasseS);
                                        mer1OrarioV.setText(lun1OrarioS);

                                        SharedPreferences.Editor edit3 = sharedPreferences2.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences2.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences2.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        mer1MateriaV.setVisibility(myview2.INVISIBLE);
                                        mer1ClasseV.setVisibility(myview2.INVISIBLE);
                                        mer1OrarioV.setVisibility(myview2.INVISIBLE);
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

                                        merMateriaV.setText(lunMateriaS);
                                        merClasseV.setText(lunClasseS);
                                        merOrarioV.setText(lunOrarioS);

                                        mer1MateriaV.setText(lun1MateriaS);
                                        mer1ClasseV.setText(lun1ClasseS);
                                        mer1OrarioV.setText(lun1OrarioS);

                                        mer2MateriaV.setText(lun2MateriaS);
                                        mer2ClasseV.setText(lun2ClasseS);
                                        mer2OrarioV.setText(lun2OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences2.edit();
                                        edit.putString("lunClasseS",lunClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                        edit1.putString("lunMateriaS",lunMateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                        edit2.putString("lunOrarioS",lunOrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences2.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences2.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences2.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        SharedPreferences.Editor edit6 = sharedPreferences2.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences2.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences2.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();

                                        mer2MateriaV.setVisibility(myview2.INVISIBLE);
                                        mer2ClasseV.setVisibility(myview2.INVISIBLE);
                                        mer2OrarioV.setVisibility(myview2.INVISIBLE);
                                    } else if (scelto == 2) {
                                        lun1MateriaS=lun2MateriaS;
                                        lun1ClasseS=lun2ClasseS;
                                        lun1OrarioS=lun2OrarioS;

                                        lun2MateriaS="";
                                        lun2ClasseS="";
                                        lun2OrarioS="";

                                        mer1MateriaV.setText(lun1MateriaS);
                                        mer1ClasseV.setText(lun1ClasseS);
                                        mer1OrarioV.setText(lun1OrarioS);

                                        mer2MateriaV.setText(lun2MateriaS);
                                        mer2ClasseV.setText(lun2ClasseS);
                                        mer2OrarioV.setText(lun2OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences2.edit();
                                        edit.putString("lun1ClasseS",lun1ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                        edit1.putString("lun1MateriaS",lun1MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                        edit2.putString("lun1OrarioS",lun1OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit6 = sharedPreferences2.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences2.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences2.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();

                                        mer2MateriaV.setVisibility(myview2.INVISIBLE);
                                        mer2ClasseV.setVisibility(myview2.INVISIBLE);
                                        mer2OrarioV.setVisibility(myview2.INVISIBLE);
                                    }
                                    else if(scelto==3){

                                        lun2MateriaS="";
                                        lun2ClasseS="";
                                        lun2OrarioS="";

                                        mer2MateriaV.setText(lun2MateriaS);
                                        mer2ClasseV.setText(lun2ClasseS);
                                        mer2OrarioV.setText(lun2OrarioS);

                                        SharedPreferences.Editor edit6 = sharedPreferences2.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences2.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences2.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();


                                        mer2MateriaV.setVisibility(myview2.INVISIBLE);
                                        mer2ClasseV.setVisibility(myview2.INVISIBLE);
                                        mer2OrarioV.setVisibility(myview2.INVISIBLE);
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

                                        merMateriaV.setText(lunMateriaS);
                                        merClasseV.setText(lunClasseS);
                                        merOrarioV.setText(lunOrarioS);

                                        mer1MateriaV.setText(lun1MateriaS);
                                        mer1ClasseV.setText(lun1ClasseS);
                                        mer1OrarioV.setText(lun1OrarioS);

                                        mer2MateriaV.setText(lun2MateriaS);
                                        mer2ClasseV.setText(lun2ClasseS);
                                        mer2OrarioV.setText(lun2OrarioS);

                                        mer3MateriaV.setText(lun3MateriaS);
                                        mer3ClasseV.setText(lun3ClasseS);
                                        mer3OrarioV.setText(lun3OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences2.edit();
                                        edit.putString("lunClasseS",lunClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                        edit1.putString("lunMateriaS",lunMateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                        edit2.putString("lunOrarioS",lunOrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences2.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences2.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences2.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        SharedPreferences.Editor edit6 = sharedPreferences2.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences2.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences2.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();

                                        SharedPreferences.Editor edit9 = sharedPreferences2.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences2.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences2.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        mer3MateriaV.setVisibility(myview2.INVISIBLE);
                                        mer3ClasseV.setVisibility(myview2.INVISIBLE);
                                        mer3OrarioV.setVisibility(myview2.INVISIBLE);
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


                                        mer1MateriaV.setText(lun1MateriaS);
                                        mer1ClasseV.setText(lun1ClasseS);
                                        mer1OrarioV.setText(lun1OrarioS);

                                        mer2MateriaV.setText(lun2MateriaS);
                                        mer2ClasseV.setText(lun2ClasseS);
                                        mer2OrarioV.setText(lun2OrarioS);

                                        mer3MateriaV.setText(lun3MateriaS);
                                        mer3ClasseV.setText(lun3ClasseS);
                                        mer3OrarioV.setText(lun3OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences2.edit();
                                        edit.putString("lun1ClasseS",lun1ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                        edit1.putString("lun1MateriaS",lun1MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                        edit2.putString("lun1OrarioS",lun1OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences2.edit();
                                        edit3.putString("lun2ClasseS",lun2ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences2.edit();
                                        edit4.putString("lun2MateriaS",lun2MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences2.edit();
                                        edit5.putString("lun2OrarioS",lun2OrarioS);
                                        edit5.commit();

                                        SharedPreferences.Editor edit9 = sharedPreferences2.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences2.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences2.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        mer3MateriaV.setVisibility(myview2.INVISIBLE);
                                        mer3ClasseV.setVisibility(myview2.INVISIBLE);
                                        mer3OrarioV.setVisibility(myview2.INVISIBLE);
                                    }
                                    else if(scelto==3){
                                        lun2MateriaS=lun3MateriaS;
                                        lun2ClasseS=lun3ClasseS;
                                        lun2OrarioS=lun3OrarioS;

                                        lun3MateriaS="";
                                        lun3ClasseS="";
                                        lun3OrarioS="";

                                        mer2MateriaV.setText(lun2MateriaS);
                                        mer2ClasseV.setText(lun2ClasseS);
                                        mer2OrarioV.setText(lun2OrarioS);

                                        mer3MateriaV.setText(lun3MateriaS);
                                        mer3ClasseV.setText(lun3ClasseS);
                                        mer3OrarioV.setText(lun3OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences2.edit();
                                        edit.putString("lun2ClasseS",lun2ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                        edit1.putString("lun2MateriaS",lun2MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                        edit2.putString("lun2OrarioS",lun2OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit9 = sharedPreferences2.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences2.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences2.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        mer3MateriaV.setVisibility(myview2.INVISIBLE);
                                        mer3ClasseV.setVisibility(myview2.INVISIBLE);
                                        mer3OrarioV.setVisibility(myview2.INVISIBLE);
                                    }
                                    else if(scelto==4){
                                        lun3MateriaS="";
                                        lun3ClasseS="";
                                        lun3OrarioS="";

                                        mer3MateriaV.setText(lun3MateriaS);
                                        mer3ClasseV.setText(lun3ClasseS);
                                        mer3OrarioV.setText(lun3OrarioS);

                                        SharedPreferences.Editor edit9 = sharedPreferences2.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences2.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences2.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();


                                        mer3MateriaV.setVisibility(myview2.INVISIBLE);
                                        mer3ClasseV.setVisibility(myview2.INVISIBLE);
                                        mer3OrarioV.setVisibility(myview2.INVISIBLE);
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

                                        merMateriaV.setText(lunMateriaS);
                                        merClasseV.setText(lunClasseS);
                                        merOrarioV.setText(lunOrarioS);

                                        mer1MateriaV.setText(lun1MateriaS);
                                        mer1ClasseV.setText(lun1ClasseS);
                                        mer1OrarioV.setText(lun1OrarioS);

                                        mer2MateriaV.setText(lun2MateriaS);
                                        mer2ClasseV.setText(lun2ClasseS);
                                        mer2OrarioV.setText(lun2OrarioS);

                                        mer3MateriaV.setText(lun3MateriaS);
                                        mer3ClasseV.setText(lun3ClasseS);
                                        mer3OrarioV.setText(lun3OrarioS);

                                        mer4MateriaV.setText(lun4MateriaS);
                                        mer4ClasseV.setText(lun4ClasseS);
                                        mer4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences2.edit();
                                        edit.putString("lunClasseS",lunClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                        edit1.putString("lunMateriaS",lunMateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                        edit2.putString("lunOrarioS",lunOrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences2.edit();
                                        edit3.putString("lun1ClasseS",lun1ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences2.edit();
                                        edit4.putString("lun1MateriaS",lun1MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences2.edit();
                                        edit5.putString("lun1OrarioS",lun1OrarioS);
                                        edit5.commit();

                                        SharedPreferences.Editor edit6 = sharedPreferences2.edit();
                                        edit6.putString("lun2ClasseS",lun2ClasseS);
                                        edit6.commit();

                                        SharedPreferences.Editor edit7 = sharedPreferences2.edit();
                                        edit7.putString("lun2MateriaS",lun2MateriaS);
                                        edit7.commit();

                                        SharedPreferences.Editor edit8 = sharedPreferences2.edit();
                                        edit8.putString("lun2OrarioS",lun2OrarioS);
                                        edit8.commit();

                                        SharedPreferences.Editor edit9 = sharedPreferences2.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences2.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences2.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        SharedPreferences.Editor edit12 = sharedPreferences2.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences2.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences2.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();

                                        mer4MateriaV.setVisibility(myview2.INVISIBLE);
                                        mer4ClasseV.setVisibility(myview2.INVISIBLE);
                                        mer4OrarioV.setVisibility(myview2.INVISIBLE);
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

                                        mer1MateriaV.setText(lun1MateriaS);
                                        mer1ClasseV.setText(lun1ClasseS);
                                        mer1OrarioV.setText(lun1OrarioS);

                                        mer2MateriaV.setText(lun2MateriaS);
                                        mer2ClasseV.setText(lun2ClasseS);
                                        mer2OrarioV.setText(lun2OrarioS);

                                        mer3MateriaV.setText(lun3MateriaS);
                                        mer3ClasseV.setText(lun3ClasseS);
                                        mer3OrarioV.setText(lun3OrarioS);

                                        mer4MateriaV.setText(lun4MateriaS);
                                        mer4ClasseV.setText(lun4ClasseS);
                                        mer4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences2.edit();
                                        edit.putString("lun1ClasseS",lun1ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                        edit1.putString("lun1MateriaS",lun1MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                        edit2.putString("lun1OrarioS",lun1OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit3 = sharedPreferences2.edit();
                                        edit3.putString("lun2ClasseS",lun2ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences2.edit();
                                        edit4.putString("lun2MateriaS",lun2MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences2.edit();
                                        edit5.putString("lun2OrarioS",lun2OrarioS);
                                        edit5.commit();


                                        SharedPreferences.Editor edit9 = sharedPreferences2.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences2.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences2.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        SharedPreferences.Editor edit12 = sharedPreferences2.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences2.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences2.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();

                                        mer4MateriaV.setVisibility(myview2.INVISIBLE);
                                        mer4ClasseV.setVisibility(myview2.INVISIBLE);
                                        mer4OrarioV.setVisibility(myview2.INVISIBLE);
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


                                        mer2MateriaV.setText(lun2MateriaS);
                                        mer2ClasseV.setText(lun2ClasseS);
                                        mer2OrarioV.setText(lun2OrarioS);
                                        mer3MateriaV.setText(lun3MateriaS);
                                        mer3ClasseV.setText(lun3ClasseS);
                                        mer3OrarioV.setText(lun3OrarioS);

                                        mer4MateriaV.setText(lun4MateriaS);
                                        mer4ClasseV.setText(lun4ClasseS);
                                        mer4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit3 = sharedPreferences2.edit();
                                        edit3.putString("lun2ClasseS",lun2ClasseS);
                                        edit3.commit();

                                        SharedPreferences.Editor edit4 = sharedPreferences2.edit();
                                        edit4.putString("lun2MateriaS",lun2MateriaS);
                                        edit4.commit();

                                        SharedPreferences.Editor edit5 = sharedPreferences2.edit();
                                        edit5.putString("lun2OrarioS",lun2OrarioS);
                                        edit5.commit();


                                        SharedPreferences.Editor edit9 = sharedPreferences2.edit();
                                        edit9.putString("lun3ClasseS",lun3ClasseS);
                                        edit9.commit();

                                        SharedPreferences.Editor edit10 = sharedPreferences2.edit();
                                        edit10.putString("lun3MateriaS",lun3MateriaS);
                                        edit10.commit();

                                        SharedPreferences.Editor edit11 = sharedPreferences2.edit();
                                        edit11.putString("lun3OrarioS",lun3OrarioS);
                                        edit11.commit();

                                        SharedPreferences.Editor edit12 = sharedPreferences2.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences2.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences2.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();

                                        mer4MateriaV.setVisibility(myview2.INVISIBLE);
                                        mer4ClasseV.setVisibility(myview2.INVISIBLE);
                                        mer4OrarioV.setVisibility(myview2.INVISIBLE);

                                    }

                                    else if(scelto==4){
                                        lun3MateriaS=lun4MateriaS;
                                        lun3ClasseS=lun4ClasseS;
                                        lun3OrarioS=lun4OrarioS;

                                        lun4MateriaS="";
                                        lun4ClasseS="";
                                        lun4OrarioS="";


                                        mer3MateriaV.setText(lun3MateriaS);
                                        mer3ClasseV.setText(lun3ClasseS);
                                        mer3OrarioV.setText(lun3OrarioS);

                                        mer4MateriaV.setText(lun4MateriaS);
                                        mer4ClasseV.setText(lun4ClasseS);
                                        mer4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit = sharedPreferences2.edit();
                                        edit.putString("lun3ClasseS",lun3ClasseS);
                                        edit.commit();

                                        SharedPreferences.Editor edit1 = sharedPreferences2.edit();
                                        edit1.putString("lun3MateriaS",lun3MateriaS);
                                        edit1.commit();

                                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                        edit2.putString("lun3OrarioS",lun3OrarioS);
                                        edit2.commit();

                                        SharedPreferences.Editor edit12 = sharedPreferences2.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences2.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences2.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();

                                        mer4MateriaV.setVisibility(myview2.INVISIBLE);
                                        mer4ClasseV.setVisibility(myview2.INVISIBLE);
                                        mer4OrarioV.setVisibility(myview2.INVISIBLE);
                                    }
                                    else if(scelto==5){
                                        lun4MateriaS="";
                                        lun4ClasseS="";
                                        lun4OrarioS="";

                                        mer4MateriaV.setText(lun4MateriaS);
                                        mer4ClasseV.setText(lun4ClasseS);
                                        mer4OrarioV.setText(lun4OrarioS);

                                        SharedPreferences.Editor edit12 = sharedPreferences2.edit();
                                        edit12.putString("lun4ClasseS",lun4ClasseS);
                                        edit12.commit();

                                        SharedPreferences.Editor edit13 = sharedPreferences2.edit();
                                        edit13.putString("lun4MateriaS",lun4MateriaS);
                                        edit13.commit();

                                        SharedPreferences.Editor edit14 = sharedPreferences2.edit();
                                        edit14.putString("lun4OrarioS",lun4OrarioS);
                                        edit14.commit();


                                        mer4MateriaV.setVisibility(myview2.INVISIBLE);
                                        mer4ClasseV.setVisibility(myview2.INVISIBLE);
                                        mer4OrarioV.setVisibility(myview2.INVISIBLE);
                                    }






                                }

                            }
                        }
                            });

                    builder.show();
                }

            }
        });

        return myview2;
    }
}
