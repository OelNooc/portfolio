package cl.nooc.portafolio.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.nooc.portafolio.R
import cl.nooc.portafolio.databinding.ProyectsItemsBinding
import cl.nooc.portafolio.modelo.Proyect

class ProyectsAdapter: RecyclerView.Adapter<ProyectsAdapter.CustomViewHolder>() {

    var lista = ArrayList<Proyect>()
    lateinit var listener: MiListener

    class CustomViewHolder(itemView: View, val listener: MiListener) : RecyclerView.ViewHolder(itemView)
    {
        private val binding = ProyectsItemsBinding.bind(itemView)

        fun bindData(proyect: Proyect)
        {
            with(binding)
            {
                ivIProyecto.setImageResource(proyect.imagen)
                tvNProyecto.text = proyect.nombre
                tvDProyecto.text = proyect.descripcion
                itemView.setOnClickListener {
                    listener.miOnClick(proyect)
                }
            }
        }
    }

    interface MiListener{
        fun miOnClick(proyect: Proyect)
    }

    fun setMiListener(listener: MiListener)
    {
        this.listener = listener
    }

    fun updateData(proyects: ArrayList<Proyect>)
    {
        lista = proyects
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.proyects_items,
        parent, false)
        return CustomViewHolder(view, listener)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bindData(lista[position])
    }

    override fun getItemCount(): Int = lista.size
}