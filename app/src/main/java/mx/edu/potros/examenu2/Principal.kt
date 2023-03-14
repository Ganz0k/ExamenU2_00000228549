package mx.edu.potros.examenu2

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        var btnDetalles: Button = findViewById(R.id.btnDetalles) as Button
        var btnGlobos: Button = findViewById(R.id.btnGlobos) as Button
        var btnPeluches: Button = findViewById(R.id.btnPeluches) as Button
        var btnRegalos: Button = findViewById(R.id.btnRegalos) as Button
        var btnTazas: Button = findViewById(R.id.btnTazas) as Button

        btnDetalles.setOnClickListener {
            var intent: Intent = Intent(this, Regalos::class.java)
            intent.putExtra("gridType", "detalles")
            startActivity(intent)
        }

        btnGlobos.setOnClickListener {
            var intent: Intent = Intent(this, Regalos::class.java)
            intent.putExtra("gridType", "globos")
            startActivity(intent)
        }

        btnPeluches.setOnClickListener {
            var intent: Intent = Intent(this, Regalos::class.java)
            intent.putExtra("gridType", "peluches")
            startActivity(intent)
        }

        btnRegalos.setOnClickListener {
            var intent: Intent = Intent(this, Regalos::class.java)
            intent.putExtra("gridType", "regalos")
            startActivity(intent)
        }

        btnTazas.setOnClickListener {
            var intent: Intent = Intent(this, Regalos::class.java)
            intent.putExtra("gridType", "tazas")
            startActivity(intent)
        }
    }
}