package br.com.fiap.easycit.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.easycit.R
import br.com.fiap.easycit.backgrounds.LoginBackground
import br.com.fiap.easycit.components.CustomButton
import br.com.fiap.easycit.components.CustomOutlinedTextField

@Composable
fun LoginScreen(navController: NavController) {
    LoginBackground() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)
        ) {
            // ***** EasyCit Logo *****
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "EasyCit",
                    fontSize = 45.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            // ***** Authentication *****
            Column(
                modifier = Modifier
                    .weight(2f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                var usernameState by remember { mutableStateOf("") }
                var passwordState by remember { mutableStateOf("") }
                var checkboxState by remember { mutableStateOf(false) }

                CustomOutlinedTextField( // USUÁRIO
                    value = usernameState,
                    label = "Usuário",
                    placeholder = "Digite seu nome de usuário",
                    onValueChange = { usernameState = it }
                )
                Spacer(modifier = Modifier.height(15.dp))

                CustomOutlinedTextField( // SENHA
                    value = passwordState,
                    label = "Senha",
                    placeholder = "Digite sua senha",
                    onValueChange = { passwordState = it }
                )
                Spacer(modifier = Modifier.height(15.dp))

                Row( // CHECKBOX
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        modifier = Modifier.scale(1.3f),
                        checked = checkboxState,
                        onCheckedChange = { checkboxState = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color.White,
                            uncheckedColor = Color.White
                        )
                    )
                    Text(
                        text = "Lembrar senha",
                        fontWeight = FontWeight.Bold,
                        fontSize = 17.sp,
                        color = Color.White,
                        modifier = Modifier
                            .background(Color.DarkGray.copy(alpha = 0.9f))
                            .padding(6.dp, 2.dp, 6.dp, 2.dp)
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))

                CustomButton( // BOTÃO LOGIN
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(65.dp),
                    text = "LOGIN",
                    fontSize = 20.sp,
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold,
                    onClick = {navController.navigate(("Home"))}
                )
                Spacer(modifier = Modifier.height(25.dp))

                // BOTÕES GOOGLE E FACEBOOK
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    CustomButton(modifier = Modifier.height(90.dp)) { // GOOGLE
                        Image(
                            painter = painterResource(R.drawable.google_icon),
                            contentDescription = ""
                        )
                    }
                    Spacer(modifier = Modifier.width(35.dp))
                    CustomButton(modifier = Modifier.height(90.dp)) { // FACEBOOK
                        Image(
                            painter = painterResource(R.drawable.facebook_icon),
                            contentDescription = ""
                        )
                    }
                }
            }

            // ***** SignUp (footer) *****
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .clickable { navController.navigate("SignUp") },
                    text = "CADASTRE-SE",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.White
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun LoginScreenPreview() {
    val navController = rememberNavController()
    LoginScreen(navController = navController)
}
