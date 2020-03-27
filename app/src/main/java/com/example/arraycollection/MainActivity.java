package com.example.arraycollection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //declaring and intializing an array
        int[] myFavNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //showing the result to Logcat
        Log.i("Mytag", "First Element of An Array: " + myFavNum[0] + "");
        //if the index is greater than the number of element in an
        // array the arrayOutOfBoundException will happen
        // Log.i("Mytag",myFavNum[10]+"");

        //Showing the last element of an array using index
        Log.i("Mytag", "Last element of an array: " + myFavNum[9] + "");

        //Accessing the total number of element in an array

        Log.i("Mytag", "Length of an array: " + myFavNum.length + "");

        //Showing the element of last element of an array

        Log.i("Mytag", "Last element of an array: " + myFavNum[myFavNum.length - 1] + "");

        //Declaring an arrayList

        ArrayList myFavAni = new ArrayList();

        //adding element to the arrayList
        myFavAni.add("Lion");
        myFavAni.add("Tigar");
        myFavAni.add("Lepard");

        //accessing element using index

        Log.i("Mytag", "ArrayList first Elemet: " + myFavAni.get(0));
        //Removing Item froom arrayList
        myFavAni.remove(0);
        Log.i("Mytag", "Total size: " + myFavAni.size());

        myFavAni.add("Fish");

        //Printing all the value from an arrayList
        Log.i("Mytag", "All the value in arrayList: " + myFavAni.toString());

        //ArrayList can take any type of value simultaneously

        myFavAni.add(4);

        Log.i("Mytag", "All the value in arrayList: " + myFavAni.toString());

        //Declaring an explicitly declared data type

        ArrayList<String> myfriends = new ArrayList<>();
        myfriends.add("A");
        myfriends.add("B");
        myfriends.add("C");
        //cant insert integer type data hence it is declared as string
        //  myfriends.add(3);

        //Array and arrayList is an ordered list of
        // values but the hashmap is the unordered list of values

        HashMap myValue = new HashMap();

        myValue.put("MBD", "1st December");
        myValue.put("MFS", "Hatey Khari High School");
        myValue.put("MBB", 1.2);
        myValue.put("MW", 98.55);


        Log.i("Mytag", myValue.toString());

        myValue.remove("MW");
        Log.i("Mytag", myValue.toString());

        //printing the size of a Hashmap

        Log.i("Mytag", String.valueOf(myValue.size()));

        // Declaring an diff way

        String[] myFriends = new String[5];
        myFriends[0] = "Ali";
        myFriends[1] = "Ashraf";
        myFriends[2] = "Ahmed";
        myFriends[3] = "Liton";
        myFriends[4] = "Ishaq";

        Log.i("Mytag", myFriends.length + "");


    }
}
