package com.example.pizzarias

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pizzarias.ui.theme.PizzariasTheme

class placedorders : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.placedorders)

        val orders = findViewById<TextView>(R.id.orders)

        val ordersFromCustomer = intent.getStringExtra(MainActivity.Key)

        orders.text ="your orders" + ordersFromCustomer.toString()

    }
}
