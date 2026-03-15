
package com.example.examencomposefundamentals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
// ASEGÚRATE QUE ESTE IMPORT COINCIDA CON TU PROYECTO
import com.example.examencomposefundamentals.ui.theme.ExamenComposeFundamentalsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // Usa el nombre de tu tema actual
            ExamenComposeFundamentalsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ExamenProgramacion(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ExamenProgramacion(modifier: Modifier = Modifier) {
    val elementos = listOf("Hamburguesas", "Pizzas", "Tacos", "Comida China")

    Column(modifier = modifier.fillMaxSize()) {
        // Encabezado
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(Color.Blue),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Encabezado",
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold
            )
        }

        // Cajas centrales
        Row(modifier = Modifier.fillMaxWidth().height(350.dp)) {
            Column(
                modifier = Modifier.weight(1f).fillMaxHeight().background(Color.Green),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("Caja 1")
                Button(onClick = { }) { Text("Acción") }
            }

            Column(
                modifier = Modifier.weight(1f).fillMaxHeight().background(Color.Yellow),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("Caja 2")
                Button(onClick = { }) { Text("Acción") }
            }
        }

        // Lista
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
                .padding(10.dp)
        ) {
            Text("Lista de elementos", fontSize = 24.sp, fontWeight = FontWeight.ExtraBold)
        }

        LazyColumn(
            modifier = Modifier.fillMaxWidth().weight(1f).background(Color.LightGray).padding(horizontal = 10.dp)
        ) {
            items(elementos) { elemento ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(4.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color.White)
                        .padding(15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(Icons.Default.List, contentDescription = null, modifier = Modifier.padding(end = 12.dp))
                    Text(text = elemento)
                }
            }
        }

        // Pie de página
        Row(
            modifier = Modifier.fillMaxWidth().height(100.dp).background(Color.Red),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Pie de página", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPantalla() {
    ExamenComposeFundamentalsTheme {
        ExamenProgramacion()
    }
}