package com.example.constraint_layout_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentForTile1()
        setContentForTile2()
        setContentForTile3()
        setContentForTile4()
    }

    private fun setContentForTile1() {
        val cardLayout = findViewById<View>(R.id.tile1)
        val tile = cardLayout.findViewById<View>(R.id.card_view_container)
        val name = tile.findViewById<TextView>(R.id.name)
        val amount = tile.findViewById<TextView>(R.id.amount)
        val type = tile.findViewById<TextView>(R.id.type)
        name.text = "EUR"
        amount.text = "192,42"
        type.text = "Savings"
        val color = resources.getColor(R.color.tile1)
        tile.setBackgroundColor(color)
    }
    private fun setContentForTile2() {
        val cardLayout = findViewById<View>(R.id.tile2)
        val tile = cardLayout.findViewById<View>(R.id.card_view_container)
        val name = tile.findViewById<TextView>(R.id.name)
        val amount = tile.findViewById<TextView>(R.id.amount)
        val type = tile.findViewById<TextView>(R.id.type)
        name.text = "USD"
        amount.text = "321,42"
        type.text = "Expense"
        val color = resources.getColor(R.color.tile2)
        tile.setBackgroundColor(color)
    }
    private fun setContentForTile3() {
        val cardLayout = findViewById<View>(R.id.tile3)
        val tile = cardLayout.findViewById<View>(R.id.card_view_container)
        val name = tile.findViewById<TextView>(R.id.name)
        val amount = tile.findViewById<TextView>(R.id.amount)
        val type = tile.findViewById<TextView>(R.id.type)
        name.text = "USD"
        amount.text = "994,10"
        type.text = "Main Income"
        val color = resources.getColor(R.color.tile3)
        tile.setBackgroundColor(color)
    }
    private fun setContentForTile4() {
        val cardLayout = findViewById<View>(R.id.tile4)
        val tile = cardLayout.findViewById<View>(R.id.card_view_container)
        val name = tile.findViewById<TextView>(R.id.name)
        val amount = tile.findViewById<TextView>(R.id.amount)
        val type = tile.findViewById<TextView>(R.id.type)
        name.text = "USD"
        amount.text = "3.892,13"
        type.text = "Assests"
        val color = resources.getColor(R.color.tile4)
        tile.setBackgroundColor(color)
    }

}