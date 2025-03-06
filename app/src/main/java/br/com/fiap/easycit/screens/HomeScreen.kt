package br.com.fiap.easycit.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.easycit.R
import br.com.fiap.easycit.backgrounds.HomeBackground
import br.com.fiap.easycit.components.CustomButton
import br.com.fiap.easycit.components.CustomOutlinedTextField

@Composable
fun HomeScreen(navController: NavController) {
    HomeBackground() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp, 30.dp, 30.dp, 90.dp)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                CustomButton(
                    modifier = Modifier
                        .offset(x = (-15).dp, y = (-12).dp)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(Color.LightGray)
                )
                CustomButton(
                    modifier = Modifier
                        .offset(x = 15.dp, y = (-12).dp)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(Color.LightGray),
                    onClick = {
                        navController.navigate("Login")
                    }
                )

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Text(
                    text = "Olá, Usuário",
                    fontSize = 20.sp)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Top


            ) {
                CustomOutlinedTextField(
                    modifier = Modifier
                        .height(70.dp),
                    label = "Digite o seu destino",
                    placeholder = "Digite o seu destino"

                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically


            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.map_img),
                        contentDescription = "",
                        Modifier.border(3.dp, Color.White, shape = RectangleShape)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    val navController = rememberNavController()
    HomeScreen(navController = navController)
}