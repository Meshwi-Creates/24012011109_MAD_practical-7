package com.meshwi.a24012011109_mad_practical_7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val personList = arrayListOf(

            Person(
                "1",
                "Yesenia Yang",
                "yesenia_yang@gnu.ac.in",
                "+917983385148",
                "16 Sackett Street, Courtland, Michigan",
                42.7336,
                -84.5553
            ),

            Person(
                "2",
                "Sosa Shaffer",
                "sosa_shaffer@gnu.ac.in",
                "+917979501912",
                "99 Union Street, Nicholson, Iowa",
                41.8995,
                -93.1843
            ),

            Person(
                "3",
                "Roberts Gill",
                "roberts_gill@gnu.ac.in",
                "+919241276734",
                "39 Tompkins Place, Bartonsville, Oklahoma",
                35.4676,
                -97.5164
            ),

            Person(
                "4",
                "Penelope Cooper",
                "penelope_cooper@gnu.ac.in",
                "+916836390000",
                "35 Aitken Place, Orovada, Maryland",
                39.0558,
                -76.6413
            ),

            Person(
                "5",
                "Park George",
                "park_george@gnu.ac.in",
                "+918895814051",
                "95 Woods Place, Ahwahnee, Nebraska",
                41.4925,
                -99.9018
            ),

            Person(
                "6",
                "Horne Koch",
                "horne_koch@gnu.ac.in",
                "+918797996598",
                "72 Oak Street, Denver, Colorado",
                39.7392,
                -104.9903
            ),

            Person(
                "7",
                "Emma Wilson",
                "emma_wilson@gnu.ac.in",
                "+919876543210",
                "24 Park Avenue, Austin, Texas",
                30.2672,
                -97.7431
            ),

            Person(
                "8",
                "Daniel Brown",
                "daniel_brown@gnu.ac.in",
                "+919812345678",
                "18 Lake Road, Seattle, Washington",
                47.6062,
                -122.3321
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_contact)

        recyclerView.adapter = PersonAdapter(personList)
    }
}