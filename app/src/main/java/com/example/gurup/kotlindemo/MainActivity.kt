package com.example.gurup.kotlindemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.gurup.kotlindemo.demofolder.Animal
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val TAG="DEMO";
    var a=0;

    var dummy="sa"
    var ddd: String="asdsa";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello.setText("Hi")

        hello.setOnClickListener {
            hello.setText("Hello")

            var nextIntent = Intent(this ,SecondActivity::class.java)
            nextIntent.putExtra("key", "AB")

            startActivity(nextIntent)
        }

        dummy="assadasd"
        ddd="sndnasd"


        Log.d(TAG,"a : "+a);
        display(a)

        var animalObj=Animal("Zebra");
        animalObj.animalDisplay("Animals")
    }

    fun display(name : Int){
        var no=name+1;
        Log.d(TAG,"display  : "+no);


        var personObj =Person()
        personObj.personDisplay(no);
        personObj.names="Added"
        personObj.personDisplayInstance(personObj.names)
    }

    class Person {
        var names:String="";
        fun personDisplay(name : Int){
            Log.d("Inside public person" ,""+name);
            names= name.toString();

            Log.d("Inside public names" ,""+names);

        }

        fun personDisplayInstance(name : String){
            Log.d("Inside person instance" ,""+name);


        }


    }

}
