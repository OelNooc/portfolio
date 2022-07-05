package cl.nooc.portafolio.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import cl.nooc.portafolio.R
import cl.nooc.portafolio.databinding.FragmentProyectsBinding

class ProyectsFragment : Fragment() {

    private lateinit var binding: FragmentProyectsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentProyectsBinding.inflate(inflater, container, false)

        with(binding) {
            fbtnPBack.setOnClickListener {
                Navigation.findNavController(requireView())
                    .navigate(R.id.action_proyectsFragment_to_resumeFragment)
            }

            fbtnPNext.setOnClickListener {
                Navigation.findNavController(requireView())
                    .navigate(R.id.action_proyectsFragment_to_educationFragment)
            }
        }

        return binding.root
    }

}