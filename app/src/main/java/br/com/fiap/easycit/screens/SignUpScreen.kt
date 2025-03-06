package br.com.fiap.easycit.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.easycit.backgrounds.LoginBackground
import br.com.fiap.easycit.components.CustomButton
import br.com.fiap.easycit.components.CustomOutlinedTextField
import br.com.fiap.easycit.database.repository.UsuarioRepository
import br.com.fiap.easycit.model.Usuario

@Composable
fun SignUpScreen(navController: NavController) {

    val context = LocalContext.current
    val usuarioRepository = UsuarioRepository(context)

    LoginBackground() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp,30.dp,30.dp,90.dp)
        ) {
            // ***** SignUp TextFields *****
            Card(
                modifier = Modifier
                    .fillMaxSize(),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White.copy(alpha = 0.8f)
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp, 15.dp, 20.dp, 20.dp),
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {

                    var cpfState by remember { mutableStateOf("") }
                    var nomeState by remember { mutableStateOf("") }
                    var emailState by remember { mutableStateOf("") }
                    var telefoneState by remember { mutableStateOf("") }
                    var dataNascState by remember { mutableStateOf("") }
                    var cepState by remember { mutableStateOf("") }
                    var nroEnderecoState by remember { mutableIntStateOf(0) }
                    var usernameState by remember { mutableStateOf("") }
                    var passwordState by remember { mutableStateOf("") }

                    Row(
                        Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "INFOS PESSOAIS",
                            fontSize = 15.sp,
                            color = Color.DarkGray
                        )
                        Text(
                            text = "<VOLTAR"
                        )
                    }

                    CustomOutlinedTextField( // CPF
                        value = cpfState,
                        label = "CPF",
                        placeholder = "Digite seu CPF",
                        onValueChange = { cpfState = it }
                    )
                    CustomOutlinedTextField( // NOME
                        value = nomeState,
                        label = "Nome",
                        placeholder = "Digite seu nome completo",
                        onValueChange = { nomeState = it }
                    )
                    CustomOutlinedTextField( // EMAIL
                        value = emailState,
                        label = "E-mail",
                        placeholder = "Digite seu e-mail",
                        onValueChange = { emailState = it }
                    )
                    CustomOutlinedTextField( // TELEFONE
                        value = telefoneState,
                        label = "Telefone",
                        placeholder = "Digite seu telefone",
                        onValueChange = { telefoneState = it }
                    )
                    CustomOutlinedTextField( // DATA NASC
                        value = dataNascState,
                        label = "Data Nasc.",
                        placeholder = "Digite sua data de nascimento",
                        onValueChange = { dataNascState = it }
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        CustomOutlinedTextField( // CEP
                            value = cepState,
                            label = "CEP",
                            placeholder = "Digite seu CEP",
                            modifier = Modifier.width(196.dp),
                            onValueChange = { cepState = it }
                        )
                        CustomOutlinedTextField( // Nº
                            value = nroEnderecoState.toString(),
                            label = "nº",
                            placeholder = "",
                            modifier = Modifier.width(90.dp),
                            onValueChange = {
                                nroEnderecoState = it.toIntOrNull() ?: nroEnderecoState
                            }
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Row(
                        Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = "INFOS DE USUÁRIO",
                            fontSize = 15.sp,
                            color = Color.DarkGray
                        )
                    }

                    CustomOutlinedTextField( // USUÁRIO
                        value = usernameState,
                        label = "Usuário",
                        placeholder = "Crie seu nome de usuário",
                        onValueChange = { usernameState = it }
                    )
                    CustomOutlinedTextField( // SENHA
                        value = passwordState,
                        label = "Senha",
                        placeholder = "Crie sua senha",
                        onValueChange = { passwordState = it }
                    )

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()

                    ) {
                        Checkbox( // CHECKBOX
                            modifier = Modifier.padding(0.dp),
                            checked = false,
                            onCheckedChange = {}
                        )
                        Text(
                            text = "Li e Concordo com os Termos de Uso",
                            fontSize = 14.sp
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    CustomButton(
                        modifier = Modifier
                            .height(70.dp)
                            .fillMaxWidth(),
                        text = "CADASTRAR",
                        color = Color.White,
                        colors = ButtonDefaults.buttonColors(Color.Blue),
                        onClick = {

                            val novoUsuario = Usuario(
                                id = 0,
                                cpf = cpfState,
                                nome = nomeState,
                                email = emailState,
                                telefone = telefoneState,
                                dataNasc = dataNascState,
                                cep = cepState,
                                nroEndereco = nroEnderecoState,
                                username = usernameState,
                                password = passwordState
                            )
                            usuarioRepository.salvar(novoUsuario)
                            navController.navigate("Home")
                        }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun SignUpScreenPreview() {
    val navController = rememberNavController()
    SignUpScreen(navController = navController)
}