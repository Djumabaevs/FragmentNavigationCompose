package com.example.fragmentnavigationcompose

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.fragmentnavigationcompose.ui.theme.HorizontalDottedProgress

class RecipeListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return ComposeView(requireContext()).apply {
            setContent {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = "Recipe List",
                        fontSize = 21.sp)
                    Spacer(modifier = Modifier.padding(10.dp))
                    Button(onClick = {
                        findNavController().navigate(R.id.viewRecipe)
                    }) {
                        Text(text = "To Recipe Fragment")

                        }
                    }
            }
        }



    /*    return ComposeView(requireContext()).apply {
            setContent {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Recipe List",
                        fontSize = 21.sp
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Button(onClick = {
                        findNavController().navigate(R.id.viewRecipe)
                    }
                    ) {
                        Text(text = "To Recipe Fragment")

                    }
                    
                }
            }
        }*/








       /* val view = inflater.inflate(R.layout.fragment_recipe_list, container, false)
        view.findViewById<ComposeView>(R.id.compose_view).setContent {
            Column(modifier = Modifier
                .border(border = BorderStroke(1.dp, Color.Black))
                .padding(16.dp))
            {

                Text(text = "This is a composable inside a fragment")
                Spacer(modifier = Modifier.padding(10.dp))
                CircularProgressIndicator()
                Spacer(modifier = Modifier.padding(10.dp))
                Text(text = "ALORE DANSE")
                Spacer(modifier = Modifier.padding(10.dp))

                val customView = HorizontalDottedProgress(LocalContext.current)
                AndroidView(factory = {customView})
            }
        }*/






    /*    val view = ComposeView(requireContext())
        view.apply {
            setContent { 
                Text(text = "Recipe List Composable")
            }
        }*/

    }
}