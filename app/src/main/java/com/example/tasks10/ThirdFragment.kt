package com.example.tasks10

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class ThirdFragment : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Debug2","onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Debug2","onCreate")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("Debug2","onCreateView")
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Debug2","onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Debug2","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Debug2","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Debug2","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Debug2","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Debug2","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Debug2","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Debug2","onDetach")
    }


}