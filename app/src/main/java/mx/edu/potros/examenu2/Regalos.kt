package mx.edu.potros.examenu2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class Regalos : AppCompatActivity() {

    var regalos = ArrayList<Detalles>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regalos)

        var menuOption: String? = intent.getStringExtra("gridType")
    }

    class RegaloAdapter: BaseAdapter {

        var regalos = ArrayList<Detalles>()
        var contexto: Context? = null

        constructor(contexto: Context, regalos: ArrayList<Detalles>): super() {
            this.regalos = regalos
            this.contexto = contexto
        }

        override fun getCount(): Int {
            return regalos.size
        }

        override fun getItem(position: Int): Any {
            return regalos[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var regalo = regalos[position]
            var inflator = LayoutInflater.from(contexto)
            var vista = inflator.inflate(R.layout.detalle_regalos, null)
            var image: ImageView = vista.findViewById(R.id.iv_regalo_imagen)
            var precio: TextView = vista.findViewById(R.id.tv_regalo_precio)

            image.setImageResource(regalo.image)
            precio.setText("$${regalo.precio}")

            return vista
        }
    }
}