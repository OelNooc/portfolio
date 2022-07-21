package cl.nooc.portafolio.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import cl.nooc.portafolio.R
import cl.nooc.portafolio.databinding.FragmentEducationBinding

class EducationFragment : Fragment() {

    private lateinit var binding: FragmentEducationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        (activity as AppCompatActivity).supportActionBar?.title = getString(R.string.ab_education)

        binding = FragmentEducationBinding.inflate(inflater, container, false)

        with(binding) {
            fbtnBackEd.setOnClickListener {
                Navigation.findNavController(requireView())
                    .navigate(R.id.action_educationFragment_to_proyectsFragment)
            }

            fbtnNextEd.setOnClickListener {
                Navigation.findNavController(requireView())
                    .navigate(R.id.action_proyectsFragment_to_educationFragment)
            }
        }

        return binding.root
    }

}