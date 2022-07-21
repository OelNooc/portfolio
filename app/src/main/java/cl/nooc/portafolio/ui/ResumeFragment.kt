package cl.nooc.portafolio.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import cl.nooc.portafolio.R
import cl.nooc.portafolio.databinding.FragmentResumeBinding

class ResumeFragment : Fragment() {

    private lateinit var binding: FragmentResumeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        (activity as AppCompatActivity).supportActionBar?.title = (getString(R.string.ab_resume))

        binding = FragmentResumeBinding.inflate(inflater, container, false)

        with(binding) {
            fbtnForward.setOnClickListener {
                Navigation.findNavController(requireView())
                    .navigate(R.id.action_resumeFragment_to_proyectsFragment)
            }
            ivPhoto.setImageResource(R.drawable.perfil)

            return binding.root
        }
    }
}