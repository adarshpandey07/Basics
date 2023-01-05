package com.example.tasks10

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class FirstFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Debug1","onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Debug1","onCreate")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("Debug1","onCreateView")
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Debug1","onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Debug1","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Debug1","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Debug1","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Debug1","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Debug1","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Debug1","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Debug1","onDetach")
    }
}