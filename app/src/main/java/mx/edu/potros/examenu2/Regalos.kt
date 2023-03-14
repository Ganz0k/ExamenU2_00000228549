package mx.edu.potros.examenu2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class Regalos : AppCompatActivity() {

    var regalos = ArrayList<Detalles>()
    var adapter: RegaloAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regalos)

        var gridOption: String? = intent.getStringExtra("gridType")
        agregarRegalos(gridOption)

        adapter = RegaloAdapter(this, regalos)

        var gridView: GridView = findViewById(R.id.detallesRegalos)
        gridView.adapter = adapter
    }

    fun agregarRegalos(opcion: String?) {
        when (opcion) {
            "detalles" -> {
                regalos.add(Detalles(R.drawable.cumplebotanas, "$280"))
                regalos.add(Detalles(R.drawable.cumplecheve, "$320"))
                regalos.add(Detalles(R.drawable.cumpleescolar, "$330"))
                regalos.add(Detalles(R.drawable.cumplepaletas, "$190"))
                regalos.add(Detalles(R.drawable.cumplesnack, "$150"))
                regalos.add(Detalles(R.drawable.cumplevinos, "$370"))
            }

            "globos" -> {
                regalos.add(Detalles(R.drawable.globoamor, "$240"))
                regalos.add(Detalles(R.drawable.globocumple, "$820"))
                regalos.add(Detalles(R.drawable.globofestejo, "$260"))
                regalos.add(Detalles(R.drawable.globonum, "$760"))
                regalos.add(Detalles(R.drawable.globoregalo, "$450"))
                regalos.add(Detalles(R.drawable.globos, "$240"))
            }

            "peluches" -> {
                regalos.add(Detalles(R.drawable.peluchemario, "$320"))
                regalos.add(Detalles(R.drawable.pelucheminecraft, "$320"))
                regalos.add(Detalles(R.drawable.peluchepeppa, "$290"))
                regalos.add(Detalles(R.drawable.peluches, "$"))
                regalos.add(Detalles(R.drawable.peluchesony, "$330"))
                regalos.add(Detalles(R.drawable.peluchestich, "$280"))
                regalos.add(Detalles(R.drawable.peluchevarios, "$195"))
            }

            "regalos" -> {
                regalos.add(Detalles(R.drawable.regaloazul, "$80"))
                regalos.add(Detalles(R.drawable.regalobebe, "$290"))
                regalos.add(Detalles(R.drawable.regalocajas, "$140"))
                regalos.add(Detalles(R.drawable.regalocolores, "$85"))
                regalos.add(Detalles(R.drawable.regalos, "$"))
                regalos.add(Detalles(R.drawable.regalovarios, "$75"))
            }

            "tazas" -> {
                regalos.add(Detalles(R.drawable.tazaabuela, "$120"))
                regalos.add(Detalles(R.drawable.tazalove, "$120"))
                regalos.add(Detalles(R.drawable.tazaquiero, "$260"))
                regalos.add(Detalles(R.drawable.tazas, "$280"))
            }
        }
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
            precio.setText(regalo.precio)

            return vista
        }
    }
}