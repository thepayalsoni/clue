package com.payalsoni.clue.fragments

import android.app.Activity.RESULT_OK
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.payalsoni.clue.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import android.content.Intent



class More : Fragment(){

    val RC_SIGN_IN =1

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.layout_more, container, false);
        val mAddProfile = view.findViewById<RelativeLayout>(R.id.rl_addProfile)
        mAddProfile.setOnClickListener(View.OnClickListener { view ->
            loadSignInFragment()
        })

        return view
    }

    fun loadSignInFragment()
    {
        var fragmentTransaction = activity!!.supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_container, SignInFragment())
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()

    }



}