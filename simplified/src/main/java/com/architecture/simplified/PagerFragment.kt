package com.architecture.simplified

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.architecture.simplified.databinding.PagerView1Binding
import dagger.hilt.android.AndroidEntryPoint
import kotlin.properties.Delegates

@AndroidEntryPoint
class PagerFragment : Fragment() {
    private var bindings: PagerView1Binding by Delegates.notNull()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val position = requireArguments().getInt("position")
        bindings = PagerView1Binding.inflate(inflater, container, false).apply {
            index = position
            url = "https://epicon-vh.akamaihd.net/i/content/videos/2017/8/5950b6871d41c86c79000277_playlist.smil/master.m3u8?hdnea=st=1606383646~exp=1606988446~acl=/*~hmac=d634ff6ccdc755c67c9369fc1516b1f1f33a55215226a528bb3ffc7f95ae806a"
        }
        return bindings.root
    }
}

